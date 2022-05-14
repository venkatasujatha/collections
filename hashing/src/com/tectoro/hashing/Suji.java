package com.tectoro.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
//3. write a program to print all elements of an ArrayList using Lambda expression


public class Suji {

	public static void main(String[] args)
	{
		ArrayList<String> as=new ArrayList<String>();
		as.add("sujatha");
		as.add("4");
		as.add("yash");
		as.add("tulasi");
		as.add("a");
		as.add("aa");
		as.add("baaa");
		as.add("P");
		as.add("R");
		as.add("t");
		as.add("R");
		as.add("e");
		as.add("P");
		as.add("P");
		as.add("P");
		Consumer<String> u=g->{
			System.out.println(g);
		};
		as.stream().forEach(u);
		
		//5. Write a program to print only strings starting with alphabet 'a' from ArrayList using Lambda Expressions
		
		List<String> collect = as.stream().filter(i->i.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
		
		
		//1. Create an ArrayList of alphabets and get the first occurrence of alphabet P, get last occurrence of alphabet 'R',
		
		System.out.println(as.indexOf("P"));
		System.out.println(as.lastIndexOf("R"));
		
		//2. Create an ArrayList and check whether a given string is present, if yes, delete it.
		for(int i=0;i<as.size();i++)
		{
		if(as.contains("4"))
		{
			as.remove("4");
		}
		else
		{
			System.out.println("not exist");
		}
		System.out.println(as);
	}
		
		
		//3. Create an ArrayList with Strings and count the occurrence of "P" string and "R" string. whichever is occurring less times, delete it

		Scanner sn=new Scanner(System.in);
		System.out.println("hi");
		System.out.println(as);
		
		int P=0;
		int R=0;
		for(int i=0;i<as.size();i++)
		{
			if(as.get(i).equals("P"))
			{
				P++;
			}
			else if(as.get(i).equals("R"))
			{
				R++;
			}
		}
		
				if(P<R)
				{
					for(int i=0;i<as.size();i++)
					{
						as.remove("R");
					}
					
					}
				else
				{
					for(int i=0;i<as.size();i++)
					{
						as.remove("P");
					}
					
				}
			
			System.out.println(as);
			
		//4. Create a LinkedList with Strings, check whether a given string exists, get the first and last index of a particular string.
			
			
			List<String> le=new ArrayList<String>();
		le.add("hyderabad");
		le.add("mumbai");
		le.add("chennai");
		le.add("kochi");
		le.add("delhi");
		System.out.println(le);
		List<String> collect2 = le.stream().filter(i->i.contains("chennai")).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println(le);
	
		System.out.println(le.indexOf("chennai"));
		System.out.println(le.lastIndexOf("chennai"));
		//System.out.println(le);
			
		/*	5. Create a LinkedList of Employee objects and a new employee at specified index, get the first occurrence of "John"
			
		and delete all the repeated occurrences of any Employees*/	
			
			ArrayList<Employee> lei=new ArrayList<Employee>();
			lei.add(new Employee(1, "dog"));
			lei.add(new Employee(2, "fox"));
			lei.add(new Employee(3, "cat"));
			lei.add(new Employee(4, "ant"));
			lei.add(new Employee(5, "fox"));
			lei.add(new Employee(6, "cat"));
			System.out.println(lei);
			
			System.out.println(lei.indexOf("fox"));
			for(int i=0;i<lei.size();i++)
			{
				if(lei.contains("fox"))
				{
				System.out.println(lei.indexOf("fox"));
				}
				else
				{
					System.out.println("not");
				}
			}
			//System.out.println(lei.indexOf("fox"));
			Collections.sort(lei, new eee());
			for (Employee employee : lei) {
				System.out.println(employee);
				
			}
				
			
		}
				
	}
