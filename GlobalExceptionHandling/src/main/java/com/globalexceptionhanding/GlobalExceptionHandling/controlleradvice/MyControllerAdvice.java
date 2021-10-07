package com.globalexceptionhanding.GlobalExceptionHandling.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.ControllerAdviceBean;

import com.globalexceptionhanding.GlobalExceptionHandling.custome.exception.EmptyInputExcepton;
import com.globalexceptionhanding.GlobalExceptionHandling.custome.exception.NoDataFoundException;

/**
 * 
 * @author Vaibhav
 * Controller Advice Base Class
 *
 */
@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(EmptyInputExcepton.class)
	public ResponseEntity<String> emptyInputExeption(EmptyInputExcepton emptyInputExcepton) {
		return new ResponseEntity<String>("Input field is empty,Please look into it", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<String> noDataFoundException(NoDataFoundException noDataFoundException) {
		return new ResponseEntity<String>("No Data Found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullPointerExceptionEntity(NullPointerException nullPointerException){
		return new ResponseEntity<String>("Somethings went wrong .. please try after sometime.....!!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	

}
