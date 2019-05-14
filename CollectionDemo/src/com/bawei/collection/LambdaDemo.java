package com.bawei.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LambdaDemo {
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("eee");
		names.add("ccc");
		names.add("bbb");
		names.add("ddd");

		//以前的方法
//		Collections.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
		
		
		Collections.sort(names, (a,b)->b.compareTo(a));
		
		
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	
}
