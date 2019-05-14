package com.bawei.collection;


@FunctionalInterface
public interface DefMethod<T,F> {
	
	public F funtion1(T t);
	
	public default void funtion2(){
		System.out.println("default funtion2");
	}
	
	public static void funtion3(){
		System.out.println("static funtion3");
	}
	
}
