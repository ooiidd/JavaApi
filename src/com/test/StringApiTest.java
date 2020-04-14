package com.test;

public class StringApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "0123456789";
		
		
		
		/**
		 * substring
		 * parameter : 
		 * 		1개 : begin (begin < 나올값)  시작부터 끝까지 나옴
		 *		2ro : begin ~ end ( begin <= 나올값 < end) 
		 */
		System.out.println("--------------substring------------------");
		System.out.println(testStr.substring(5));
		System.out.println(testStr.substring(1,4));
		System.out.println("-----------------------------------------");
		
		/**
		 * indexOf
		 * Parameter(String 또는 Char)로 시작되는 index를 찾음 
		 * 못찾으면 -1 반환
		 * 
		 * lastIndexOf
		 * 뒤에서부터 찾음
		 */
		System.out.println("--------------indexOf------------------");
		System.out.println(testStr.indexOf('4'));
		System.out.println(testStr.indexOf("123"));
		System.out.println(testStr.indexOf("ㅁ23"));
		System.out.println(testStr.indexOf("123",1)); // 시작하는 index 지정 가능
		System.out.println(testStr.indexOf("123",2)); // 시작하는 index 지정 가능
		System.out.println("-----------------------------------------");


		System.out.println("--------------lastIndexOf------------------");
		System.out.println(testStr.lastIndexOf("45")); // 시작하는 index 지정 가능
		System.out.println(testStr.lastIndexOf("45",4)); // 시작하는 index 지정 가능
		System.out.println(testStr.lastIndexOf("45",3)); // 시작하는 index 지정 가능
		System.out.println("-----------------------------------------");
		
		/**
		 * codePointAt -> Parameter에 해당하는  index의 아스키 코드 반환 
		 */
		System.out.println(testStr.codePointAt(0));
		
	}

}
