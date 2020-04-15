package com.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortApi {
	
	/**
	 * primitive type 오름차순 정렬
	 * @param input : primitive integer array
	 * @return sort result
	 */
	public static int[] sort1(int[] input) {
		Arrays.sort(input);
		return input;
	}
	
	/**
	 * primitive type 내림차순
	 * 내림차순은 깝치지 말고 wrapper class array나 collection에 담아서 쓰도록 하자.
	 * @param input : primitive integer array
	 * @return
	 */
	public static int[] sort2(int[] input) {
		List<Integer> wrapInput = ArrayApi.arrayToList(input); 
		Collections.sort(wrapInput, Collections.reverseOrder());		
		input = wrapInput.stream().mapToInt(n->n).toArray();
		return input;
	}
	
	/**
	 * string 오름차순
	 * @param input : string array
	 * @return
	 */
	public static String[] sort3(String[] input) {
		Arrays.sort(input);
		return input;
	}
	
	/**
	 * string 내림차순
	 * @param input : string array
	 * @return
	 */
	public static String[] sort4(String[] input) {
		Arrays.sort(input, Collections.reverseOrder());
		return input;
	}
}
