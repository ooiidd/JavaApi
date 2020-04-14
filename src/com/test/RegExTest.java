package com.test;

public class RegExTest {

	public static void main(String[] args) {
		//전화번호
		String[] phoneStr = {
			"010-55444-1234",
			"010-te12-3241",
			"011-2321-3242",
			"010-3222-2123",
			"010-3212-3421"
		};
		
		String reg = "^010-\\d{4}-\\d{4}";
		for(String cur : phoneStr) {
			if(cur.matches(reg))
				System.out.println(cur);
		}
		
		//이메일
		String[] emailStr = {
				"test@test.com",
				"test.test.com",
				"test@test.com.tes",
				"test@test,com",
				"test@@test.com",
				"test@test.com,",
				"test@test.com",
				"test@test.cie",
				"test@test"
		};
		String reg2 = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
		for(String cur : emailStr) {
			if(cur.matches(reg2))
				System.out.println(cur);
		}
	}

}
