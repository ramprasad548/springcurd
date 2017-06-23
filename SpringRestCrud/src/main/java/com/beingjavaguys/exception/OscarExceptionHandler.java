package com.beingjavaguys.exception;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(annotations = RestController.class) 
public class OscarExceptionHandler extends ResponseEntityExceptionHandler {/*

	@Autowired
	public Environment env;

	*//**
	 * Handles Web service Exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	
	 * @ExceptionHandler({ WebServiceException.class })
	 * 
	 * @ResponseBody public BankBaseVO
	 * handleWebServiceException(WebServiceException e, HttpServletRequest
	 * wr,HttpServletResponse response) { APIStatusVO httpStatusVO = new
	 * APIStatusVO(900); ErrorDetailVO errorDetailVO = new ErrorDetailVO();
	 * List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
	 * errorDetailVO.setCode(ERROR_CODE_ENUM.WEB_SERVICE_EXCEPTION.getErrorCode(
	 * )); errorDetailVO.setMessage(ERROR_CODE_ENUM.WEB_SERVICE_EXCEPTION.
	 * getErrorDesc()+e.getMessage()); errorList.add(errorDetailVO);
	 * httpStatusVO.setError(errorList); return errorResponse(httpStatusVO,
	 * wr,response,e); }
	 
	*//***
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ NoSuchFieldException.class })
	@ResponseBody
	public BankBaseVO handleNoSuchFieldException1(NoSuchFieldException e, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.NO_SUCH_FIELD_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.NO_SUCH_FIELD_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * This method invokes which required fields are missing
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ NotReadablePropertyException.class })
	@ResponseBody
	public BankBaseVO handleNotReadableException(NotReadablePropertyException e, HttpServletRequest wr,
			HttpServletResponse response) {

		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.INPUT_DATA_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.INPUT_DATA_EXCEPTION.getErrorDesc());
		errorDetailVO.setField(e.getPropertyName());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles the Data access exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ DataAccessException.class })
	@ResponseBody
	public BankBaseVO handleDataAccessException(DataAccessException e, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);

		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.DATA_ACCESS_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.DATA_ACCESS_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles the customized BankLos exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ BankLosException.class })
	@ResponseBody
	public BankBaseVO handleBankLosException(BankLosException e, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO();
		httpStatusVO.setCode(900);
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		ErrorDetailVO errorObj = null;
		if (null != e.getResult()) {
			for (ObjectError obj : e.getResult().getAllErrors()) {
				errorObj = new ErrorDetailVO();
				if (null != obj.getCode()) {
					errorObj.setCode(Integer.parseInt(obj.getCode()));
				} else {
					errorObj.setCode(99999);
				}
				errorObj.setMessage(env.getProperty(obj.getDefaultMessage()));
				errorObj.setField(obj.getObjectName());
				errorList.add(errorObj);
			}

		} else if (null != e.getErrors()) {
			errorList = e.getErrors();
		} else {
			errorObj = new ErrorDetailVO();
			errorObj.setCode(e.getCode());
			if (null != e.getStatus()) {
				errorObj.setMessage(e.getStatus());
			} else {
				if (null != e.getCause()) {
					errorObj.setMessage(e.getCause().toString());
				}
			}
			errorObj.setField(e.getField());
			errorList.add(errorObj);
		}
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles the customized BankLos exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ BankLosBusinessException.class })
	@ResponseBody
	public BankBaseVO BankLosBusinessException(BankLosBusinessException e, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO();
		httpStatusVO.setCode(900);
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		ErrorDetailVO errorObj = null;
		if (null != e.getResult()) {
			for (ObjectError obj : e.getResult().getAllErrors()) {
				errorObj = new ErrorDetailVO();
				if (null != obj.getCode()) {
					errorObj.setCode(Integer.parseInt(obj.getCode()));
				} else {
					errorObj.setCode(99999);
				}
				errorObj.setMessage(env.getProperty(obj.getDefaultMessage()));
				errorObj.setField(obj.getObjectName());
				errorList.add(errorObj);
			}

		} else if (null != e.getErrors()) {
			errorList = e.getErrors();
		} else {
			errorObj = new ErrorDetailVO();
			errorObj.setCode(e.getCode());
			errorObj.setMessage(e.getStatus());
			errorObj.setField(e.getField());
			errorList.add(errorObj);
		}
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles Cannot Acquired Lock exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ CannotAcquireLockException.class })
	@ResponseBody
	public BankBaseVO handleCannotAcquireLockException(Exception e, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.CANNNOT_CREATE_TRANSCTION_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.CANNNOT_CREATE_TRANSCTION_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles InvocationTarget exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ InvocationTargetException.class })
	@ResponseBody
	public BankBaseVO handleInvocationTargetException(Exception e, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.INVOCATION_TARGET_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.INVOCATION_TARGET_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//***
	 * Handles IllegalArgument exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ IllegalArgumentException.class })
	@ResponseBody
	public BankBaseVO handleIllegalArgumentException(Exception e, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.ILLEGAL_ARGUMENT_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.ILLEGAL_ARGUMENT_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles Class cast exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ ClassCastException.class })
	@ResponseBody
	public BankBaseVO handleClassCastException(Exception e, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.CLASS_CAST_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.CLASS_CAST_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles Conversion Failure exception
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ ConversionFailedException.class })
	@ResponseBody
	public BankBaseVO handleConversionFailedException(Exception e, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.CONVERSION_FAILED_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.CONVERSION_FAILED_EXCEPTION.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handle CannotCreateTransactionException failures
	 *//*
	@ExceptionHandler({ CannotCreateTransactionException.class })
	@ResponseBody
	public BankBaseVO handleJDBCConnectionException(Exception e, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO();
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(4000);
		errorDetailVO.setMessage("Database Connection Problem!!!!");
		httpStatusVO.setCode(900);
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Handles Conflict in case of concurrent modification
	 * 
	 * @param ex
	 * @param wr
	 * @return
	 *//*

	@ExceptionHandler({ ObjectOptimisticLockingFailureException.class })
	@ResponseBody
	public BankBaseVO handleLockingException(Exception ex, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.OBJECT_OPTIMISTIC_LOCKING_FAILURE_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.OBJECT_OPTIMISTIC_LOCKING_FAILURE_EXCEPTION.getErrorDesc());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);

		return errorResponse(httpStatusVO, wr, response, ex);
	}

	*//**
	 * Handles Data Integrity Violation exception
	 * 
	 * @param ex
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ DataIntegrityViolationException.class })
	@ResponseBody
	public BankBaseVO handleDataIntegrityException(Exception ex, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.DATA_INTEGRITY_VIOLATION_EXCEPTION.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.DATA_INTEGRITY_VIOLATION_EXCEPTION.getErrorDesc());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);

		return errorResponse(httpStatusVO, wr, response, ex);
	}

	*//**
	 * Handles Data Integrity Violation exception
	 * 
	 * @param ex
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ NoSuchApplicationException.class })
	@ResponseBody
	public BankBaseVO handleNoSuchApplicationException(Exception ex, HttpServletRequest wr,
			HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.APPLICATION_NOT_FOUND.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.APPLICATION_NOT_FOUND.getErrorDesc());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);

		return errorResponse(httpStatusVO, wr, response, ex);
	}

	*//**
	 * Handles all uncategorized exceptions
	 * 
	 * @param e
	 * @param wr
	 * @return
	 *//*
	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public BankBaseVO handleAnyException(Exception e, HttpServletRequest wr, HttpServletResponse response) {
		APIStatusVO httpStatusVO = new APIStatusVO(900);
		ErrorDetailVO errorDetailVO = new ErrorDetailVO();
		List<ErrorDetailVO> errorList = new ArrayList<ErrorDetailVO>();
		errorDetailVO.setCode(ERROR_CODE_ENUM.Exception.getErrorCode());
		errorDetailVO.setMessage(ERROR_CODE_ENUM.Exception.getErrorDesc() + e.getMessage());
		errorList.add(errorDetailVO);
		httpStatusVO.setError(errorList);
		return errorResponse(httpStatusVO, wr, response, e);
	}

	*//**
	 * Set the key identifier values into response
	 * 
	 * @param apiStatusVO
	 * @param wr
	 * @param ex
	 * @return
	 *//*
	public BankBaseVO errorResponse(APIStatusVO apiStatusVO, HttpServletRequest wr, HttpServletResponse response,
			Exception ex) {

		KeyIdentifierVO identiferObj = (null != wr.getAttribute("identifier")
				? (KeyIdentifierVO) wr.getAttribute("identifier") : null);
		BankBaseVO bankBase = new BankBaseVO();
		bankBase.setApiStatus(apiStatusVO);
		bankBase.setIdentifier(identiferObj);
		CreditSnapIdentifierVO csIdentifier = new CreditSnapIdentifierVO();
		csIdentifier.setMappingScreen("error.html");
		csIdentifier.setUriEndPoint("error");
		bankBase.setCsIdentifier(csIdentifier);
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", wr.getMethod());
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", wr.getHeader("Access-Control-Request-Headers"));
		return bankBase;
	}
*/}
