package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 정수 :");
		int num02 = sc.nextInt();
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		
		String result = bool ? "배수입니다." : "배수가 아닙니다.";
		
		System.out.printf("%s는 %d의 배수여부 : %S", num01, num02, result);
		
	}

}
