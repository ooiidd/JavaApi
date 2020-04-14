package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.api.ArrayApi;

public class ArrayApiTest {
	public static void main(String[] args) {
		int[][] doubleArray = {
				{1,2,3},
				{2,3,4},
				{3,4,5}
		};
		int[] array = {
				1,2,3,4,5
		};
		
		String[][] strDoubleArray = {
				{"1bc","2","3"},
				{"2","3","4"},
				{"3","4","5"}
		};
		String[] strArray = {
				"1a","2","3","4","5"
		};
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10,9,8,7,6));
		List<String> strList = new ArrayList<>(Arrays.asList("abcd","9","8","7","6"));
		List<List<Integer>> doubleList = new ArrayList<>(Arrays.asList(
				Arrays.asList(10,9,8,7),
				Arrays.asList(6,5,4),
				Arrays.asList(3,2,1)
		));
		List<List<String>> strDoubleList = new ArrayList<>(Arrays.asList(
				Arrays.asList("ab","9","8","7"),
				Arrays.asList("6","5","4"),
				Arrays.asList("3","2","1")
		));
		System.out.println("------------------(array -> List)int 변환-------------------");
		
		System.out.println(ArrayApi.arrayToList(array));
		System.out.println(  ArrayApi.arrayToList(doubleArray).stream().map(
				t -> {
					System.out.println(t);
					return t.toString();
				}
			).collect(Collectors.toList())   );
		System.out.println("--------------------------------------------");
		
		System.out.println("------------------(array -> List)String 변환-------------------");
		System.out.println( ArrayApi.arrayToList(strArray));
		System.out.println(  ArrayApi.arrayToList(strDoubleArray).stream().map(
				t -> {
					System.out.println(t);
					return t.toString();
				}
			).collect(Collectors.toList())  );
		System.out.println("--------------------------------------------");
		

		System.out.println("------------------(List -> array)int 변환-------------------");
		System.out.println( Arrays.deepToString( ArrayApi.listToArray(list)) );
		System.out.println( Arrays.deepToString( ArrayApi.listToDoubleArray(doubleList)) );
		System.out.println("--------------------------------------------");

		System.out.println("------------------(List -> array)String 변환-------------------");
		System.out.println( Arrays.deepToString( ArrayApi.listToArray(strList)) );
		System.out.println( Arrays.deepToString( ArrayApi.listToDoubleArray(strDoubleList)) );
	
		System.out.println("--------------------------------------------");
	}
}
