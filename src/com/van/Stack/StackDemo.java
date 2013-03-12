package com.van.Stack;

import java.util.Stack;

/**
 * 
 *
 * description: 
 * 1.栈是一种数据结构，它按照后进先出的原则存储数据
 * 2.实现进栈、出栈
 * 
 * author: fanruifa
 *
 * date: 2013-3-11
 *
 */
public class StackDemo {
	
	private static Stack<String> stack;
	
	public static void main(String[] args) {
		stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		System.out.println(stack.size());
		for (int i = 0; !stack.isEmpty() ; i++) {
			String temp = stack.pop();
			System.out.println(i + ":" + temp);
		}
	}

}
