package com.example.mypack.student;

public class Student {
	
	private String Name;
	private int id;
	private String course;
	private String Section;
	public Student()
	{
		
	}
	
	public Student(String name, int id, String course, String section) {
		super();
		this.Name = name;
		this.id = id;
		this.course = course;
		this.Section=section;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}


}
