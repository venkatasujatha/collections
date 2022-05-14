package com.tectoro.hashing;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Spliterator;

public class TreeSet {
	public static void main(String[] args)
	{
		
		java.util.TreeSet<String> set=new java.util.TreeSet<String>();
		//set.add(null);
		set.add("welcome");
		set.add("4");
		set.add("box");
		set.add("goat");
		set.add("welcome");
		set.add("kailash");
		set.add("kochin");
		set.add("tirupathi");
		System.out.println(set);
		
		//descendingIterator
		Iterator<String> iy=set.descendingIterator();
		iy.forEachRemaining(n->System.out.println(n));
		
		//descendingset
		
		NavigableSet<String> set2 = set.descendingSet();
		Iterator<String> iterate=set2.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());		
			
		}
		
		//first
		
		System.out.println(set.first());
		System.out.println(set);
		
		//floor
		System.out.println(set.floor("goat"));
		
		//headset
		System.out.println(set.headSet("goat"));
		
		//higher
		System.out.println(set.higher("box"));
		
		//lower
		System.out.println(set.lower("welcome"));
		
		//pollfirst
		System.out.println(set.pollFirst());
		System.out.println(set);
		
		//polllast
		System.out.println(set.pollLast());
		System.out.println(set);
		
		Spliterator<String> spliterator = set.spliterator();
		spliterator.forEachRemaining(v->System.out.println(v));
		
		//subset
		System.out.println(set.subSet("kailash","tirupathi"));
		
		//tailset
		
		System.out.println(set.tailSet("kailash"));
		
		//contains
		System.out.println(set.contains("kailash"));
		
		//isempty
		
		System.out.println(set.isEmpty());
		
		//remove
		set.remove("box");
		System.out.println(set);
		
		//first
		System.out.println(set.first());
		
		//last
		System.out.println(set.last());
		
		//size
		System.out.println(set.size());
		
	}

}
