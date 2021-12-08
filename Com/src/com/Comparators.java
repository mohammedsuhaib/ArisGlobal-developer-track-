package com;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
 class PriceComparator implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice()==o2.getPrice())
		return 0;
		else if(o1.getPrice()>o2.getPrice())
			return 1;
		else return -1;
	}
	 
 }
 class BrandComparator implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		// TODO Auto-generated method stub
		
		return o1.getBrand().compareTo(o2.getBrand());
	}
	 
 }
 class IComparator implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		// TODO Auto-generated method stub
		if(o1.getI()==o2.getI())
			return 0;
			else if(o1.getI()>o2.getI())
				return 1;
			else return -1;
	}
	 
 }
 class CComparator implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		// TODO Auto-generated method stub
		if(o1.getC()==o2.getC())
			return 0;
			else if(o1.getC()>o2.getC())
				return 1;
			else return -1;
	}
	 
 }
 class Pen implements Comparable<Pen>{
		private String brand;
		private double price;
		private int i;
		private char c;
	 public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public char getC() {
			return c;
		}
		public void setC(char c) {
			this.c = c;
		}
	@Override
	public String toString() {
		return "Pen [Brand=" + brand + ", Price=" + price +" I="+i+" C="+c+"]\n";
	}
	 public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	 
	 public Pen(double price,String brand,char c,int i) {
		 this.price=price;
		 this.brand=brand;
		 this.c=c;
		 this.i=i;
	 }
	@Override
	public int compareTo(Pen o) {
		// TODO Auto-generated method stub
		//if(this.price>o.price)
			//return 1;
		//else if(this.price==o.price)
			//return 0;
		//else return -1;
		return this.brand.compareTo(o.brand);
	}
	 
 }
 class Test<T>{
	 T x;
	 void setX(T x) {
		 this.x=x;
	 }
	 T getX() {
		 
		 return x;
		 
	 }
 }
public class Comparators {
 
    public static void main(String[] args) {
    	
    	char[] array = new char[100];
    	try {
    	FileReader input = new FileReader("C:\\Users\\00005819\\Desktop\\output.txt");

        // Reads characters
        input.read(array);
        System.out.println("Data in the file:");
        System.out.println(array);
        FileWriter output = new FileWriter("C:\\Users\\00005819\\Desktop\\output.txt");

        // Writes string to the file
        output.write(array);
      		  
        // Closes the writer
        output.close();
        // Closes the reader
        input.close();
      }
      catch(Exception e) {
        e.getStackTrace();
      }
    	
    }
 
}

