package com.tues.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{

private int roll;
private String name;
private int age;

public Student(int roll, String name, int age) {
	
	this.roll = roll;
	this.name = name;
	this.age = age;
}

@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
}

@Override
public int compareTo(Student obj) {
	// TODO Auto-generated method stub
	if(this.roll==obj.roll)
	{
		return 0;
	}
	else if(this.roll>obj.roll)
	{
		return 1;
	}
	else 
	{
		return -1;
	}
	
}


}


public class ObjectSorting {
	
	
	public static void main(String args[])
	{
		
		Student s1=new Student(5, "ravi", 35);
		Student s2=new Student(1, "mohan", 22);
		Student s3=new Student(6, "sham", 15);
		Student s4=new Student(8, "gobind", 26);
		Student s5=new Student(9, "roshan", 40);
				
		
		List<Student> studentList =new ArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		
	
		//Student --> 100, abc, 400
		
		
		Collections.sort(studentList,Collections.reverseOrder());
		
		System.out.println(studentList);
		
		//CRUD
		//CReate  --Add
		//REadn  ==toString
		//Update-- Replace
		//Delete--remove
		
		//Sorting --  Collections.Sort()
		//Searching --get()
		
		
		//Write  a program to Create Pen Class..and perform the sorting using band name and price 
	}

}
