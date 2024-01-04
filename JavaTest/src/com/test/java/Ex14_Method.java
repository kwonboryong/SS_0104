package com.test.java;

public class Ex14_Method {
	public static void main(String[] args) {
		
		/*
		 메서드 (Method)
		 - 함수(Function), 프로시저(Procedure), 서브 루틴(Sub Routine) 라고도 부름
	     - 코드의 집합 
	     - 하나의 목적을 가진 코드의 집합
	  	 - 코드 재사용의 단위***
		
		 메서드 사용 목적
		 1. 코드 재사용
		 2. 코드 관리 (가독성)
		 
		 메서드 사용 단계
		 1. 메서드 선언
		 2. 메서드 호출(사용)
		 
		 
		 */
		
		// 요구사항: "반갑습니다." -> 5회 출력
		// case 1: 가장 단순한 방법 - ctrl c + ctrl v = 하드 코딩
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		
		// 메서드 2 호출
		printNumber();
		
	
		// 메서드 1 호출
		hello();
		
		
	} /* main 메서드
	 - 특수 메서드
	 - 이름이 예약된 메서드
	 - 프로그램이 시작되면 자동으로 호출되는 메서드
	*/
	
	
	/* 
	메서드 선언
	- 클래스(class) 내부에 선언
	
	메서드 헤더(header), Signature(서명): public static void hello()
	- public: 접근 지정자, static: 정적 키워드, void: 반환 타입, hello: 메서드명, (): 인자
	
	메서드 몸통(body), 구현부: { 코드; }
	- 메서드가 하려는 업무 */
	
	
	// 메서드 1 선언
	public static void hello() { // 헤더: 메서드 hello 선언
		// 몸통: 구현부
		System.out.println("안녕하세요.");
	}
	
	// 메서드 2 선언
	public static void printNumber() {
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}
	
	
} // Ex14_Method
