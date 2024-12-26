package com.sivaecom.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest webRequest) {
		
		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), webRequest.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleGlobalException(Exception ex, WebRequest webRequest) {
		
		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), webRequest.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
