package com.example.demo.model;

import java.util.Date;

public class Todo {
	private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;
    
    public Todo(int i, String string, String string2, Date date, boolean b) {
    	this.id = i;
    	this.user = string;
    	this.desc = string2;
    	this.targetDate = date;
    	this.isDone = b;
	}
	
	public String getUser(Todo t) {
		return t.user;
	}
} 
