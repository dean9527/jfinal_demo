package com.dean.it.controller;

import com.dean.it.model.User;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class LoginController extends Controller{
	
	public void index(){
		System.out.println("This is index method...");
	}
	
	@ActionKey("/login/getUser")
	public void getUser(){
		User user = getBean(User.class);
		System.out.println("user name: " + user.getName() + ", password: " + user.getPassword());
		System.out.println("This is login method...");
		renderText("Welcome " + user.getName() + "!");
	}
}
