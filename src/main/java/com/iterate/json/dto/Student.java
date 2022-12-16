package com.iterate.json.dto;

import java.util.List;

public class Student {
	private int name;
	private int phone;
	private int enroll;
	private int clg;
	private int sem;
	private List<Student> student;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int name, int phone, int enroll, int clg, int sem, List<Student> student) {
		super();
		this.name = name;
		this.phone = phone;
		this.enroll = enroll;
		this.clg = clg;
		this.sem = sem;
		this.student = student;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getEnroll() {
		return enroll;
	}

	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}

	public int getClg() {
		return clg;
	}

	public void setClg(int clg) {
		this.clg = clg;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", enroll=" + enroll + ", clg=" + clg + ", sem=" + sem
				+ "";
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}



}