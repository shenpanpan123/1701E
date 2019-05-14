package com.bawei.list;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
//		TreeSet<Integer> hashSet = new TreeSet<Integer>();
		hashSet.add(2);
		hashSet.add(2);
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(3);
		hashSet.add(16);
		hashSet.add(20);
		hashSet.add(55);
		
		for (Integer num : hashSet) {
			System.out.println(num);
		}
		System.out.println("-------------------------------------------");
//		System.out.println(hashSet.contains(15));
//		hashSet.remove(20);
		hashSet.clear();
		
		for (Integer num : hashSet) {
			System.out.println(num);
		}
	}
	
}
