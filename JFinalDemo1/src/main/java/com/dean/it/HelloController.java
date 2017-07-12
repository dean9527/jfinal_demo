package com.dean.it;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
	public void index(){
		//renderText("Hello JFinal World.");
		render("/hello.jsp");
	}
}
