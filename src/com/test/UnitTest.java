package com.test;

import java.util.Arrays;

import com.api.ArrayApi;

public class UnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] copy = ArrayApi.deepCopy(arr.clone());
		for(int i=0;i<copy.length;i++) {
			for(int j=0;j<copy[i].length;j++) {
				copy[i][j] = arr[i][copy.length-j-1];
			}
		}
		System.out.println(ArrayApi.arrayToList(copy));
		
		
		String[][] arr2 = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
		};
		
		String[][] copy2 = (String[][])ArrayApi.deepCopy(arr2);
		for(int i=0;i<copy2.length;i++) {
			for(int j=0;j<copy2[i].length;j++) {
				copy2[i][j] = arr2[i][copy2.length-j-1];
			}
		}
		System.out.println(( ArrayApi.arrayToList(copy2)) );
	}

}
