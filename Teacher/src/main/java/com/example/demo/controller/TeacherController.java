package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

public class TeacherController {

	@Autowired
	private TeacherService ts;
	
	@GetMapping("/")
	public String Home() {
		return new String("hello world");
		
	}
	@PostMapping("add") //http method that communicate 
	public void add(@RequestBody Teacher emp) {
		//TODO: process POST request
		
		ts.add(emp);
	}
	
	@GetMapping("display")
	public List<Teacher> display() {
		return ts.display();
	}
}
