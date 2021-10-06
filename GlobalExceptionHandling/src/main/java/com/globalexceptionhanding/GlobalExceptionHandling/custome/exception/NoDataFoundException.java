package com.globalexceptionhanding.GlobalExceptionHandling.custome.exception;

import org.springframework.stereotype.Component;

@Component
public class NoDataFoundException extends RuntimeException {

	private String errorCode;

	private String errorMsg;

	public NoDataFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoDataFoundException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "EmptyInputExcepton [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}
}
