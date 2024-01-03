package com.test.java;

public class Ex05_Escape {
	public static void main(String[] args) {
		
		/* Escape Sequence
		- 컴파일러가 번역할 때, 소스의 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		1. \n : 엔터, 줄바꿈 (new line, line feed)
		2. \r : 캐럿(커서)의 위치를 현재 라인의 맨 앞으로 이동 (carriage return)
		- \r을 만나면 코드의 맨 앞으로 가서 뒷 문장으로 덮어쓴다.
		3. \t : 탭 (tab)
		- 현재 위치에서 가장 가까운 탭(tab)으로 이동하는 역할
		4. \b : 백스페이스(backspace)
		- 이클립스에선 사용 X
		5. \", \', \\ : 
		- 이미 역할이 있는 문자를 역할이 없게 만드는 작업
		
		
		운영체제의 엔터
		1. 윈도우: \r\n
		2. 맥: \r
		3. 리눅스: \n
		*/
		
		
		/* 
		1. \n
		요구사항: "안녕하세요."와 "홍길동입니다."를 각각 다른 줄에 출력
		* 문자열 리터럴 내에는 엔터를 작성할 수 없다. ("쌍따옴표"는 같은 줄에 있어야 함) */
		
		String s1 = "안녕하세요.\n홍길동입니다.";
		System.out.println(s1);
		
		// 빈 줄: System.out.println(); 
		System.out.println(); // 빈 줄
		
		
		// 2. \r
		s1 = "안녕하세요.\r홍길동.";
		System.out.println(s1); // "홍길동세요." 출력
		
		// 3. \t
		s1 = "하나 둘				셋"; // tab을 몇 번 쳤는지 모름 -> 가독성이 안좋음
		System.out.println(s1);
		
		s1 = "하나\t둘\t\t셋";
		System.out.println(s1);
		
		// 4. \b
		s1 = "홍길동\b입니다.";
		System.out.println(s1); // 홍길입니다.
		
		// 5. \", \', \\
		// 요구사항: 화면에 > 홍길동: "안녕하세요." < 출력
		s1 = "홍길동: \"안녕하세요.\"";
		System.out.println(s1); // 홍길입니다.
		
		// \\ 
		// 요구사항: 수업 폴더의 경로를 출력
		// C:\class\code\java
		System.out.println("C:\\class\\code\\java");
		
	
	}

}
