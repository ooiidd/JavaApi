package com.test;

import com.api.SortApi;

public class SortApiTest {

	public static void main(String[] args) {
		int[] parr = {3,1,2,4,5};
		parr = SortApi.sort1(parr); for(int el : parr) {System.out.print(el + " ");} System.out.println();
		parr = SortApi.sort2(parr); for(int el : parr) {System.out.print(el + " ");} System.out.println();
		
		String[] sarr = {"acneStudio", "macbook", "apple"};
		sarr = SortApi.sort3(sarr); for(String el : sarr) {System.out.print(el + " ");} System.out.println();
		sarr = SortApi.sort4(sarr); for(String el : sarr) {System.out.print(el + " ");} System.out.println();
	}

}
