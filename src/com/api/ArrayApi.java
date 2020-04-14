package com.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayApi {
	public static <T> List<T> arrayToList(T[] arr) {
		return new ArrayList<T>(Arrays.asList(arr));
	}
	
	public static List<Integer> arrayToList(int[] arr) {
		return Arrays.stream(arr).boxed().collect(Collectors.toList());
	}
	
	public static List<List<Integer>> arrayToList(int[][] arr) {
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arrayToList(arr[i]));
		}
		return list;
	}
	
	
	public static <T> List<List<T>> arrayToList(T[][] arr) {
		List<List<T>> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arrayToList(arr[i]));
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] listToArray(List<T> list) {
		T[] arr = list.toArray((T[])new Object[list.size()]);
		return list.toArray((T[])new Object[list.size()]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[][] listToDoubleArray(List<List<T>> list) {
		Object[][] arr = new Object[list.size()][]; 
		for(int i=0;i<list.size();i++) {
			arr[i] = listToArray(list.get(i));
		}
		return (T[][])arr;
	}
}
