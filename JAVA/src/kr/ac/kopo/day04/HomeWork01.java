package kr.ac.kopo.day04;

/*
 
  1. 반지름을 입력받아 원의 넓이과 둘레를 출력하는 코드 작성  (소수점 4째짜리 출력)
   반지름 입력 : 10
   반지름 : 10 => 원넓이 : 314.1492  원둘레  : 62.8318
 
 */

import java.util.Scanner;

public class HomeWork01 {
	
	public static void main(String[] args) {
		
		System.out.print("반지름 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double area = 3.141592 * (num * num);
		double round = 2 * 3.141592 * num;
		
		System.out.printf("원의 넓이 : %.4f\n", area);
		System.out.printf("원의 둘레 : %.4f\n", round);
		
	}

}
