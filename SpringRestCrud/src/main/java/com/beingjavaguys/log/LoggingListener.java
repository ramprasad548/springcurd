package com.beingjavaguys.log;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

/**
 * Initialize standard logging framework. <br/>
 * One of the primary purpose of this listener is to override default behavior
 * of 'log4j' framework - loading and relying on configuration file from
 * deployment artifacts. This will require 'server' specific log file location
 * to be hard-wired in the deployment artifacts. <br/>
 * This file will load configuration file from classpath, over-ride log location
 * based on application server's JNDI configuration and initialize log4j with
 * updated log location directory. <br/>
 * 
 * @author Viral Patel
 * @since 02/16/2013
 * 
 */
public class LoggingListener implements ServletContextListener {

	private final static String LOG4J = "/log4j-init.properties";
	private final static Properties log4jProp = new Properties();
	private final static Log logger = LogFactory.getLog(LoggingListener.class);
	private static boolean logInitialize = false;
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		String app = event.getServletContext().getServletContextName();
		System.out.println("***********************************************");
		System.out.println("* ACG - [" + app + "] Startup event received");
		System.out.println("***********************************************");
		try {
			initLog4J();			
			logInitialize = true;
			logger.info("* ACG - [" + app + "] Logging framework initialized");
		}catch(Throwable th){
			System.out.println("* ACG - [" + app + "] Unable to initialize logging framework " + th.toString());
			th.printStackTrace(System.out);
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		String app = event.getServletContext().getServletContextName();
		System.out.println("***********************************************");
		System.out.println("* ACG - [" + app + "] shutdown event received");
		System.out.println("***********************************************");		
		if(logInitialize)
			logger.info("* ACG - [" + app + "] Logging framework shutting down");
		LogManager.shutdown();
	}

	/**
	 * Initialize log4j logger. By default, this is not necessary as long as
	 * log4j config file is created with standard name (ie log4j.properties) and
	 * stored in the classpath.
	 */
	private void initLog4J() throws ServletException {
		InputStream is = null;
		try {
			is = getContextClassLoader().getResourceAsStream(LOG4J);
			log4jProp.load(is);
			String baselogs = "c:\\logs\\";
			try {
				Context ctx = new InitialContext();
				Object o = ctx.lookup("java:comp/env/logs");
				baselogs = (String) javax.rmi.PortableRemoteObject.narrow(o,
						String.class);
				File dir = new File(baselogs);
				if (!dir.exists()) {
					dir.mkdir();
				}
			} catch (Exception ex) {
				System.out.println(baselogs + " missing");
				ex.printStackTrace();
			}

			Enumeration keySet = log4jProp.keys();
			while (keySet.hasMoreElements()) {
				String key = (String) keySet.nextElement();
				if (key.endsWith(".Directory")) {
					log4jProp.setProperty(key, baselogs);
				}
			}
			PropertyConfigurator.configure(log4jProp);			
		} catch (Throwable ex) {
			throw new ServletException(
					"Unable to initialize log4j [log4j-init.properties]", ex);
		} finally {
			try {
				is.close();
			} catch (Exception ex) {
				// ignore
			}
		}
	}

	/**
	 * Return the thread context class loader if available. Otherwise return
	 * null.
	 * 
	 * The thread context class loader is available for JDK 1.2 or later, if
	 * certain security conditions are met.
	 * 
	 * @exception LogConfigurationException
	 *                if a suitable class loader cannot be identified.
	 */
	private ClassLoader getContextClassLoader() throws Exception {
		ClassLoader classLoader = null;

		try {
			// Are we running on a JDK 1.2 or later system?
			Method method = Thread.class.getMethod("getContextClassLoader",
					null);

			// Get the thread context class loader (if there is one)
			try {
				classLoader = (ClassLoader) method.invoke(
						Thread.currentThread(), null);
			} catch (IllegalAccessException e) {
				throw new Exception("Unexpected IllegalAccessException", e);
			} catch (InvocationTargetException e) {
				/**
				 * InvocationTargetException is thrown by 'invoke' when the
				 * method being invoked (getContextClassLoader) throws an
				 * exception.
				 * 
				 * getContextClassLoader() throws SecurityException when the
				 * context class loader isn't an ancestor of the calling class's
				 * class loader, or if security permissions are restricted.
				 * 
				 * In the first case (not related), we want to ignore and keep
				 * going. We cannot help but also ignore the second with the
				 * logic below, but other calls elsewhere (to obtain a class
				 * loader) will trigger this exception where we can make a
				 * distinction.
				 */
				if (e.getTargetException() instanceof SecurityException) {
					; // ignore
				} else {
					// Capture 'e.getTargetException()' exception for details
					// alternate: log 'e.getTargetException()', and pass back
					// 'e'.
					throw new Exception("Unexpected InvocationTargetException",
							e.getTargetException());
				}
			}
		} catch (NoSuchMethodException e) {
			// Assume we are running on JDK 1.1
			classLoader = LogFactory.class.getClassLoader();
		}

		// Return the selected class loader
		return classLoader;
	}
}