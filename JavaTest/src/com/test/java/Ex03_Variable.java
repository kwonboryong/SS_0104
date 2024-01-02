package com.test.java;

public class Ex03_Variable {
	public static void main(String[] args) {

		// 모든 자료형 + 변수 생성하기

		// 정수
		byte b1 = 100; // 100 => 상수(=데이터, 정수형 상수, 정수형 리터럴)
		System.out.println(b1);
		
		// b1 = 128; => 범위를 벗어남[Error: Type mismatch: cannot convert from int to byte]
		b1 = Byte.MAX_VALUE;
		System.out.println(b1);
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1;
		s1 = 100;
		System.out.println(s1);
		
		s1 = 128;
		System.out.println(s1);
		
		
		int n1 = 100;
		System.out.println(n1);
		
		n1 = 1_000_000_000;
		System.out.println(n1); 
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1); 
		
		n1 = Integer.MIN_VALUE;
		System.out.println(n1); 
		
		long l1 = 100;
		System.out.println(l1);
		
		l1 = 30000000;
		System.out.println(l1);
	
		
		/* 정수
		int n1 = 100; 
		System.out.println(b1);
		- 100 => 상수(=데이터, 정수형 상수, 정수형 리터럴)
		
		- 모든 상수들도 자료형을 가진다.
		정수형 상수의 자료형 => 무조건 int		
		System.out.println(100); -> 100의 자료형은? => int
		
		
		대입 연산자
		- 왼쪽(변수, LValue) = 오른쪽(상수 RValue);
		- LValue와 RValue는 반드시 자료형이 동일해야 한다.
		b1 = 100; -> byte(4칸) = int(4칸)
		s1 = 100; -> short(2칸) = int(4칸)
		n1 = 100; -> int(4칸) = int(4칸)
		l1 = 100; -> long(8칸) = int(4칸)
		l1 = 100L; -> long(8칸) = int(4칸)
		21억이 넘어가는 상수를 사용할 때, 숫자 뒤에 L을 붙임
		*/
		
		// 실수
		// 단정도형
		
		
		float f1 = 3.14F;
		System.out.println(f1);
		// 실수형 상수의 자료형은 double형이다.
		// 배정도형
		
		double d1 = 6.28;
		System.out.println(d1);
		
		
		f1 = 123.456789012345678901234567890F;
		d1 = 123.456789012345678901234567890D;
		System.out.println(f1);
		System.out.println(d1);
		
		
		f1 = 123456789012345678901234567890F;
		d1 = 123456789012345678901234567890D;
		System.out.println(f1);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(d1);
		
		/* 실수 정확히 계산하기
		- 실수를 정수화 시켜서 정수로 계산한 후, 실수로 다시 바꿔서 계산 
		*/
		
		
	
		char c1 = 'A';
		// 홑따옴표로 묶음 => 문자형 상수(리터럴)
		
		c1 = '1'; // 문자 1 (숫자 1과 전혀 무관함)

		// 논리형: 참, 거짓 판별
		boolean flag;
		flag = true; // 논리형 상수(리터럴)
		System.out.println(flag);
		
		
		/* 추가
	    참조형 
		- 문자열 String: 문자들의 집합 (char을 모아놓은 자료형)
		String name = "안녕하세요";
		System.out.println(name);
		
		char m1 = 'A';
		String m2 = "A";
		System.out.println(m1);
		System.out.println(m2);
		
		String m3 = ""; 
		=> 빈 문자열 (Empty String) 
		-> 문자열 변수를 초기화할 때 많이 사용
		System.out.println(m3);
		
		
		
	    기본형(원시형, 값형) vs 참조형
		메모리에 생성되는 규칙이 다르다.
		int a = 10; // 기본형
		String b = "홍길동"; // 참조형
		
		Stack과 Heap
		Stack
		- 우리가 만드는 모든 변수는 Stack에 생성된다.
		int a = 10; ⇒ 기본형
		a와 10은 stack에 저장된다.

		Heap
		- 모든 참조형은 변수는 stack에, 데이터는 Heap에 저장된다.
		String b = "홍길동"; ⇒ 참조형
		b는 Stack에, “홍길동”은 Heap에 저장된다.
		Heap에 생성된 “홍길동”의 주소가 b에 저장된다. ⇒ 참조

		
		과제: 각 자료형 별로 (9개) 변수 1개씩 생성, 값을 대입하고 출력하는 과정을 10번씩 해보기
		
		*/
	}
}
