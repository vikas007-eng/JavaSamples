package com.samples.demos.Hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testHashMap {
     public static void main(String[] args) {
		
    	 Map<String,Integer> map1 = new HashMap<String,Integer>();
    	 map1.put("john",25);
    	 map1.put("max",35);
    	 map1.put("raj",23);
    	 System.out.println(map1);
    	 
    	 map1.put("max", 75);
    	 System.out.println(map1);
    	 System.out.println("Is There John " + map1.containsKey("john"));
    	 
    	 System.out.println("all keys : " + map1.keySet());
    	 System.out.println("all values : " + map1.values());
    	 
    	 Set<String> names = map1.keySet();
    	 for(String name : names) {
    		 System.out.println("Name : " + name + "age :" + map1.get(name));
    	 }
    	 
    	 // map of maps
    	 Map<String ,Map<String , Object>> userProfile = new HashMap<String,Map<String,Object>>();
    	 Map<String , Object> profile = new HashMap<String,Object>();
    	 profile.put("age",25);
    	 profile.put("dept","Admin");
    	 profile.put("City","newYork");
    	 userProfile.put("John",profile);
    	 
    	  profile = new HashMap<String,Object>();
    	 profile.put("age",28);
    	 profile.put("dept","Adminitrative");
    	 profile.put("City","london");
    	 userProfile.put("vikas",profile);
    	 
    	 System.out.println(userProfile);
    	 
    
    	  
       
    	 
	}
}
