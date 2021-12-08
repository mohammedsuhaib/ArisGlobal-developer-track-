package com;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
@FunctionalInterface
interface MyInterface {

    // abstract method
    String strbyc (Person[] n);
}
class Person{
	String name;
	String lname;
	
	public Person(String name, String lname) {
		super();
		this.name = name;
		this.lname = lname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
class LnameComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1,Object o2) {
		// TODO Auto-generated method stub
		Person s1=(Person)o1;  
		Person s2=(Person)o2;  
		  
		return s1.lname.compareTo(s2.lname); 
	}


	
}

public class Inter {

    public static void main(String[] args) {
        // declare a reference to MyInterface
        // assign a lambda expression to the reference
		
		/*
		 * MyInterface ref = (str) -> { if(str%2==0) System.out.println("Even"); else
		 * System.out.println("Odd");};
		 * 
		 * // call the method of the interface System.out.println("Lambda reversed = " +
		 * ref.square(-1);
		 */
		 ArrayList<Person> a=new ArrayList<Person>();
		 Person a1=new Person("Mohammed", "Suhaib");
		 Person a2=new Person("Aheesh", "Bharadwaj");
		 Person a3=new Person("Monty", "Ciety");
		 Person a4=new Person("Minty", "Ciety");
		 a.add(a1);
		 a.add(a2);
		 a.add(a3);
		 a.add(a4);
		 a.sort(new LnameComparator());
		 Iterator<Person> itr2=a.iterator();  
		 while(itr2.hasNext()){  
		 Person st=(Person)itr2.next();  
		 System.out.println(st.lname+" "+st.name+" ");  
		 }
		 System.out.println(a.size());
		 for(int i=0;i<a.size();i++) {
			 if(a.get(i).lname.charAt(0)=='c')
				 System.out.println(a.get(i).getName()+" "+a.get(i).getLname());
		 }
			/*
			 * MyInterface c=(a)->{ Iterator iterator = ab.iterator();
			 * while(iterator.hasNext()) String aaa=iterator.next().getLname(); };
			 */
		 
		 
    }

}