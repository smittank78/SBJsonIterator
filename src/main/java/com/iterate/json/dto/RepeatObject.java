package com.iterate.json.dto;

import java.util.List;

public class RepeatObject {
	private List<Student> student;

	
	
	public RepeatObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RepeatObject(List<Student> student) {
		super();
		this.student = student;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Number [student=" + student + "]";
	}
	
}