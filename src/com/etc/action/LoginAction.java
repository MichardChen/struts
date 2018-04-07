package com.etc.action;

import org.apache.struts.action.Action;

public class LoginAction extends Action {

	private String username; // 用户名
	private String password; // 密码

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 判断用户名和密码是否相同
	public String execute() {
		if (getUsername().equals("cad") && getPassword().equals("123456")) {
			return "success";
		} else {
			return "error";
		}
	}
}
