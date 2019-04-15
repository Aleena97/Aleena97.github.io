package com.bpmn.webapp.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class Login {
	
	private String Username;
	private String Password;
	
	
	public String getUsername() {
		return Username;
	}
	
	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public String can_login() {
		if (Username.equalsIgnoreCase("demo") && Password.equalsIgnoreCase("demo")) {
			return "Can Login";
		} 
		else if (Username.equalsIgnoreCase("admin") && Password.equalsIgnoreCase("admin")) {
			return "Admin Login";
		}
		else {
			return "Login Failed";
		}
	}
	

}
