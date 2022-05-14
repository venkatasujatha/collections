package com.tectoro.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee1 {
		
		public static void main(String[] args)
	{
		ArrayList<String> as=new ArrayList<String>();
		as.add("sujatha");
		as.add("A");
		as.add("yash");
		as.add("tulasi");
		as.add("B");
		as.add("aa");
		as.add("baaa");
		as.add("C");
		as.add("R");
		as.add("t");
		as.add("R");
		as.add("a");
		as.add("P");
		as.add("b");
		as.add("P");
		/*
		 * Collections.sort(as,(i1,i2)->i1.compareTo(i2)); System.out.println( as);
		 */
		System.out.println(as.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		as.trimToSize();
		System.out.println(as);
		as.ensureCapacity(10);
		System.out.println(as.subList(2, 6));
		
		
	}

}
