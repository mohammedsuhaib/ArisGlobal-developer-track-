package com;
class Emp{
	int id;
	String name;
	Address a;
	Emp(int id,String name,Address x){
		this.id=id;
		this.name=name;
		this.a=x;
	}
	void display() {
		System.out.println(this.id+" "+this.name+" ");
		a.display();
	}
}
public class Address {
	String city,state,country;
	public Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
	void display() {
	}
	public static void main(String args[]) {
		Address a=new Address("Mys","Kar","Ind");
		Address b=new Address("Chmgr","Kar","Ind");
		Emp ac=new Emp(5,"Suhaib",a);
		Emp a1=new Emp(7,"Sooban",b);
		ac.display();
		a1.display();
	}
}
