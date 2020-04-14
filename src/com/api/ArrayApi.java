package com.api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApi {
	public static <T> List<T> arrayToList(T[] arr) {
		return new ArrayList<T>(Arrays.asList(arr));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T[] listToArray(List<T> list) {
		return list.toArray((T[])new Object[list.size()]);
	}
}
