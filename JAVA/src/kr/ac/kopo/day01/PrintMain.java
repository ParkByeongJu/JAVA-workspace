package kr.ac.kopo.day01;


/*
   출력메소드  System.out.출력메소드()
   print() : 개행문자 X
   println() : 개행문자 O
   printf() : 변환문자를 이용하여 상수 출력 (%c : 문자, %d : 10진수 정수, %f : 실수, %s : 문자열, %b : 논리값), 개행문자 X
 
 */
public class PrintMain {
	
	public static void main(String[] args) {
		
		
		System.out.println('A' + 'B');
		System.out.println(10 + ' ');
		
		System.out.println(10 + " " + 12.34 + " " + "홍길동");
		
		// 10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		
		
		System.out.println('홍');
		//방법3
		System.out.print("A\n");
		//방법2
		System.out.print('A');
		System.out.print('\n');
		//방법1
		System.out.println('A');
		
		System.out.println(10);
		System.out.println(12.34);
		
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 10, 12.34, "홍길동");//오른정렬
		System.out.printf("[%5d] %.1f %s\n", 1000, 12.34, "홍길동");//오른정렬
		System.out.printf("[%-5d] %.1f [%5s]\n", 1000, 12.34, "홍길동");//정수 왼쪽정렬, 문자 오른정렬
		System.out.printf("[%-5d] %.1f [%-5s]\n", 1000, 12.34, "홍길동");//정수 왼쪽정렬, 문자 왼쪽정렬
		System.out.printf("[%05d] %.1f [%-10s]\n", 123, 12.34, "홍길동");//정수 왼쪽정렬, 문자 왼쪽정렬
		System.out.printf("[%05d] %.1f [%-10s]\n", 123, 12.34, "홍길동");//정수 왼쪽정렬, 문자 왼쪽정렬
		System.out.printf("[%5d] %.1f [%-5s]\n", 1235678, 12.34, "홍길동");
		System.out.printf("4 > 2 : %b\n", 4 > 2);
		
	}

}
