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
	public static String[] listToArray(List<String> list) {
		String[] arr = list.toArray(new String[list.size()]);
		return list.toArray(new String[list.size()]);
	}
	@SuppressWarnings("unchecked")
	public static Integer[] listToIntegerArray(List<Integer> list) {
		Integer[] arr = list.toArray(new Integer[list.size()]);
		return list.toArray(new Integer[list.size()]);
	}
	
	
	/*@SuppressWarnings("unchecked")
	public static <T> T[][] listToDoubleArray(List<List<T>> list) {
		Object[][] arr = new Object[list.size()][]; 
		for(int i=0;i<list.size();i++) {
			arr[i] = listToArray(list.get(i));
		}
		return (T[][])arr;
	}*/
	@SuppressWarnings("unchecked")
	public static String[][] listToDoubleArray(List<List<String>> list) {
		String[][] arr = new String[list.size()][]; 
		for(int i=0;i<list.size();i++) {
			arr[i] = listToArray(list.get(i));
		}
		return arr;
	}
	@SuppressWarnings("unchecked")
	public static Integer[][] listToDoubleIntegerArray(List<List<Integer>> list) {
		Integer[][] arr = new Integer[list.size()][]; 
		for(int i=0;i<list.size();i++) {
			arr[i] = listToIntegerArray(list.get(i));
		}
		return arr;
	}
	
	@SuppressWarnings("unchecked")
	public static String[][] deepCopy(String[][] origin){
		if(origin == null)
			return null;
		String[][] result = new String[origin.length][];
		for(int i=0;i<origin.length;i++) {
			result[i] = (new String[origin[i].length]);
			System.arraycopy(origin[i], 0, result[i], 0, origin[i].length);
		}
		return (result);
	}
	public static int[][] deepCopy(int[][] origin){
		if(origin == null)
			return null;
		int[][] result = new int[origin.length][];
		for(int i=0;i<origin.length;i++) {
			result[i] = new int[origin[i].length];
			System.arraycopy(origin[i], 0, result[i], 0, origin[i].length);
		}
		return result;
	}
}
