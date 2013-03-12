package com.van.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * 
 * description: 1.队列是一种数据结构，它按照先进先出的原则存储数据 2.实现队列先进先出
 * 
 * author: fanruifa
 * 
 * date: 2013-3-12
 * 
 */
public class QueueDemo {

	private static Queue<String> queue;

	public static void main(String[] args) {
		queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		for (int i = 0; !queue.isEmpty(); i++) {
			System.out.println(i + ":" + queue.poll());
		}
	}
}
