/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: BankLoggingAspect.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  0.1   Apr 1, 2015      	Sreeram		       Initial Version
/ ********************************************************************/
package com.beingjavaguys.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import com.beingjavaguys.base.ILogExceptionService;
import com.beingjavaguys.common.exception.BankLosBusinessException;
import com.beingjavaguys.common.exception.BankLosException;
import com.beingjavaguys.vo.base.BankBaseVO;

@Aspect
public class BankLoggingAspect {

	static Logger log = Logger.getLogger(BankLoggingAspect.class);
	@Autowired
	ILogExceptionService  logExceptionService;
	
	@Pointcut("execution(public * com.beingjavaguys..*.*(..))")
	public void aspectjLoadTimeWeaving() {

	}

	@Around("aspectjLoadTimeWeaving()")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {StopWatch sw = new StopWatch(getClass().getSimpleName());
		try {
			sw.start(pjp.getSignature().getName());
			return pjp.proceed();
		} finally {
			sw.stop();
			log.info(sw.getLastTaskName() + " execution time: "
					+ sw.getTotalTimeSeconds()+ " seconds");
		}
	}

	
	@Before("execution(public * com.beingjavaguys..*.*(..))")
	public void doBefore(JoinPoint jp) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
	}
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(ui,tranId,..)")
	public void doBefore(JoinPoint jp,Long ui, Long tranId) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName() + "AppId:"+ui+", tranId:"+tranId);
	}
	/*
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(prescreenOfferVO,..)")
	public void doBefore(JoinPoint jp,PrescreenOfferVO prescreenOfferVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+prescreenOfferVO.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(offerDeclineVO,..)")
	public void doBefore(JoinPoint jp,OfferDeclineVO offerDeclineVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
			log.info("***********Input Request:"+offerDeclineVO.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(offerCollateral,..)")
	public void doBefore(JoinPoint jp,OfferCollateralVO offerCollateral) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+offerCollateral.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(offerFinance,..)")
	public void doBefore(JoinPoint jp,OfferFinancialVO offerFinance) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+offerFinance.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(appWithdrawReason,..)")
	public void doBefore(JoinPoint jp,AppWithdrawReasonVO appWithdrawReason) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+appWithdrawReason.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(loanDocument,..)")
	public void doBefore(JoinPoint jp,LoanDocumentVO loanDocument) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+loanDocument.toString());
	}*/
	
	/*@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(bankBaseVO,..)")
	public void doBefore(JoinPoint jp,BankBaseVO bankBaseVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+bankBaseVO.toString());
	}*/
	
	/*@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(dealerEmailVo,..)")
	public void doBefore(JoinPoint jp,DealerEmailVO dealerEmailVo) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+dealerEmailVo.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(dealerShipVo,..)")
	public void doBefore(JoinPoint jp,DealerShipVO dealerShipVo) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+dealerShipVo.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(loanEsignDocumentVO,..)")
	public void doBefore(JoinPoint jp,LoanESignedDocumnetVO loanEsignDocumentVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+loanEsignDocumentVO.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(ltvOverrideVO,..)")
	public void doBefore(JoinPoint jp,LtvOverrideVO ltvOverrideVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+ltvOverrideVO.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(loanApplicationVO,..)")
	public void doBefore(JoinPoint jp,LoanApplicationVO loanApplicationVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+loanApplicationVO.toString());
	}
	
	@Before("execution(public * com.beingjavaguys..*.*(..))&&"+"args(refiOfferVO,..)")
	public void doBefore(JoinPoint jp,RefiOfferWarrantyVO refiOfferVO) {
		log.info("Before entering : "
				+ jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName());
		log.info("***********Input Request:"+refiOfferVO.toString());
	}
*/	

	@AfterReturning(pointcut = "execution(public * com.beingjavaguys..*.*(..))", returning = "result")
	public void doAfterReturning(JoinPoint jp, Object result) {
		log.info(jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName() + " execution completed!");
		log.info(jp.getSignature().getName() + " return values : "
				+ result.toString());
	}

	@AfterThrowing(pointcut = "execution(public * com.beingjavaguys..*.*(..))", throwing = "error")
	public void doAfterThrowing(JoinPoint jp, Throwable error) {
		
		log.error(jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName() + " exception :");
		if(null!=(jp.getArgs()[0])){
			if(((jp.getArgs()[0]) instanceof BankBaseVO)){
				log.error("UI:"+((BankBaseVO)jp.getArgs()[0]).getIdentifier().getUi());
				log.error("ALOS Application Id:"+((BankBaseVO)jp.getArgs()[0]).getIdentifier().getAppId());
				log.error("TranId:"+((BankBaseVO)jp.getArgs()[0]).getIdentifier().getTranId());
				log.error("Channel:"+((BankBaseVO)jp.getArgs()[0]).getIdentifier().getChannel());
				log.error("User:"+((BankBaseVO)jp.getArgs()[0]).getIdentifier().getUser());
			}
		}
		
		if(error instanceof BankLosBusinessException){
			BankLosBusinessException blbEx = (BankLosBusinessException)error;
			if(null!=blbEx.getStatus()){
			log.error("Status:"+blbEx.getStatus());
			}else{
				log.error("Status:"+blbEx.getCause());
			}
			log.error("Error Message:"+blbEx.getField());
		}else	if(error instanceof BankLosException){
			BankLosException blEx = (BankLosException)error;
			if(null!=blEx.getStatus()){
				log.error("Status:"+blEx.getStatus());
				}else{
					log.error("Status:"+blEx.getCause());
				}
			log.error("Error Message:"+blEx.getField());
			log.error("Error:",error);
		}else{
			log.error("Error Message:"+error.getMessage());
			log.error("Error:",error);
		}
		//For Phase1 we are not logging the exceptions into AI.LOGS table
		/*logExceptionService.logException(baseVO,jp.getTarget().getClass().getSimpleName() + "."
				+ jp.getSignature().getName(),error);
		*/
		
	}
}