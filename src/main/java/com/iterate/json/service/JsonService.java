package com.iterate.json.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.iterate.json.dto.Data;
import com.iterate.json.dto.Real;
import com.iterate.json.dto.Student;

@Service
public class JsonService 
{
	public Student createStudent() 
	{
		List<Student> studentList = new ArrayList();
		Student student = new Student(1,1,1,1,1,studentList);
		System.out.println("student created");
		for(int i =1;i<=3;i++)
		{
			System.out.println("i : " + i);
			studentList.addAll(getStudent());
		}
		student.setStudent(studentList);		
		return student;
	}
	
	int i = 1;
	public List<Student> getStudent() 
	{
		List<Student> studentList = new ArrayList();
		
		while(i<6)
		{
			Student student = new Student(i,i,i,i,i,studentList);
			studentList.add(student);
			i++;
		}
		
		return studentList;
	}
	
	List<Real> listOfReal = new ArrayList<>();
	
	public void getInfo(Data data) 
	{
		Map<Integer,String> list = new HashMap();
		/*
		 * getData = List<Real>
		 * iterate List of real and call  method
		 */
		for (Real s : data.getData())
		{
			list.put(s.getId(),s.getOrganizationname());
			getId(s.getOrganizationNodes(),list);
		}	
		
		for (int key : list.keySet())
		{
			System.out.println(key + " - " + list.get(key));
		} 
	}
	
	public void getId(List<Real> organizationNode,Map<Integer,String> list) 
	{
		/*
		 * organizationNode = List<Real>
		 * organizationNode is a field of Real Class
		 * iterate organization node
		 */
		for (Real s : organizationNode)
		{
			/*
			 * add id of node into map
			 */
				list.put(s.getId(),s.getOrganizationname());
				/*
				 * if getOrganizationNodes having List<Real> then call recursive method
				 */
				if(s.getOrganizationNodes().size() > 0)
				{
					getId(s.getOrganizationNodes(),list);
				}
		}			
	}
	
}