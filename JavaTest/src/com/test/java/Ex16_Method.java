package com.test.java;

public class Ex16_Method {
	public static void main(String[] args) {


	/*
	 
	 void: 반환 타입
	 hello: 메서드 명 - ***캐멀 표기법(첫 글자는 소문자, 뒷 단어의 첫 글자는 대문자)
	 (): 인자 리스트 
	 
	 메서드의 반환값(반환타입): void
	 - void == 없다 == null
	 - 호출했을 때, 돌려받는 값
	 - give - 매개변수, take - 반환값
	 - return
	 - return 되는 반환값의 자료형을 void 자리에 넣어줘야 함
	 
	 */
		int num = test();
		System.out.println(num); // 30
		
		
		System.out.println(checkNumber(10));
		
		
		
		
	} // main
	
	public static void getName() {
		
		String name = "홍길동";
		
		return; // 빈 return문: 강제로 메서드 종료 (반환할 값 X)
		
	}
	
	
	
	public static int getNum() {
		int num = 100;
		
		return num; // 값 반환 + 메서드 종료 역할 (return문 아래 코드는 실행 X)
		
		// System.out.println("메서드 종료"); 
	}
	
	
	public static String checkNumber(int num) {
		
	  // String result = num % 2 == 0 ? "짝수" : "홀수";
	  // return result;
		
		return num % 2 == 0 ? "짝수" : "홀수"; // 가능
	}
	
	
	public static int test() {
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;
	}
	
	
	
}
