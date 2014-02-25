package com.Test.Sort;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		System.out.println("Sort program!");
		int[] arrayList = {5, 6, 7, 8, 1, 4, 2, 3};
		int[] tempSort = new int[arrayList.length];
		
		//Arrays.sort(arrayList);
		
		/*int lowestNumber = 999;
		// Search list while array list is still populated
		while (arrayList.length > 0) {
			
			// Search listed for lowest number still within list
			for (int currInt : arrayList) {
				
				// Compare current int with lowest detected
				if (lowestNumber > currInt) {
					lowestNumber = currInt;
				}
			}
			
			// add lowestNumber to tempSort array
			tempSort[tempSort.length] = lowestNumber;
			
			// reset lowestNumber to max value
			lowestNumber = 999;
		}//*/
		
		// Bubble sort
		int tempVar;
		for (int i = 0; i < arrayList.length; i++) {
			
			for (int j = 0; j < arrayList.length-1; j++) {
				
				if (arrayList[j] >= arrayList[j+1]) {
					
					
					tempVar = arrayList[j];
					arrayList[j] = arrayList[j+1];
					arrayList[j+1] = tempVar;//*/
				}
			}
		}
		
		
		for (int showInt : arrayList) {
			System.out.println(showInt);
		}
		
	}
}
