package com.bawei.collection;

@FunctionalInterface
public interface LambdaInterface<T,F,E> {
	
	public E funtion(T t,F f);
	
}
