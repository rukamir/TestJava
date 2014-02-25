package com.Test.PrimeNumbers;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("Find Prime Numbers program");
		
		for (int i = 0; i < 30; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; 2*i < num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
