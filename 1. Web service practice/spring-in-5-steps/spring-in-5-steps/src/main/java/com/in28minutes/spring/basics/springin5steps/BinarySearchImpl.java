package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgoritm) {
		super();
		this.sortAlgorithm = sortAlgoritm;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor)
	{
		//Sorting the array by using Bubble sort algorithm
		int[] sortedNums = sortAlgorithm.sort(numbers);
		
		System.out.println(sortAlgorithm);
		//Search the array
		
		
		//Return the array
		
		return 0;
	}
	
	
	
	
}
