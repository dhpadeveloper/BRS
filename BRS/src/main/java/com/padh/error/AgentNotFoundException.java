package com.padh.error;

public class AgentNotFoundException extends RuntimeException {

	public AgentNotFoundException() {
		super();
	}
	public AgentNotFoundException(String messege) {
		super(messege);
	}
}
