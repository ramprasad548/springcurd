/**
 * 
 */
package com.beingjavaguys.common.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.apache.log4j.Logger;

import com.beingjavaguys.common.enums.CHANNEL_ENUM;
import com.beingjavaguys.common.enums.ERROR_CODE_ENUM;
import com.beingjavaguys.common.exception.BankLosException;

public class LosUtils {
	
	static Logger log = Logger.getLogger(LosUtils.class);
	public static boolean isNullOrEmpty(Object obj){
		boolean returnVal = false;
		if(obj == null){
			returnVal = true;
		} else {
			if(obj.getClass().isAssignableFrom(Collection.class)){
				if(((Collection)obj).size()==0){
					returnVal = true;
				}
			} else {
				if(obj.getClass().isAssignableFrom(String.class)){
					if (String.valueOf(obj).trim().length()==0){
						returnVal= true;
					}
				}
			}
		}
		return returnVal;
		
	}	
		public static boolean isAnyNullOrEmpty(Object... objs){
			boolean retVal = false;
			for(Object obj:objs){
				retVal = retVal || isNullOrEmpty(obj);
				if(retVal){
					return true;
				}
			}
		
		
		return retVal;
	
		}
		
		public static Date convertStringToDate(String date) throws BankLosException
		{
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date newDate = formatter.parse(date);
				
				return newDate;
			} catch (ParseException e) {
				throw new BankLosException(ERROR_CODE_ENUM.DATE_FORMAT_EXCEPTION.getErrorCode(),"Date :"+date,e.getMessage(),e.getCause());
			}		
		}
		
		public static String convertDateToString(Date date)
		{
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String convertedDate=null;
			if(date!=null)
			{
				convertedDate=formatter.format(date);
			}
			return convertedDate;		
		}
		
		public static String convertDteToString(Date date)
		{
			SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy");
			String convertedDate=null;
			if(date!=null)
			{
				convertedDate=formatter.format(date);
			}
			return convertedDate;		
		}
		
		/**
		 * @param date
		 * @return Converted Date
		 */
		public static String dateToStringMMDDYYYY(Date date)
		{
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String convertedDate=null;
			if(date!=null)
			{
				convertedDate=formatter.format(date);
			}
			return convertedDate;		
		}
		
		/**
		 * @param loanAmount
		 * @param term
		 * @param apr
		 * @return EMI
		 */
		public static double calculateEMI(double loanAmount,int term,double apr )
		{
			  DecimalFormat f = new DecimalFormat("##.00");
			  double R = (double)(apr / 12) / 100;
			  double emi =  Double.parseDouble(f.format((loanAmount * R * (Math.pow((1 + R), term)) / ((Math.pow((1 + R), term)) - 1))));
			  return emi;
		}
		
		/**
		 * @param loanAmount
		 * @param term
		 * @param apr
		 * @return EMI
		 */
		public static double calculateHelocEMI(double loanAmount,double apr )
		{
			  DecimalFormat f = new DecimalFormat("##.00");
			  double R = (double)(apr / 12) / 100;
			  double emi =  Double.parseDouble(f.format(loanAmount * R));
			  return emi;
		}
		
		public static <T> boolean isPresent(T t, T...ts ){
			if(t == null || ts == null){
				return false;
			}
			if(ts.length>0){
			 //return ArrayUtils.contains(ts, t);
			}
			return false;
		}
		
		/**
		 * @param date
		 * @param nthday
		 * @return ExpiryDate
		 */
		public static Date createDateWithNDays(Date date,Integer nthday)
		{
			 Calendar c  = Calendar.getInstance(); 
			 c.setTime(date);
			 c.add(Calendar.DAY_OF_MONTH, nthday);
			 Date expire = c.getTime();
			 return expire;
		}
		
		public static int getAge(String birthDate){
			int age = -1;
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

				Date	dateOfBirth = formatter.parse(birthDate);
				Calendar dob = Calendar.getInstance();  
				dob.setTime(dateOfBirth);  
				Calendar today = Calendar.getInstance();  
				age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);  
				if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
					age--;  
				} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
						&& today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
					age--;  
				}

			} catch (ParseException e) {
				log.error(e.getMessage());
			}
			return age;
		}
		
		public static Boolean convertStringToBoolean(String str)
		{
			if(ObjectValidator.isEmpty(str))
				return false;
			
			if(str.equalsIgnoreCase("Y"))
				return true;
			return false;
		}
		public static String convertBooleanToString(Boolean status)
		{
			if(status)
				return "Y";
			return "N";
		}
		public static Integer randomNumberGenerator()
		{ 
			int minimum = 10000000;
			int maximum = 999999999;
			return ((int) (Math.random()*(maximum - minimum))) + minimum;
						
	    }
		public static Integer daysBetween(String d1) throws BankLosException
		   {
			Date givenDate= LosUtils.convertStringToDate(d1);
		      return (int)(((givenDate.getTime() - new Date().getTime()) / (1000 * 60 * 60 * 24)) +1);
		   }
		
		public static String createStrExpiryDate(Date date,Integer nthday)
		{
			 Calendar c  = Calendar.getInstance(); 
			 c.setTime(date);
			 c.add(Calendar.DAY_OF_MONTH, nthday);
			 Date expire = c.getTime();
			 return LosUtils.dateToStringMMDDYYYY(expire);
		}
		
		public static String convertDateTimeToString(Date date)
		{
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			String convertedDate=null;
			if(date!=null)
			{
				convertedDate=formatter.format(date);
			}
			return convertedDate;		
		}
		
		public static Date convertStringTODateTime(String date) throws BankLosException
		{
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				Date newDate = formatter.parse(date);
				
				return newDate;
			} catch (ParseException e) {
				throw new BankLosException(ERROR_CODE_ENUM.DATE_FORMAT_EXCEPTION.getErrorCode(),"Date :"+date,e.getMessage(),e.getCause());
			}		
		}
		
		public static Date convertStringTODateTimeY(String date) throws BankLosException
		{
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date newDate = formatter.parse(date);
				
				return newDate;
			} catch (ParseException e) {
				throw new BankLosException(ERROR_CODE_ENUM.DATE_FORMAT_EXCEPTION.getErrorCode(),"Date :"+date,e.getMessage(),e.getCause());
			}		
		}
		
		public static String getTimeStamp(Date date)
		{
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a");
			String convertedDate=null;
			if(date!=null)
			{
				convertedDate=formatter.format(date);
			}
			return convertedDate;		
		}
		
		/**
		 * @param ltv
		 * @param rate
		 * @return Min/Max LTV 
		 */
		public static Double calculateLtv(Double ltv,Integer rate)
		{
			DecimalFormat df = new DecimalFormat("#");
			
			Double calculatedLtv=0.0;
			calculatedLtv=(ltv*rate)/100;
			return Double.parseDouble(df.format(calculatedLtv));
			
		}
		public Boolean isWebChannel(String channel)
		{
			if(CHANNEL_ENUM.AAACOM.getDesc().equalsIgnoreCase(channel))
			{
				return true;
			}
			return false;
		}
}
