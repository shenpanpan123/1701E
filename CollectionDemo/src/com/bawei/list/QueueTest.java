package com.bawei.list;

import java.util.PriorityQueue;

public class QueueTest {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(2);
		priorityQueue.add(2);
		priorityQueue.add(2);
		priorityQueue.add(5);
		priorityQueue.add(3);
		priorityQueue.add(16);
		priorityQueue.add(20);
		priorityQueue.add(55);
		
		
		for (Integer num : priorityQueue) {
			System.out.println(num);
		}
		
	}
	
}
