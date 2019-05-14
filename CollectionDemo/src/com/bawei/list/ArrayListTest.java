package com.bawei.list;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("ddd2");
		names.add("aaa2");
		names.add("bbb3");
		names.add("aaa1");
		names.add("bbb3");
		names.add("ccc");
		names.add("bbb2");
		names.add("ddd1");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	
}
