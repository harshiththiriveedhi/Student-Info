package com.example.mypack.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController

public class Studentcontroller {
@Autowired
	private StudentService studservice;
	@RequestMapping("/StudentsNames")
	public  List<Student> getallnames()
	{
		return studservice.getAllStudent() ;
	}
	@RequestMapping("/StudentsNames/{Name}")
	public Student getparticularname (@PathVariable String  Name)
	{
		return studservice.getname(Name);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/StudentsNames")
	public void addName(@RequestBody Student  st)
	{
		studservice.addname(st);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/StudentsNames/{Name}")
	public void putName(@RequestBody Student  st, @PathVariable String  Name)
	{
		studservice.updatename(Name,st);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/StudentsNames/{Name}")
	public void  deletename (@PathVariable String  Name)
	{
		studservice.deletename(Name);
	}
	
	
}
