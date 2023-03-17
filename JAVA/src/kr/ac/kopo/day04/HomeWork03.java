package kr.ac.kopo.day04;

/*
 
 3. 3개의 정수를 입력받아 작은수에서 큰수순으로 출력하는 코드 작성
  정수 3개를 입력 : 12 7 22
  
  첫번째 정수 : 12
  두번째 정수 : 7
  세번째 정수 : 212
  
  7  12  22
 
 */

import java.util.Scanner;

public class HomeWork03 {

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
		
		if (num01 < num02) {
			
			if (num01 < num03) {
				
				if (num02 < num03) {
				
					System.out.println(num01 + " " + num02 + " " + num03);
				
				} else {
					System.out.println(num01 + " " + num03 + " " + num02);
				}
			}else {
				System.out.println(num03 + " " + num01 + " " + num02);
			}
		
		}else {
			if (num02 < num03) {
				if (num01 < num03) {
					System.out.println(num02 + " " + num01 + " " + num03);
				}else { 
					System.out.println(num02 + " " + num03 + " " + num01);
				}
			}else {
				System.out.println(num03 + " " + num02 + " " + num01);
			}
		}
	}
}