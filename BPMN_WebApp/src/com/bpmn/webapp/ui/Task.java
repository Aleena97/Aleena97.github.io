package com.bpmn.webapp.ui;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import org.camunda.bpm.engine.FormService;

@Named
@ManagedBean
@Scope("session")
public class Task {
	
	private String key;
	private String id;
	
    private FormService formService; 
	  
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public void submit_form(String label, Object variable) { 
		Map<String, Object> variables = new HashMap<String, Object>(); variables.put(label, variable);
		formService.submitTaskForm(id, variables); 
	}
	
	public void save_form(String label, Object variable) {
	
		//check database for previous entries using task id
		//if existing entry 
			//check database for which variables saved
			//update existing variables
			//add new variables
		//else
			//add new form entry
			//add new variable entries
	}

}
