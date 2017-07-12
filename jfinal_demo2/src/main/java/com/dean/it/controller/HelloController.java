package com.dean.it.controller;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
	public void index(){
		renderText("此index是一个action方法");
	}
	public void test(){
		String userName = this.getPara("userName");
		System.out.println("userName: " + userName);
		renderText("此test是一个action方法");
	}
}
