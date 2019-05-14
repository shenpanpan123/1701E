package com.bawei.collection;

import com.bawei.bean.Stu;

public class LambdaInterfaceMain {
	public static void main(String[] args) {
		
		LambdaInterface<Integer, String, Stu> stuCreate = Stu::new;
		Stu stu = stuCreate.funtion(123, "李雷");
		
		
		System.out.println(stu.getName());
		
		DefMethod<String, Integer> transf = Integer::valueOf;
		Integer num = transf.funtion1("152");
	}
	
	
}
