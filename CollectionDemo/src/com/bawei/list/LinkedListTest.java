package com.bawei.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("ddd2");
		names.add("aaa2");
		names.add("bbb1");
		names.add("aaa1");
		names.add("bbb3");
		names.add("ccc");
		names.add("bbb2");
		names.add("ddd1");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("---------------------------------------------------");
		
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
}
