package com.globalexceptionhanding.GlobalExceptionHandling.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.globalexceptionhanding.GlobalExceptionHandling.custome.exception.EmptyInputExcepton;
import com.globalexceptionhanding.GlobalExceptionHandling.custome.exception.NoDataFoundException;

@ControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(EmptyInputExcepton.class)
	public ResponseEntity<String> EmptyInputExeption(EmptyInputExcepton emptyInputExcepton) {
		return new ResponseEntity<String>("Input field is empty,Please look into it", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<String> noDataFoundException(EmptyInputExcepton emptyInputExcepton) {
		System.out.println("No data found");
		return new ResponseEntity<String>("No Data Found", HttpStatus.NOT_FOUND);
	}

}
