package com.Test.Fibonacci;

public class Fibonacci {
	public static long fib(int n) {
		if (n <=1) 
			return n;
		else
			return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		for (int i=0; i < 8; i++)
			System.out.println(i + ": " + fib(i) );
	}
}
