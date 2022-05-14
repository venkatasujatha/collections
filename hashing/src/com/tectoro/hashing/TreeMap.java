package com.tectoro.hashing;

import java.security.KeyStore.Entry;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;

//public class cmp1 implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		String i1=o1.getName();
//		String i2=o2.getName();
//		return i1.compareTo(i2);
//	}
//	
//}

public class TreeMap {

	public static void main(String[] args) {

		java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<Integer, String>();
		treeMap.put(1, "fish");
		treeMap.put(4, "flower");
		treeMap.put(3, "paper");
		treeMap.put(2, "google");
		System.out.println(treeMap);
		
		// ceilingEntry
		System.out.println(treeMap.ceilingEntry(3));
		
		// ceiling key
		System.out.println(treeMap.ceilingKey(3));
		
		// clone
		System.out.println(treeMap.clone());
		
		//sorting
		Iterator<Integer> i =treeMap.keySet().iterator();
		while(i.hasNext()) {
			int key = i.next();
			String value = treeMap.get(key);
			System.out.println("key"+key+":value:"+value);
		}
		List<Map.Entry<Integer, String>> map1 = new LinkedList<>(treeMap.entrySet());
		map1.sort((s1, s2) -> s1.getValue().compareTo(s2.getValue()));
		System.out.println(map1);
		map1.sort((s1, s2) -> s1.getKey().compareTo(s2.getKey()));
		System.out.println(map1);
		
		//compute
		String compute = treeMap.compute(1, (k,v)->v="fox");
		System.out.println(compute);
		
		//putifabsent
		treeMap.putIfAbsent(10,"sheep");
		
		//putifpresent
		java.util.TreeMap<Integer, String> h1=new java.util.TreeMap<Integer, String>();
		
		h1.putAll(treeMap);
		
		System.out.println(h1);
		System.out.println(treeMap);
		
		//entryset
		System.out.println(treeMap.entrySet());
		
		//keyset
		System.out.println(treeMap.keySet());
		
		//descending keyset
		System.out.println(treeMap.descendingKeySet());
		
		//getordefault
		
		System.out.println(treeMap.getOrDefault(1, "default"));
		
		//get
		System.out.println(treeMap.get(2));
		
		//hashcode
		System.out.println(treeMap.hashCode());
		
		//enumeration
	//	java.util.TreeMap<Integer, String> sortedmap=new java.util.TreeMap<Integer, String>();
		class  Titles
		{
			enum color
			{
			
			RED("RED"),
			GREEN("GREEN"),
			YELLOW("YELLOW");
				private String colorName;

				public String getColorName() {
					return colorName;
				}

				public void setColorName(String colorName) {
					this.colorName = colorName;
				}

				private color(String colorName) {
					this.colorName = colorName;
				}
				
				
		}
			
			}

		//merge
		//treeMap.merge(1, "gh",)
		
		//put
		treeMap.put(8, "hyd");
		System.out.println(treeMap);
		
		//putall
		java.util.TreeMap<Integer, String> hq1=new java.util.TreeMap<Integer, String>();
		hq1.putAll(treeMap);
		System.out.println(hq1);
		
		//putifabsent
		
		treeMap.putIfAbsent(5,"sun");
		System.out.println(treeMap);
		
		//remove
		
		treeMap.remove(10);
		System.out.println(treeMap);
		
		treeMap.remove(5, "sun");
		System.out.println(treeMap);
		
		//replace
		
		treeMap.replace(1,"dee");
		System.out.println(treeMap);
		
		treeMap.replace(1, "dee", "gulabi");
		System.out.println(treeMap);
		
		//replaceAll
		
		hq1.replaceAll((k,v)->v="yash");
		System.out.println(hq1);
		
		
		//tostring
		
		treeMap.toString();
		System.out.println(treeMap);
		
		//values
		
		treeMap.values();
		System.out.println(treeMap);
		
		//containskey
		
		
		if(treeMap.containsKey(2)==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
		//containsvalues
		
		if(treeMap.containsValue("sujatha")==true)
		{
			System.out.println("contains sujatha");
		}
		else
		{
			System.out.println("not contains sujatha");
		}
		
		//isempty
		
		System.out.println(treeMap.isEmpty());
		
		//floorentry
		
		System.out.println(treeMap.floorEntry(2));
		
		//ceiling entry
		
		System.out.println(treeMap.ceilingEntry(7));

		//get
		
		System.out.println(treeMap.get(3));
		System.out.println(treeMap);
		
		//size
		
		System.out.println(treeMap.size());
		
		//remove
		
		treeMap.remove(1);
		System.out.println(treeMap);
		
		//ceilingkey
		
		System.out.println(treeMap.ceilingKey(7));
		
		//ceilingentry
		
		System.out.println(treeMap.ceilingEntry(3));
		
		System.out.println(hq1.clone());
		
		//descendingkeyset
		
		System.out.println(treeMap.descendingKeySet());
		
		//descendingmap
		
		System.out.println(treeMap.descendingMap());
		
		//firstEntry
		System.out.println(treeMap.firstEntry());
		
		//floorentry
		
		System.out.println(treeMap.floorEntry(6));
		
		//foreach
		Set<Integer> key=treeMap.keySet();
		key.forEach(k->System.out.println(k));
	
		
		Set<java.util.Map.Entry<Integer,String>> ju=treeMap.entrySet();
		ju.forEach(ki->System.out.println(ki));
		
		//headmap
		System.out.println(treeMap.headMap(3));
		
		System.out.println(treeMap.headMap(2, true));
		
		//higherentry
		
		System.out.println(treeMap.higherEntry(2));
		System.out.println(treeMap);
		
		//higherkey
		
		System.out.println(treeMap.higherKey(7));
		
		//lowerentry
		System.out.println(treeMap.lowerEntry(4));
		
		//lowerkey
		
		System.out.println(treeMap.lowerKey(7));
		
		//navigablekeyset
		
		System.out.println(treeMap.navigableKeySet());
		
		
		//pollfirstentry
		
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//polllastentry
		
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		//replace
		
		System.out.println(treeMap.replace(3, "hi"));
		System.out.println(treeMap);
		
		//submap
		
		System.out.println(treeMap.subMap(2, 5));
		
		//sortedmap
		
		
		//navigablekeyset
		
		System.out.println(treeMap.navigableKeySet());
		
		//containskey
		
		System.out.println(treeMap.containsKey(4));
		
		//containsvalue
		
		System.out.println(treeMap.containsValue("sujatha"));
		
		//firstentry
		
		System.out.println(treeMap.firstEntry());
		
		//firstkey
		System.out.println(treeMap.firstKey());
		
		//get
		System.out.println(treeMap.get(4));
		
		System.out.println(treeMap.get(3).getBytes());
		
		//lastkey
		System.out.println(treeMap.lastKey());
		
		//remove
		
		System.out.println(hq1.remove(1));
		System.out.println(hq1);
		
		//set
		
		
		//size
		System.out.println(treeMap.size());
		
		//values
		System.out.println(treeMap.values());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


