package com.iterate.json.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iterate.json.dto.Data;
import com.iterate.json.dto.Student;
import com.iterate.json.service.JsonService;

@RestController
public class Controller 
{
	@Autowired
	JsonService service;
	
	@GetMapping("/")
	public String test()
	{
		return "working";
	}
	
	@GetMapping("/obj")
	public Student json()
	{
		return service.createStudent();
	}
	@GetMapping("/json")
	public String json(@RequestBody Data d)
	{
		System.out.println(d.toString());
		service.getInfo(d);
		return "ok";
	}
}