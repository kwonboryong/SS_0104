package com.test.java;

public class Ex15_Method {
	public static void main(String[] args) {
		
		/*
		public static void hello() 
		
		void: 반환 타입
		hello: 메서드 명 - ***캐멀 표기법(첫 글자는 소문자, 뒷 단어의 첫 글자는 대문자)
		(): 인자 리스트
		
		메서드 인자 리스트
		- 파라미터(Parameter)
		- 인자(Argument)
		- 매개변수
		
		*/
		
		// 요구사항: "홍길동"에게 인사하는 메서드를 구현하시오
		// 요구사항: "아무개"에게 인사하는 메서드를 구현하시오
		// 요구사항: "테스트"에게 인사하는 메서드를 구현하시오
		// 요구사항: 우리 강의실의 모든 사람들에게 인사하는 메서드를 구현하시오
		hello();
		hello2();
		hello3();
		
		helloEveryOne("홍길동"); // 값을 반드시 넣어줘야 함 (이 값을 메서드로 들고감)
		helloEveryOne("아무개"); // 실인자(Real Args, 실제로 넘어가는 값)
		
		checkAge(25);
		checkAge(90);
		checkAge(23);
		
		long a = 25;
		checkAge((int)a);
		
		checkScore(100, 90, 80);
		checkScore(50, 65, 30);
		
	} // main
	
	/** 문서 주석
	 * 메서드 설명: 성적을 평가합니다.
	 * @param kor 매개변수 설명: 국어 점수
	 * @param eng 영어 점수
	 * @param math 수학 점수
	 */
	
	public static void checkScore(int kor, int eng, int math) { // 콤마(,)로 매개변수 개수 늘리기
		
		int total = kor + eng + math; // 총점
		double avg = total / 3.0; // int / double (3으로 나누면 소수점 날아감)
		
		String result = avg >= 60 ? "합격" : "불합격";
		System.out.printf("평균 점수 %.1f점은 %s입니다.\n", avg, result); 
	}
	
	public static void checkAge(int age) {
		String result = age >= 18 ? "통과" : "거절";
		
		System.out.printf("입력한 나이 %d세는 %s입니다.\n", age, result);
	}
	
	public static void hello() {
		System.out.println("홍길동님, 안녕하세요.");
	}
	
	public static void hello2() {
		System.out.println("아무개님, 안녕하세요.");
	}
	
	public static void hello3() {
		System.out.println("테스트님, 안녕하세요.");
	}
	
	public static void helloEveryOne(String name) { // name을 가인자(Formal Args)라고 부름
	// 메서드 호출 시 입력받은 값을 변수 name에 넣음
	 // String name = "홍길동";
		System.out.println(name + "님, 안녕하세요.");
	}
	
	
	
} // Ex15_Method
