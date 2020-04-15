package com.test;

import java.util.Arrays;
import java.util.Collections;

import com.api.SortApi;

public class SortApiTest {

	public static void main(String[] args) {
		int[] intArray = {3,1,2,4,5};
		int[] parr = intArray.clone();
		parr = SortApi.sort1(parr); for(int el : parr) {System.out.print(el + " ");} System.out.println();
		
		parr = intArray.clone();
		parr = SortApi.sort2(parr); for(int el : parr) {System.out.print(el + " ");} System.out.println();
		
		String[] sarr = {"acneStudio", "macbook", "apple"};
		sarr = SortApi.sort3(sarr); for(String el : sarr) {System.out.print(el + " ");} System.out.println();
		sarr = SortApi.sort4(sarr); for(String el : sarr) {System.out.print(el + " ");} System.out.println();
		
		
		
		/* Getter 메소드 필요
		Comparator<Student> reverse = Comparator.comparing(Student::getName).reversed();
		list.sort(Comparator.comparing(Student::getNum).thenComparing(reverse)
		        .thenComparing(Student::getAddress));
		        */

	}

}
