package com.test.java;

public class Ex06_Output {
public static void main(String[] args) {
	
	/* 콘솔 입출력 
	 (Console Input Output => IO)
	 - 기본 입력 장치: 키보드
	 - 기본 출력 장치: 모니터
	 
	 콘솔 출력
	 - 클래스.필드.메서드(인자, parameter);
	 
	 1. println 메서드: System.out.println();
	 - print line > 값을 출력한 뒤 엔터를 친다. (줄바꿈)
	 
	 2. print 메서드: System.out.print();
	 - 값을 출력한 뒤 엔터를 안 친다. (줄바꿈 X)
	 
	 
	 3. printf 메서드: System.out.printf();
	 - print format > 출력 형식을 제공
	 - String.formt() 메서드와 동일함
	 
	 printf()
	 - 형식 문자(Place Holder) 제공
	 - *가독성 향상
	 
	 형식 문자
	 1. %s : String (실제 들어갈 데이터의 자료형에 맞음)
	 2. %d : Decimal(정수) - byte, short, int, long
	 3. %f : Float(실수) - float, double
	 4. %c : Char(캐릭터) 
	 5. %b : Boolean
	 
	 
	 형식 문자 확장 기능
	 1. %숫자d, %숫자s, %숫자f, %숫자c, %숫자b
	 - 출력할 내용의 너비를 지정한다. (탭(tab)처럼 열을 맞추기 위한 기능)
	 - 양수(+): 우측 정렬
	 - 음수(-): 좌측 정렬
	 
	 출력할 공간을 10칸 확보 (문자 포함) 
	 
	 2. %.숫자f (%f만 사용)
	 - 소수점 이하 자릿수 지정
	 - %.2f\n", num2 => 소수점 이하 2번째까지만 표현
	 - %.1f\n", num2 => 소수점 이하 1번째까지만 표현
	 - 반올림이 될 수도 있으니 확인하고 사용하기
	 
	 3. %,d / %,f
	 - 자릿수 표기(천 단위 -> 3자리 마다)
	 - 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	/*
	 System.out.println(100); 
	 System.out.println(200);
	 System.out.println(300);
	 
	 System.out.println();
	
	 System.out.print(100);
	 System.out.print(200);
	 System.out.print(300);
	*/
	
	/* 1. println 메서드: System.out.println();
	  2. print 메서드: System.out.print();
	 성적표 출력 */
	 String name1 = "홍길동";
	 int kor1 = 100;
	 int eng1 = 90;
	 int math1 = 90;
	 
	 String name2 = "아무개";
	 int kor2 = 95;
	 int eng2 = 98;
	 int math2 = 87;
	 
	 System.out.println("==================================");
	 System.out.println("	     성적표");
	 System.out.println("==================================");
	 System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
	 System.out.println("----------------------------------");
	 
	 System.out.print(name1);
	 System.out.print("\t");
	 System.out.print(kor1 + "\t");
	 System.out.print(eng1 + "\t");
	 System.out.print(math1 + "\r\n");
	 System.out.println();
	
	 System.out.print(name2 + "\t" + kor2 + eng2 + math2);
	 
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 
	 
	 
	 /* 3. printf 메서드: System.out.printf();
	 요구사항: "안녕하세요, 홍길동님" 문장 출력 */
	 
	 String name = "홍길동"; // 사용자가 직접 입력한 이름
	 
	 System.out.println("안녕하세요. " + name + "님");
	 
	 System.out.printf("안녕하세요. %s님\r\n", name); 
	 // %s를 적고 뒤에 ,(콤마)와 변수 
	 // %s는 줄 서기 알바생, 출력 전에 뒤에 있는 변수와 자리를 바꿈
	
	 System.out.println();
	 
	 // 요구사항: "안녕하세요, 홍길동님. 안녕히 가세요. 홍길동님." 출력
	 System.out.println("안녕하세요. " + name + "님." + " 안녕히 가세요. " + name + "님.");
	 
	 System.out.printf("안녕하세요, %s님. 안녕히 가세요. %s님.", name, name); // %s의 갯수에 맞게 변수 갯수를 맞춰줘야 함

	 System.out.println();
	 System.out.println();
	 
	 
	 // 형식 문자
	 // 1. %s : String (실제 들어갈 데이터의 자료형에 맞음)
	 System.out.printf("문자열: %s\n", "문자열");

	 // 2. %d : Decimal(정수) - byte, short, int, long
	 System.out.printf("정수: %d\n", 100);
	 
	 // 3. %f : Float(실수) - float, double
	 System.out.printf("실수: %f\n", 3.14); // 소수 이하 6자리까지 표현
	 
	 // 4. %c : Char(캐릭터) 
	 System.out.printf("문자: %c\n", 'A');
	 
	 // 5. %b : Boolean
	 System.out.printf("논리: %b\n", true);
	 
	 
	 // 형식 문자 확장 기능
	 // 1. %숫자d, %숫자s, %숫자f, %숫자c, %숫자b
	 int num = 123;
	 
	 System.out.printf("[%d]\n", num);
	 System.out.printf("[%10d]\n", num); // 출력할 공간을 10칸 확보 (문자 포함), 우측 정렬 (10칸 중 오른쪽부터)
	 System.out.printf("[%-10d]\n", num); // 좌측 정렬 (10칸 중 왼쪽부터)
	 
	 
	 // 2. %.숫자f
	 double num2 = 3.14;
	 
	 System.out.println(num2);
	 System.out.printf("%.2f\n", num2); // 소수점 이하 2번째까지만 표현 (.2)
	 System.out.printf("%.1f\n", num2); // 소수점 이하 1번째까지만 표현 (.1)
	 System.out.printf("%.3f\n", 3.4567); // 3.457로 반올림
	 
	 // 3. %,d / %,f
	 int price = 1234567;
	 
	 System.out.printf("금액: %d원\n", price);
	 System.out.printf("금액: %,d원\n", price);
	 
	 
	 // 천 단위 + 소수점 이하(2자리) + 출력 너비(20, 우측 정렬)
	 double num3 = 1234567.7890123;
	 System.out.printf("[%,20.2f]", num3); // % 천 단위 + 출력 너비 + 소수점 이하 f 순으로 작성
	 
	 
	 System.out.println();
	 System.out.println();

	 
	 // 메뉴판 출력 > 열 정렬 = 탭(\t) + %숫자d를 혼합하여 사용
	 System.out.println("========================");
	 System.out.println("   음료 가격(단위:원)");
	 System.out.println("========================");
	 System.out.printf("콜라:\t\t%,6d\n", 2500);
	 System.out.printf("스무디:\t\t%,6d\n", 3500);
	 System.out.printf("사이다:\t\t%,6d\n", 500);
	 System.out.printf("아메리카노:\t%,6d\n", 15000); // 제일 긴 숫자에 맞춰서 우측 정렬 (자릿수 6)
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
