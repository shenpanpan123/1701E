package com.bawei.stream;

import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamInterf {
	
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
		
		Stream<String> stream = names.stream();
//		stream.filter((s)->s.startsWith("a")).sorted().forEach(System.out::println);
		long count = stream.filter((s)->s.startsWith("a")).sorted().count();
//		
//		System.out.println(count);
		
//		boolean anyMatch = stream.anyMatch((s)->s.startsWith("e"));
//		System.out.println(anyMatch);
		
		Optional<String> reduce = stream.reduce((s1,s2)->s1+"--->"+s2);
		
		reduce.ifPresent(System.out::print);
	}
	
	
}
