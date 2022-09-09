package com.example.mypack.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<Student> s =new ArrayList<>(Arrays.asList(
			new Student("Harshith", 1, "CSE","A"),
			new Student("Shanmukh",2,"ECE","B"),
			new Student("Sandeep",3,"EEE","A"),
			new Student("Vinay",4,"AI","A")
			));
    public List<Student> getAllStudent()
    {
    	return s;
    }
    public Student getname(String Name)
    {
    	return s.stream().filter(t ->t.getName().equals(Name)).findFirst().get();
    }
	public void addname(Student st) {
		  s.add(st);
		
	}
	public void updatename(String Name, Student st) {
		for(int i=0;i<s.size();i++) 
		{
			Student nm=s.get(i);
			if(nm.getName().equals(Name))
			{
				s.set(i,st);
				return;
			}
		}
		
		
	}
	public void deletename(String Name) {
		// TODO Auto-generated method stub
		s.removeIf(t->t.getName().equals(Name));
		
	}
}
