package com.test.java;

public class Ex04_Variable {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println(a + " + " + b + " = " + (a + b));
		
		/* 
		+: 이항 연산자 (피연산자 2개, 합)
		+의 양 옆이 숫자면 산술
		옆에 문자가 (하나라도) 있으면 둘을 붙임 (합 X)
		
		연산자 우선순위
		연산자 방향: 연산자 우선순위가 같을 때 -> 왼쪽부터 실행
		*/
		
		// 주민등록번호 입력, 출력 (950105)
		int jumin1 = 950105;
		System.out.println("주민번호: " + jumin1);
		
		jumin1 = 030711;
		System.out.println("주민번호: " + jumin1); // 주민번호: 12745
		/* 
		 자바의 기수법
		 - 10진수, 8진수, 16진수, 2진수
		 	 
		 */
	
		System.out.println(10); // 10진수
		System.out.println(010); // 8진수 (앞에 0 / 0~7 / 출력할 때는 무조건 10진수로 출력)
		System.out.println(0x10); // 16진수 (앞에 0x / 0~9, A~F / 색상값 표현)
		System.out.println(0b10); // 2진수 (앞에 0b / 0,1)
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
