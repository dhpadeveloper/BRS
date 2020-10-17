package com.padh.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AgentNotFoundException extends RuntimeException {

	public AgentNotFoundException() {
		super();
	}
	public AgentNotFoundException(String messege) {
		super(messege);
	}
}
