package com.tues.day2;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Map<Integer, String> map=new LinkedHashMap<>();
	    
	    map.put(100,"raj");
	    map.put(2,"Kiran");
	    map.put(30,"Ravi");
	    map.put(1,"java");
	    //map.
	    //Collections.sort(map.keySet());
	   // String value=map.remove(3);
	   // System.out.println(value);
	    //System.out.println(map.get(1));
	    System.out.println(map);
	    
	    //System.out.println(map.containsValue("123"));
	    
	    
	  //  System.out.println(map.keySet());
	    //System.out.println(map.values());
	   // System.out.println(map.entrySet());
	    
	    
     Map<Integer, String> map2=new HashMap<>();
	    
	   // map2.putAll(map);
	   // System.out.println(map2);
		
	}

}
