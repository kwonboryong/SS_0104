package com.test.java;

public class Ex10_Casting {
	public static void main(String[] args) {
		
		/*
		형 변환 (Promotion, Casting, 자료형 변환)
		- 하나의 자료형을 다른 자료형으로 변환하는 작업
		- 코드 작성을 유연하게 하기 위해 사용
		- int -> double
		- float -> short
		
		
		1. 암시적 형변환 (자동 형변환, Promotion)
		- 큰형 = 작은형 (작은 자료형 -> 큰 자료형에 대입)
		- 100% 안전 -> 생략 가능
		
		2. 명시적 형변환 (강제 형변환, Casting)
		- 작은형 = 큰 형 (큰 자료형 -> 작은 자료형에 대입)
		- 경우에 따라 다름 (넘칠 때도 있고 안 넘칠 때도 있음)
		- 오버플로우(OverFlow): 큰형 -> 작은형으로 넣을 때, 넘쳐서 숫자가 버려지는 현상
		
		
		작은형 = 큰형
		byte = long
		byte = int
		byte = short
		short = long
		short = int
		int = long
		
		큰형 = 작은형
		long = int
		long = short
		long = byte
		int = short
		int = byte
		short = byte
		
		 */
		
		// 암시적 형변환 
		byte b1; // 1byte
		short s1; // 2byte
		
		b1 = 10; // 원본 
	//	s1 = b1; // b1 값을 복사 -> s1에 대입
	// short = byte (작은형(byte) -> 큰형(short)에 대입 => 자동 형변환)
	// => s1 = (short)b1; (형변환 연산자)
	// short = short가 돼서 오류 없이 실행됨
		s1 = (short)b1;
		
		System.out.println(s1); // 복제본
		
		
		
		// 명시적 형변환
		byte b2;
		short s2;
		
		s2 = 128; // 원본
	//	b2 = s2; // s2 값을 복사 -> b2에 대입
	// byte = short (큰형(short) -> 작은형(byte)에 대입 => 명시적 형변환 해야 함)
	// => b2 = (byte)s2;
	// byte = byte로 명시적 형변환 
		b2 = (byte)s2;
		System.out.println(b2); // 복제본 (Error)

		
		
		// 기업은행 > 계좌
		int m1;
		long m2 = 3000000000L;
		
		// 계좌이체 
		m1 = (int)m2; // long(큰형) -> int(작은형)
		System.out.printf("계좌이체 결과: %,d원\n", m1); // 계좌이체 결과: -1,294,967,296원 출력
		
		// 자료형의 범위를 미리 확인해야 함
		
		
		
		// 정수 -> 정수
		// 정수형 리터럴: int
		byte a1 = 10; // byte = int (정수형 리터럴은 무조건 int형 -> 명시적 형변환 필요)
		// 예외적으로 명시적 형변환을 안해도 됨
		
		short a2 = 10; // short = int (명시적 형변환 필요하지만 생략 가능)
		
		long m4 = 10; // long = int (작은형 -> 큰형이기 때문에 암시적 형변환)
		
		
		// 실수 -> 실수
		// 실수형 리터럴: double
	// float f1 = 3.14; // float = double (실수형 리터럴은 무조건 double -> 명시적 형변환 필요)
		float f1 = (float)3.14;
		float f2 = 3.14F;
		
		
		
		
		// 정수 -> 실수
		
		int n1 = 100; // 원본 (4byte)
		float n2; // 복제본 (4byte)
		
		n2 = n1; // float = int (int -> float, 암시적 형변환)
		System.out.println(n2);
		
		
		
		
		// 정수와 실수 간의 크기 비교는 단순한 메모리 크기가 아닌, 실제 저장하는 수의 범위로 비교해야 한다.
		
		// byte(1) < short(2) < int(4) < long(8) <<< float(4) < double(8)
		
				
		// 실수 -> 정수
		
		int n3; // 복사본 (4)
		float n4 =100; // 원본 (4)
		
	// n3 = n4; // int = float (float -> int, 암시적 형변환 지원 X, 명시적 형변환 필요)
		// 
		n3 = (int)n4;
		
		System.out.println(n3);
		
		
		long n5;
		float n6 =10;
		
     // n5 = n6; // long(8) = float(4) (float -> long, 암시적 형변환 지원 X, 명시적 형변환 필요)
		// long의 최대값 922경, float의 최대값 3.402823466 E + 38 => long < float이기 때문)
		
		System.out.println(n3);
	
		

		// char 형변환
		char c1 = 'A'; // 내부는 숫자 데이터
		System.out.println(c1); // 출력: A
		System.out.println((int)c1); // 65 (char -> int)
		
		System.out.println((char)65); // A (int -> char)
		
		
		
		char c2; // 2byte
		short t2; // 2byte
		
		c2 = 'A'; 
		
		// t2 = c2; // 문자 코드값으로 변환
  // short(2) = char(2) (short < char)
		t2 = (short)c2;
		
		System.out.println(t2);
		
		
		
		char c3;
		short t3;
		
		t3 = 65; 
		
	// c3 = t3; // char = short
		c3 = (char)t3;
		
		System.out.println(c3);
		
		// 범위: short(-32768 ~ 32767), char(0 ~ 65535, char은 음수가 없음) 
		// => 둘의 교집합은 (0 ~  32767), 해당 범위에서 벗어날 경우 오버플로우 발생 => 명시적 형변환이 필요한 이유 
		
		// *** char(문자코드)를 정수화 시킬 때 => int 사용 (short 사용 X)

		
		/*
		값형 <-> 참조형 간에는 형변환이 절대 불가능하다.

		String txt = "A";
		int result;
		result = (int)txt;
		
		- 참조값(주소값)과 값(원시값)은 서로 형변환이 불가능함
	    System.out.println((int)"A"); // X (String은 int형으로 바꿀 수 없다 -> String은 참조형이기 때문)
		System.out.println((int)'A'); // O
		
		- result = Interger.parseInt(txt); // "100" -> 숫자 100
		바꿀 순 있으나 형변환은 아님
		*/
		
		/*
		숫자 -> 문자열
		1. 정석: String valueOf();
		String txt2 = String valueOf(100); // 정석
		
		2. 간단: 문자열 더해주기 (+ "";)
		String txt3 = 100 + ""; // 한쪽이 문자열이면 둘을 붙여서 문자열로 만듦
		String txt3 = 3.14 + ""; // 문자열 "3.14"
		String txt3 = ture + ""; // 문자열 "ture"
		
		
		*/
		
		
	}
}
