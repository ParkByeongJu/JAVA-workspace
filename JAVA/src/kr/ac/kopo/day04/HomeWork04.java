package kr.ac.kopo.day04;

/*
 
 4. 4개의 정수를 입력받아 가장 큰수를 출력하는 코드 작성

  4개의 정수 입력 : 23 8 567 34
  가장 큰수 : 567
 
 */

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
		System.out.print("첫번째 정수 : ");
		Scanner sc01 = new Scanner(System.in);
		int num01 = sc01.nextInt();
		
		System.out.print("두번째 정수 : ");
		Scanner sc02 = new Scanner(System.in);
		int num02 = sc02.nextInt();
		
		System.out.print("세번째 정수 : ");
		Scanner sc03 = new Scanner(System.in);
		int num03 = sc03.nextInt();
		
		System.out.print("네번째 정수 : ");
		Scanner sc04 = new Scanner(System.in);
		int num04 = sc04.nextInt();
		
		if(num01 > num02) {
			if(num01 > num03) {
				if(num01 > num04) {
					System.out.println(num01);
				}else {
					if (num01 < num04) {
						System.out.println(num04);
					}
				}
			}else {
				System.out.println(num03);
			}
		}else {
			System.out.println(num02);
		}
		
	}
	
}
