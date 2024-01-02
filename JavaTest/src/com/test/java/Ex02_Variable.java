package com.test.java;

public class Ex02_Variable {
	public static void main(String[] args) {
		
		/*
		 자료형 + 변수 변수 (Variable) 
		 - 여러가지 값으로 변할 수 있는 수 (표면상 정의) 
		 - 개발자가 명령어를 사용하여 메모리에 할당받은 공간 (실질적 정의)

		 * 1. 변수 생성하기
		 - 자료형 변수명;
		 - 예) int kor;

		 * 2. 변수 초기화하기
		 - 변수명 = 값;
		 - 예) kor = 100;

		 * 3. 변수 사용하기
		 - 변수명
		 - 출력, 연산, 조건, 기록 등…

		 * 각 bit마다 물리적인 주소가 있다 => 메모리 번지(주소)

		 * 메모리 1GB = 1024MB 1MB = 1024KB 1KB = 1024B 1024 = K 1000000 = M
		 */
		
		
		int kor;
		kor = 100;
		System.out.println(kor);
		
		
		// 학생 1명의 영어점수를 저장한 후 화면에 출력하기
		// 1. 데이터 성질 파악 -> 영어점수
		//   a. 형태 파악 -> 정수/실수 중 정수
		//   b. 길이 파악 -> 0 ~ 100
		
		// 2. 1의 결과에 따라 적당한 자료형 선택 -> byte 선택
		
		// 3. 2의 결과의 자료형으로 변수 생성
		
		byte eng1;
		eng1 = 90;
		System.out.println(eng1);
		
		// 변수 수정하기
		eng1 = 95; // 덮어쓰기
		System.out.println(eng1); // 95
		
		System.out.println(eng1);
		
		int eng = 90;
		System.out.println(eng);
		
	
		// 수학 점수는 무조건 80점일때도 변수 선언
		int math = 80;
		System.out.println(math);
	
		
		int n1; // 선언 -> 선언 직후 => 비어있는 상태 = null
		n1 = 100; // 초기화
		
		int n2 = 200;
		
		int n3, n4;
		
		int n11 =10, n12 = 20, n13 = 30;
		
		
		// 지도 좌표 (x ,y)
		double x1; // 우리집 x 좌표
		double y1; // 우리집 y 좌표
		
		double x2, y2; // 친구집 x좌표, 친구집 y좌표 => 가독성 X
		
		double x3, // 마트 x좌표
			   y3; // 마트 y좌표

		// * 변수는 값을 가지고 있지 않은 상태에서는 사용할 수 없다.
		// The local variable m may not have been initialized => 초기화 안하면 error
		
		// 식별자 (변수 이외의 다른 요소) 명명법
		// 1. 헝가리안 표기법: 요즘 잘 안씀
		int age;
		int intage;
		
		// 2. 파스칼 표기법
		// 첫 글자를 대문자, 나머지 글자를 소문자로 작성
		int englishscore;
		int EnglishScore;
		
		/* 3. 캐멀 표기법
		 * 첫 단어의 첫 글자를 소문자, 이후 단어의 첫 글자는 대문자로 작성 
		 - 2개 이상의 복합어일 때, 가독성 good 
		 - 변수명, 메서드명에 사용
		 
		 4. 스네이크 표기법 - 전부 소문자로 표기 
		 - 각 단어를 ‘_(언더바)’로 연결 
		 - 마음대로 사용
		 
		 5. 케밥 표기법 - 전부 소문자로 표기 
		 - 각 단어를 ‘-(하이픈)’으로 연결 
		 - (JAVA를 포함한) 꽤 많은 언어에서 사용할 수 없다. (HTML, CSS에서 많이 사용)
		 
		 
		 데이터 중 일부는 값을 변화시키면 안되는 값들 존재
		 예) pi = 3.14;
		 - 변수 앞에 final 붙이기 
		 => final 변수 = 상수(constant)
		 : 이름을 붙인 변하지 않는 값
		 
		 - final 변수가 되면 변수값 수정 X
		 
		 */
		
		// final 변수(=상수)
		final double pi = 3.14;
		
		
		
		
	}

}
