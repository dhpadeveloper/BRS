package com.padh.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AgentNotFoundException.class)
	protected ResponseEntity<Object> handleExceptionInternal(AgentNotFoundException ex, WebRequest request) {
		CustomErrorResponse error = new CustomErrorResponse();
		error.setError(ex.getMessage());
		error.setTimestamp(LocalDateTime.now());
		error.setDetail(request.getDescription(false));
        error.setStatus(HttpStatus.NOT_FOUND.value());		
		return new ResponseEntity(error,HttpStatus.NOT_FOUND);
}
}