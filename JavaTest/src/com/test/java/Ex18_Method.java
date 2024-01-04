package com.test.java;


public class Ex18_Method {
	public static void main(String[] args) {
		
		/*
		 메서드 오버로딩 (Method Overloading)
		 - 같은 이름의 메서드를 여러개 만드는 기술
		 - 메서드의 인자 리스트를 다양한 형태로 구성해서, 같은 이름의 메서드를 여러개 만드는 기술
		 
		 메서드 오버로딩을 하는 이유 => 편리함
		 
		 메서드 오버로딩 구현 조건 - 가능
		 1. 매개변수의 개수
		 2. 매개변수의 자료형
		  
		 메서드 오버로딩 구현 조건 - 불가능
		 1. 매개변수의 이름
		 2. 반환값의 자료형
		 
		 1. public static void test() { }               // O
		 2. public static void test() { }               // X (1번 때문)
		 3. public static void test(int n) { }          // O (매개변수의 개수 -> 메서드 오버로딩)
		 4. public static void test(int m) { }          // X (3번 때문)
		 5. public static void test(int n, int m) { }   // O
		 6. public static void test(String s) { }       // O
		 7. public static int test() { }                // X
		 
		 test(); // 1번
		 test(14); // 3번
		 test(5, 8); // 5번
		 test("문자열"); // 6번
		 
		 
		  
		 */
		
		// 요구사항: 선을 그리는 메서드를 선언하시오.
		// 요구사항: -------, ******로도 그리는 메서드를 선언하시오. => 매개변수로 처리
	
		// 메서드 1 : 기본선
		drawLine();
		drawLine();
		
		// 메서드 2 : 매개변수로 선 모양 설정 가능
		drawLine("+");
		drawLine("+");
		
		
		// 메서드 오버로딩
		System.out.println(10); // println 1 호출됨
		System.out.println("문자열"); // println 2 호출됨
		
		
		
	} // main

	
	// println 1
	public static void println(int num) { 
		
	}
	// println 2
	public static void println(String txt) {
		
	}

	
	
	// 메서드 1 : 기본선
	public static void drawLine() {
		
		System.out.println("================");
	}
	
	// 메서드 2 : 인자값 있는 메서드
	public static void drawLine(String c) { // 위의 drawLine과 이름은 같지만 인자값이 다름 -> 메서드 오버로딩
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.println();
	}
	
	
} // Ex18_Method
