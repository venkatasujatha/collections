package com.tectoro.hashing;

import java.util.Comparator;


	public class eee implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			String s1=o1.getName();
			String s2=o2.getName();
			return s1.compareTo(s2);
		}
		
	}
	
	


