package com.test.java;

import java.io.BufferedReader; // class import: 패키지 java의 io에 있는 BufferedReader를 가져와서 사용
import java.io.IOException;
import java.io.InputStreamReader;
//import: 패키지 관리 기능 (서랍장에서 도구를 꺼내서 가져오는 행동)
// import java.io.*; => 와일드 카드 (모든 클래스를 가져와서 사용)


public class Ex08_BufferedReader {
	public static void main(String[] args) throws IOException {
		
		
		/* BufferedReader 클래스
		- 유니코드 입력 가능 (한글 입력 가능)
		- 문장 입력 가능
		
		jac: java의 압축파일
		*/
		
		
		// 요구사항: 사용자로부터 문자 1개를 입력받아 화면에 출력하기
		
		// import 생성 단축키: ctrl + shift + O
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 // 자료형(class)  변수
		

		// 지금 여기
		System.out.println("입력: ");
		int code = reader.read();
		System.out.println(code);
		
		/* 유니코드
		- A(65) ~ Z(90)
		- a(97) ~ z(122)
		- 0(48) ~ 9(57)
		- 숫자 1과 문자 1: 숫자 1 = 00000001 / 문자 '1' = 00110001
		
		- \r(13), \n(10)
		- 스페이스 (32)
		- 탭 (9)
		
		한글: 완성형 vs 조합형
		가(44032) ~ 힣(55203)
		*/
		
		 
		/* reader.read(); 
		- 콘솔로부터 키보드 값을 입력받을 수 있는 도구
		- System.in.read();와 같은 기능 */
		
		System.out.print("문자 입력> ");
		int code1 = reader.read();  
		
		System.out.println(code1); // 문자 유니코드 반환 (44032)
		System.out.printf("%c\n", code1); // 가
		
		
		
		// 이름 입력 받기 (여러 글자)
		System.out.print("이름: ");
	
		String name = reader.readLine(); 
		// 입력된 Line 전체를 읽는다. (문자열로만 반환한다!!!)  => 변수 name에 대입
		// (read는 한 글자만 읽음)
		
		System.out.printf("안녕하세요. %s님\n", name);
		
		
		
		// 나이 입력 받기
		System.out.print("나이 입력: ");

		// int num = reader.readLine(); -> Error (ine이라서 문자열로만 반환한다!!!)
		String age = reader.readLine(); // 20(X), "20"(O)
		
		System.out.printf("%s님의 나이는 %s살 입니다.\n", name, age);
		
		
		
		// 요구사항: 사용자로부터 2개의 숫자 입력 받아서 두 수를 더하기
		System.out.print("첫 번째 숫자: ");
		String input1 = reader.readLine(); // 10 입력 시 "10" 출력
		
		System.out.print("두 번째 숫자: ");
		String input2= reader.readLine();
		
		System.out.println(input1 + input2); // 문자열(String)로 입력 받아서 산술(덧셈)이 아니라 문자끼리 더해짐
		
		/* 
		* 키보드로 입력된 모든 값들은 "문자열"이다.
		** 문자열 -> 해당 자료형으로 변환하기
		1. 숫자가 정수: Integer.parseInt(); 사용
		2. 숫자가 실수: Double.parseDouble(); 사용
		Byte.parseByte();
		Short.parseShort();
		Long.parseLong();
		Float.parseFloat();
		Boolean.parseBoolean();
		*/
		
		// int num1 = Integer.parseInt("10"); // 문자열 "10" > 숫자 10
		
		// 1. 숫자가 정수: Integer.parseInt(); 사용
		int num1 = Integer.parseInt(input1); // 문자열 "10" > 숫자 10
		int num2 = Integer.parseInt(input2); // 문자열 "10" > 숫자 10
		System.out.println(num1 + num2);
		
		// 2. 숫자가 실수: Double.parseDouble(); 사용
		double num3 = Double.parseDouble(input1);
		double num4 = Double.parseDouble(input2);
		
		System.out.println(num3 + num4);
		

		
		
		
	}
}
