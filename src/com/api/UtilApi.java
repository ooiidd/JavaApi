package com.api;

public class UtilApi {

	public static Integer getHour(String str) {
		String[] strArr = str.split(":");
		return Integer.parseInt(strArr[0]);
	}
	public static Integer getMin(String str) {
		String[] strArr = str.split(":");
		return Integer.parseInt(strArr[1]);
	}
}
