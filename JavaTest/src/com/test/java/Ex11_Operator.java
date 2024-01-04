package com.test.java;

public class Ex11_Operator {
	public static void main(String[] args) {
		


	/*
	연산자, Operator
	- 수학 연산자 -> 프로그래밍 연산자
	- 피연산자를 대상으로 미리 정해진 연산을 한 후, 연산의 결과를 반환
	- 주로 기호 사용 + 단어도 사용
	
	1. 문장 (Statement)
	- 1개 이상의 표현식이 모여서 문장을 만든다.

	2. 표현식 (Experssion)
	- 문장을 구성하는  최소 단위

	3. 연산자 (Operator)
	- +
	- =

	4. 피연산자 (Operand)
	- 연산의 대상

	5. 연산자 우선 순위
	- 하나의 문장에 속해있는 모든 연산자 중 먼저 실행할 순서


	6. 연산자 연산 방향
	- 하나의 문장에 속해있는 연산자들이 모두 연산자 우선 순위가 동일할 때, 먼저 실행할 순서



	* 연산자 종류

	1. 행동(목적)

 		(1) 산술 연산자
		- +, -, *, /, %(나머지)
		- 2항 연산자
		- 피연산자 = 숫자형을 가짐 (정수, 실수) */
	
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		
		System.out.printf("%d / %d = %d\n", a, b, a / b); // 몫
		System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지
		// 나머지 연산자인 %를 형식문자 %로 판단해서 Error -> %를 한 번 더 적어서 의미없게 만들어줌(\", \\ 같은 역할)
		
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%.0f / %.0f = %f\n", c, d, c/d); 
		// 나누기: 소수점까지 구하기
		

		/* *** 모든 산술 연산자의 결과값의 자료형 => 두 피연산자의 자료형 중에서 크기가 더 큰 자료형으로 반환된다. (데이터 손실을 최소화하기 위해)	*/
		// 정수 / 정수 = 정수
		System.out.println(10 / 3); // 3 (int / int = int)
		// 실수 / 실수 = 실수
		System.out.println(10.0 / 3.0); // 3.3333333 (double / double = double)
		// 정수 / 실수 = 실수
		System.out.println(10.0 / 3); // 3.3333333 (double / int = double)
		// 실수 / 정수 = 실수
		System.out.println(10 / 3.0); // 3.3333333 (int / double = double)
	
		int e = 1000;
		byte f = 10;
		System.out.println(e + f); // int + byte = int		
		
		
		// ***주의
		int g = 1_000_000_000; // 10억
		int h = 2_000_000_000;
		
	//	int i = g + h; // 결과: 30억?
	//	System.out.println(i); // 출력 오류 (int의 범위: 21억)
		long i = (long)g + h; // int보다 큰
		System.out.println(i);
		System.out.println((long)1_000_000_000 + 2_000_000_000); //
		

		byte j = 10;
		byte k = 20;
		System.out.println(j + k);
		
	 // byte l = j + k; // byte + byte = byte로 반환해야 되는 것 아닌가?
	 // *** byte와 short의 연산 결과는 항상 int이다. (컴퓨터가 다루는 가장 기본적인 형이 int형임) 
	// - 정수: 주로 int 사용, 가끔 long 사용 (byte, short는 잘 사용 X)
	// - 실수: 주로 double 사용
		
		
		// 곱셈 - 오버플로우 주의*
		
		
		
		// % (나머지 연산자)
		// - 패턴 생성(홀/짝수, 달력)
		System.out.println(10 % 2); // 2로 나눴을 때, 나머지 X: 짝수, 나머지 O: 홀수
		// 실습: 달력
		// 1. 해당 년월의 1일이 무슨 요일? - 서기 1년 1월 1일 = 월요일
		// 2. 해당 년월의 마지막일이 며칠?
		/*
		(2) 비교 연산자 - Ex12_Operator
		(3) 논리 연산자
		(4) 대입 연산자
		(5) 증감 연산자
		(6) 조건 연산자
		(7) 비트 연산자
		*/
	
	}
}	
	
