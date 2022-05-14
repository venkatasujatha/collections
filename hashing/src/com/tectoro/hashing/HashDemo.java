package com.tectoro.hashing;

import java.util.HashMap;

public class HashDemo {
	public static void main(String[] args)
	{
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		
		hashMap.put(1, "sujatha");
		hashMap.put(2, "pras");
		hashMap.put(3, "suni");
		hashMap.put(4, "anu");
		System.out.println(hashMap);
		//put value if absent
		hashMap.putIfAbsent(5, "eswar");
		System.out.println(hashMap);
		
		String string = hashMap.get(1);
		System.out.println(string);
		//get element if present
		
		  for (Integer hy : hashMap.keySet()) {
			  
			  String ju = hashMap.get(hy);
			  System.out.println(ju);
			
		}
		  
		//replace
		  hashMap.replace(2, "chinnu");
		  System.out.println(hashMap);
		  
		 //replace old value with new value
		  hashMap.replace(2, "chinnu", "rani");
		  System.out.println(hashMap);
		  
		 //remove
		  hashMap.remove(3);
		  System.out.println(hashMap);
		  
		  //isempty
		  
			  System.out.println(hashMap.isEmpty());
		  //clone
			  System.out.println(hashMap.clone());
			  
			  
		 //entryset
			  System.out.println(hashMap.entrySet());
			//keyset
			  
			  System.out.println(hashMap.keySet());
			  //containsKey
			  System.out.println(hashMap.containsKey(1));
			  
			  //contains value
			  System.out.println(hashMap.containsValue("sujatha"));
			  
			  //compute
			  
			  System.out.println(hashMap.compute(1,(k,v)->v="d"));
			  
			  //computeifabsent
			  
			  System.out.println(hashMap.computeIfAbsent(10,k->"fruit"));
			  
			  //computeifpresent
			  System.out.println(hashMap.computeIfPresent(1,(k,v)->v="flower" ));
			  
			  //get
			  System.out.println(hashMap.getOrDefault(1, string));
			  System.out.println(hashMap);
			  
			  //equals
			  HashMap<Integer, String> hms=new HashMap<Integer, String>();
			  hms.put(1, "prashanth");
			  hms.put(2, "sujatha");
			  hms.put(3, "yash");
			  System.out.println(hashMap.equals(hms));
			  
			  //merge
			  hms.merge(100, "chinnu",(a1,a2)->a1+a2);
			  System.out.println(hms);
			  
			  //replaceall
			  hms.replaceAll((t, u) -> u.toUpperCase());
			  System.out.println(hms);
			  //containvalues
			  System.out.println(hms.containsValue("sujatha"));
			  //values
			  System.out.println(hms.values());
			  
			  //size
			  System.out.println(hms.size());
			  System.out.println(hms);
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
	}

}
