package com.example.demo;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class FilterPrime {

	
	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(1,2,3,4,5);

	        System.out.println(myList.stream()
	                .filter(FilterPrime::getPrime)
	                .collect(toList()));
	}
	
	  public static boolean getPrime(int number) {
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
