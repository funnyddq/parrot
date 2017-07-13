package com.hexminds.parrot.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String message;

	public String getMessage() {
		return message;
	}

	@Override
	public String execute() throws Exception {
		message = "Hello World";
		return SUCCESS;
	}
}
