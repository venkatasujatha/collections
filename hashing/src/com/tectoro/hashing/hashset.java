package com.tectoro.hashing;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Spliterator;

public class hashset {
	public static void main(String[] args)
	{
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("sujatha");
		hashSet.add("naveen");
		hashSet.add("sam");
		hashSet.add("naresh");
		hashSet.add("chinnu");
		hashSet.add("parveen");
		System.out.println(hashSet);
		
		//clone
		HashSet<String> vb=new HashSet<String>();
		vb=(HashSet)hashSet.clone();
		System.out.println(vb);
		//contains
		
			
				for(int i=0;i<hashSet.size();i++)
				{
					if(hashSet.contains("sujatha")==true)
					{
					System.out.println(hashSet.remove(i));
					}
					else
					{
						System.out.println("return false");
					}
				}
				
				//isempty
				System.out.println(vb.isEmpty());
				
				//iterator
				Iterator<String> iu=vb.iterator();
				while (iu.hasNext()) {
					 System.out.println(iu.next());
					 
				//remove
				vb.remove("sujatha");
				System.out.println(vb);
					 
				//size
				System.out.println(vb.size());
				for(int i=0;i<vb.size();i++)
				{
					if(vb.contains("sam"))
					{
						vb.remove("sam");
						
					}
					else
					{
						System.out.println("name not available");
					}
					
				}
				System.out.println(vb);
				}
			//spliterator
				
				Spliterator<String> si=vb.spliterator();
				si.forEachRemaining((n)->System.out.println("list"+n));
	}
	  	
	
		
}
