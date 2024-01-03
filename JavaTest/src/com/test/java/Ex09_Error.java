package com.test.java;

public class Ex09_Error {
	public static void main(String[] args) {
		
		int a = 0; // 사용자 입력
		System.out.println(100 / a);
		// 정수 / 정수는 0으로 나눌 수 없음 -> 런타임 에러

		
		/*
		에러 Error
		- 오류, 버그(Bug), 예외(Exception) 등
		
		1. 컴파일 에러: 컴파일(번역) 작업 중 발생하는 에러
		- 문법이 틀림
		- 발생 시 컴파일 작업 중단 → 프로그램 생성 불가능 ⇒ 반드시 해결
		- 난이도가 가장 낮음 (컴파일러가 에러 메세지로 알려줌)
		- 빨간 밑줄

		2. 런타임 에러: 실행 중 발생하는 에러
		- 런타임(Run Time, 실행 중)
		- 문법에는 오류 X, 다른 원인으로 발생
		- 예외(Exception): 예측하지 못한 문제 상황
		- 난이도 중간 (발견 자체가 복불복임)

		3. 논리 에러
		
		
		
		
		
		*/ 
		
		
		int n1 = 10;
		int n2 = 5;
		
		System.out.println(n1 - n2); 
		// 덧셈(+)을 하려고 하는데 실수로 뺄셈(-)을 적음 => 논리 에러
		
		
		
		
	}

}
