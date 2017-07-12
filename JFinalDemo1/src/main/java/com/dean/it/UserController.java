package com.dean.it;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class UserController extends Controller {
	@ActionKey("/login")
	public void login(){
		System.out.println("in the login method!");
		renderText("welcome, login success!");
	}
}
