package com.exponent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/log")
	public void getMsg() {

		System.out.println("Hello Im get Msg ");
		System.out.println("your Fronted Request is here !!!");
		System.out.println("And there name is log ");
	}

}
