package com.tues.day2;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String args[])
	{
		/*
		 * HashSet<Integer> hash=new HashSet<Integer>(); hash.add(100); hash.add(5);
		 * hash.add(10); hash.add(100);
		 * 
		 * System.out.println(hash);
		 */
		
		
		/*
		 * LinkedHashSet<Integer> hash=new LinkedHashSet<Integer>(); hash.add(100);
		 * hash.add(5); hash.add(10); hash.add(100);
		 * 
		 * System.out.println(hash);
		 */
		
		TreeSet<Integer> hash=new TreeSet<Integer>();
		hash.add(100);
		hash.add(5);
		hash.add(10);
		hash.add(100);
		
		System.out.println(hash);
		
		
		  PriorityQueue<Integer> que=new PriorityQueue<Integer>(); que.add(100);
		  que.add(10); 
		  que.add(3); 
		  System.out.println(que.poll()); //que.poll();
		  System.out.println(que);
		
		
	}

}
