package com.globalexceptionhanding.GlobalExceptionHandling.custome.exception;

import org.springframework.stereotype.Component;

@Component
public class EmptyInputExcepton extends RuntimeException {

	private String errorCode;

	private String errorMsg;

	public EmptyInputExcepton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmptyInputExcepton(String errorCode, String errorMsg) {
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
