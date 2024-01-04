package com.test.java;

public class Ex17_LocalVariable {
	
	int b = 20; // 멤버 변수
	
	public static void main(String[] args) {
		
		/*
		 자바 변수의 종류
		 - 선언된 위치, 역할 차이
		 
		 1. 멤버 변수 (Member Variable)
		 - 클래스 
		 
		 2. 지역 변수 (Local Variable)
		 - 메서드 내에서 선언된 변수(지금까지 사용한 변수)
		 - 변수 스코프(Scope): 변수의 사용 영역(범위)
		 - 지역이 다르면 사용 불가능 (다른 메서드끼리 x)
		 
		 = 지역 변수의 생명 주기(Life Cycle)
		 - 변수가 언제 태어나서 (메모리에 생성) ~ 언제 죽는지 (메모리에 소멸)
		 - 생성: 변수 선언문이 실행될 때
		 - 소멸: 변수 선언문이 포함된 블럭을 빠져나갈 때 (변수가 선언된 메서드가 끝날 때)
		  
		 
		 */
		
		int a = 10; // 지역 변수
		
		
		int num = 100; // 실인자를 넘기는 변수의 이름 = 매개변수(아래 메서드의 int num)
		checkNumber(num);
		
		aaa();
		
		
	} // main
	
	
	public static void aaa() { 
		int a = 10; // 생성
		bbb(a); // 변수 a를 사용하고 싶으면 매개변수로 사용
	}
	
	public static void bbb(int a) { // 변수 a를 사용하고 싶으면 매개변수로 사용
		// System.out.println(a); // Error - 변수 a는 다른 메서드, 사용 X
	}
	
	
	
	public static void checkNumber(int num) { // 매개변수 int num도 지역변수

	}
	
	public static void test1() {
		int c = 30;
	 // int c = 50; // 같은 지역 내 동일한 이름의 변수 선언 불가
	}
	
	public static void test2() {
		int d = 40;
		int c = 50; // 다른 지역이라 int c 선언 가능
	}
	
	
	
	
}
