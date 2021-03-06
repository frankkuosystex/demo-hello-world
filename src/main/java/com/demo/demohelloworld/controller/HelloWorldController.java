package com.demo.demohelloworld.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
    public String sayHello() {
        return "Hello World in Spring Boot! Test for Jenkins!";
    }
	
	@RequestMapping("/time")
    public String showTime() {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String strDate = sdFormat.format(date);
        return "ηΎε¨ζι:"+strDate;
    }
	
	@RequestMapping("/uuid")
    public String getUuid() {
		UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        
        return uuidAsString;
    }
}
