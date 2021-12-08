package com.tues.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





class AgeComparator implements Comparator<Student1>
{
	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		if(s1.getAge()==s2.getAge())
		{
			return 0;
		}
		else if(s1.getAge()>s2.getAge())
		{
		return 1;
		
		}
		else
		{
			return -1;
		}
	}
	
	
}
class RollNoComparator implements Comparator
{

	@Override
	public int compare(Object student1, Object student2) {
		// TODO Auto-generated method stub
		Student1 s1=(Student1)student1;
		Student1 s2=(Student1)student2;
		
		if(s1.getRoll()==s2.getRoll())
		{
			return 0;
		}
		else if(s1.getRoll()>s2.getRoll())
		{
		return 1;
		
		}
		else
		{
			return -1;
		}
		
	}
	
	
}


class NameComparator implements Comparator
{

	@Override
	public int compare(Object student1, Object student2) {
		// TODO Auto-generated method stub
		Student1 s1=(Student1)student1;
		Student1 s2=(Student1)student2;
		
		//return s1
	
		
	}
	
	
}

class Student1
{
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int roll;
	private String name;
	private int age;

	public Student1(int roll, String name, int age) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

	
}


public class ComparatorDemo {

	public static void main(String arg[])
	{
		Student1 s1=new Student1(5, "ravi", 35);
		Student1 s2=new Student1(1, "mohan", 22);
		Student1 s3=new Student1(6, "sham", 15);
		Student1 s4=new Student1(8, "gobind", 26);
		Student1 s5=new Student1(9, "roshan", 40);
				
		
		List<Student1> studentList =new ArrayList<Student1>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);	

		Collections.sort(studentList,new RollNoComparator());

		 System.out.println(studentList);
         //int
		 //string
		 //float
		 //double
		 //Char
		
	}
	
}
