package com.test.java;

import java.io.IOException;

public class Ex07_Input {
	public static void main(String[] args) throws IOException {
		
		/* 콘솔 입력
		1. System.in.read(): 사용자로부터 입력을 받아서 입력한 문자를 돌려주는 역할
		- System.out.print()의 반대
		- 1문자만 입력 가능
		- 문자 코드값을 반환 (유니코드)
		- 한글 입력 불가능 X (2byte 문자 미지원, 아스키 문자(1byte)만 가능)
		
		
		2. BufferedReader 클래스
		
		
		
		3. Scanner 클래스
		
		
		
		*/
		
		/* 요구사항: 사용자에게 문자 1개 입력 받고 화면에 출력하기
		1. 라벨 출력
		2. 문자 입력 받기
		3. 문자를 화면에 출력 */
		
		System.out.print("문자 입력: ");
		
		int code = System.in.read(); 
		/* 사용자로부터 입력을 받아서 입력한 문자를 돌려주는 역할
		현재 상태: 사용자가 키를 입력하기를 기다리는 상태 
		(블럭 block 걸렸다) 라고 표현 
		=> 사용자가 입력해야 대기 상태 해제됨
		=> 값이 입력되면 System.in.read();이 사라지고 그 자리에 결과값이 반환됨 */
		
		System.out.println("출력: " + code); // 출력: 97
		System.out.printf("출력: %d\n", code); // 출력: 97
		System.out.printf("출력: %c\n", code); // 출력: a
		// 입력한 글자를 형태 그대로 볼 수 있음 
		// (char(%c)를 사용했기 때문에 한 글자로 표현됨)
		
		
		// 콘솔에 A를 치고 엔터, B를 치고 엔터침
		code = System.in.read(); 
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code); // A

		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code); // \r
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code); // \n
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code); // B
		
		code = System.in.read();
		System.out.printf("출력: %d\n", code);
		System.out.printf("출력: %c\n", code); // \r 
		
		
		/* 키보드에서 입력된 문자가 버퍼에 생기고, 
		프로그램이 버퍼에 있는 문자를 읽어 유니코드로 반환한다. 
		(프로그램이 읽어가면 버퍼에 있던 문자는 사라진다)
		버퍼(buffer): 입력받은 값을 저장해두었다가 버퍼가 가득 차거나 
		개행 문자가 나타나면 버터의 내용을 한 번에 전송한다. 
		
		Q. \r : 13,  \n : 10이 출력되는 이유
		A. 엔터(\r\n)도 입력됐기 때문에 13과 10이 출력된다. */
		
		
		
		
		
		
		
		
	}

}
