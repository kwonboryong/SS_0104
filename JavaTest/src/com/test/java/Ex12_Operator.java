package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_Operator {
	public static void main(String[] args) throws IOException {
		
		/*
		 비교 연산자
		 - >, >=, <, <=, ==(equals), !=(not equals) (ligature 버전)
		 - 2항 연산자
		 - 피연산자의 우위(동등) 비교
		 - 피연산자 = 숫자형을 가짐
		 - * 연산의 결과가 반드시 boolean형이다. (true, false) */
		 /*
		 int a = 10;
		 int b = 3;
		 
		 System.out.printf("%d > %d = %b\n", a, b, a > b); // 결과는 boolean이기 때문에 %b 사용
		 System.out.printf("%d >= %d = %b\n", a, b, a >= b); 
		 System.out.printf("%d < %d = %b\n", a, b, a < b); 
		 System.out.printf("%d <= %d = %b\n", a, b, a <= b); 
		 System.out.printf("%d == %d = %b\n", a, b, a == b); 
		 System.out.printf("%d != %d = %b\n", a, b, a != b); 
		
		 // 요구사항: 사용자 나이 입력 -> 18세 이상이면 통과, 미만이면 거절
		
		System.out.print("나이 입력: "); 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine(); // 문자열로 입력 받음 -> 비교 불가능 -> 숫자로 변경(.parse)
		int age = Integer.parseInt(input);
		
		System.out.println(age >= 18); // boolean으로 반환
		System.out.println();
		*/
		
		
		// ==, != 
		int n1 = 100;
		int n2 = 200;
		int n3 = 50;

		n3 = n3 + 50; // n3를 100으로 덮어씀
		
		System.out.println(n1 == n2); // false
		System.out.println(n1 != n2); // true
		System.out.println(n1 == n3); // true
		System.out.println();
		
		
		// *** 문자열(String(참조열)) 비교는 ==, != 연산자를 사용하면 안된다.
		// *** 문자열(String(참조열)) 비교는 equals() 메서드 사용
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		
		s3 = s3 + "길동";
		
		System.out.println(s1 == s2); // true
		System.out.println(s3); // 홍길동
		System.out.println(s1 == s3); // false (문자열 비교는 연산자 사용 X)
		
		// *** 문자열(String(참조열)) 비교는 equals() 메서드 사용
		System.out.println(s1.equals(s2)); // true (s1 == s2)
		System.out.println(s1.equals(s3)); // true (s1 == s3)
		
		System.out.println(s2.equals(s3));
		
		
		
		/*
		논리 연산자
		- &&(and), ||(or), !(not)
		- 2항 연산자: &&(and), ||(or)
		- 1항 연산자: !(not)
		- * 피연산자와 결과값이 항상 boolean형
		- 피연산자를 정해진 규칙에 따라 연산한 후 값을 반환
		
		a. A && B: 논리 곱(and)
		- T && T = T
		- T && F = F
		- F && T = F
		- F && F = F
		예) 소개팅: 남자가 1. 키 180 이상, 2. 잘생김 = 둘 다 만족해야 소개팅
		
		b. A || B
		- T || T = T
		- T || F = T
		- F || T = T
		- F || F = F
		예) 소개팅: 남자가 1. 키 180 이상, 2. 잘생김 = 하나라도 만족하면 소개팅
		
		c.  !A
		- !T = F
		- !F = T
		
		d. ^: 베타적 논리(xor)
		- 둘이 같으면 F, 다르면 T
		- T ^ T = F
		- T ^ F = T
		- F ^ T = T
		- F ^ F = F
		 */
		
		boolean f1 = true;
		boolean f2 = false;
		
		System.out.println(f1 && f2); // false
		System.out.println(f1 || f2); // true
		System.out.println(!f1); // false
		System.out.println(f1 ^ f2); // true
		
		// 요구사항: 나이 입력 -> 18세 이상 + 60세 미만
		int age = 25;
		System.out.println((18 <= age) && (age < 60));
		System.out.println((age >= 18) && (age < 60)); // 중심이 되는 걸 왼쪽에 두는게 가독성이 좋음
		
		
		
		
		/*
		 대입 연산자
		 - =
		 - +=, -=, *=, /=, %= (복합 대입 연산자)
		 - 2항 연산자
		 - LValue(변수) = RValue(상수, 변수) -> 자료형이 동일해야 함 (형변환 해서라도)
		 - 대입 연산자는 우선순위가 가장 낮다.
		 - 연산 방향이 오른쪽 -> 왼쪽으로 간다.
		 */
		
		int sum = 10 + 20 * 3; // * -> + -> =(대입)
		System.out.println(sum); // 70
		
		int m1 = 100;
		int m2;
		int m3;
		
	 // m12 = m1;
	 // m3 = m1;
		m3 = m2 = m1; // 가능한 이유: 연산 방향이 오른쪽 -> 왼쪽 (m1 -> m2 -> m3로 복사)
		
		System.out.println(m2);
		System.out.println(m3);
		
	
		/* 복합 대입 연산자
		
		요구사항: n에 1을 추가 -> n의 값에 1을 더한 값을 다시 n에 넣어라 (= 누적, 11로 만들어라) */ 
		int n = 10;
	
		n += 1; // 누적
	 // n = n + 1;
		System.out.println(n); // 11
		
		n += 5;
		System.out.println(n); // 16
		
		n -= 4;
		System.out.println(n); // 12
		
		n *= 2;
		System.out.println(n); // 24
		
		n /= 2;
		System.out.println(n); // 12
		
		n %= 4;
		System.out.println(n); // 0
		
		
		// 10 % 11 = 10 (0...10 / 몫 0, 나머지 10)
		
		
		/* 증감 연산자 
		- ++(증가), --(감소)
		- 1항 연산자
		- 피연산자 = 숫자형만 가짐
		- 누적 연산자: 기존의 값에 1을 더하거나 뺌 */
		
		n = 10;
		
	//	n = n + 1;
	//	n += 1;
		++n;
		System.out.println(n); // 11
		
		//	n = n - 1;
		//	n -= 1;
		--n;
		System.out.println(n); // 10
		
		
		/* *** 연산자와 피연산자의 위치를 바꿀 수 있다.
		**** 연산자의 위치에 따라 연산자 우선 순위가 달라진다.
		1. ++n: 전위배치(전치) => 연산자 우선 순위가 가장 높다. (괄호보단 낮음)
		2. n++: 후위배치(후치) => 연산자 우선 순위가 가장 낮다. (대입 연산자보다 아래) 
		
		
		*/
		
		++n;
		n++;
		System.out.println(n); // 12
		
		
//		n = 10;
//		int result = 0;
//		
//		result = 10 + ++n; // ++n -> + -> =(대입)
//		
//		System.out.println(result); // 21
//		
		
//		n = 10;
//		int result = 0;
//		
//		// 우선 순위 주의!
//		result = 10 + n++; // 10 + n -> =(대입) -> n++(증가됨) => result엔 값(11) 반영 X (이미 대입 끝남)
//		
//		System.out.println(result); // 20
		
		
		// 풀어서 쓰는게 좋다. 
		n = 10;
		int result = 0;
		
		result = 10 + n;
		++n;
		
		System.out.println(result); 
		
		
		
		/* 조건 연산자
		- ?:
		- 3항 연산자 (유일)
		- A ? B : C
		- A: boolean -> 조건
		- B, C: 상수, 변수 -> 연산의 결과
		- A가 참이면 B를 반환, 거짓이면 C를 반환
		 */
		
		System.out.println(true ? "남자" : "여자"); // true면 "남자" 출력, false면 "여자" 출력
		
		
		age = 25;
		System.out.println(age >= 18 ? "통과" : "거절");
		
		
		n = 5;
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		
		
		/*	비트 연산자
		a = 10;
		b = 5;
		
		System.out.println(a & b); // 0  
		System.out.println(a | b); // 15
		*/
		
	}
}
