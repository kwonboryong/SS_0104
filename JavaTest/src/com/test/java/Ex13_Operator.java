package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	public static void main(String[] args) throws IOException {
	
		
		/* 요구사항: 사용자로부터 문자 1개 입력 받기 -> 영어 소문자인지 검사 
		1. 라벨(안내 메세지) 출력
		2. BufferedReader 생성
		3. 입력: 문자 1개
		- read(): 1문자, 문자 코드값이 필요한 경우 사용
		- readLine(): n문자, 문자 코드값을 알아내기가 번거로움
		4. 유효성 검사	
		- 영소문자 (a 97 ~ z 122) => 3항 연산자 사용
		5. 결과 처리, 출력 */
		
		
		System.out.print("문자 입력: ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		int code = reader.read(); // 1문자, 문자 코드값이 필요 => read() 사용
		
		String result = code >= 97 && code <= 122 ? "올바른 문자" : "올바르지 않은 문자";
	// String result = (code >= 'a' && code <= 'z') ? "올바른 문자" : "올바르지 않은 문자";
	// String result = (code >= '가' && code <= '힣') ? "올바른 문자" : "올바르지 않은 문자"; // 한글 검사
	// String result = (code >= 'a' && code <= 'z') || (code >= 'A' && code <= 'Z') ? "올바른 문자" : "올바르지 않은 문자"; // 대소문자 검사

		
		System.out.printf("입력한 문자 '%c'는 %s입니다.\n", code, result); // %c는 문자 코드값을 문자로 가져옴
		
		
		
		
	}
}
