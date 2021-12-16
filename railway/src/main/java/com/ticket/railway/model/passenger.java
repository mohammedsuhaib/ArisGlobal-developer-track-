package com.ticket.railway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class passenger implements Comparable {
	public passenger() {
		
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pid")
	private long pid;
	
	public passenger(long pid, String name, int age, char gender) {
		
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "passenger [pid=" + pid + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private char gender;

	@Override
	public int compareTo(Object o) {
		 if (((passenger) o).getName().toUpperCase().compareTo(getName().toUpperCase()) == 0){
	            return 1;
	        }
	        else{
	            return -1;
	        }
	}
}
