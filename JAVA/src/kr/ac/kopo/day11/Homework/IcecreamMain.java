package kr.ac.kopo.day11.Homework;

import java.util.Scanner;

public class IcecreamMain {
	
	public static void main(String[] args) {
		
		ScannerIcecream scan = new ScannerIcecream(); 
		
		
		int num = scan.nextInt("아이스크림을 몇개 구입할래?");
		
		
		
		for(int i = 1; i <= num; i++) {
			System.out.println("***" + i + "번째 아이스크림 구매 정보 입력 ***");
			String name = scan.nextString("아이스크림 명 : ");
			int price = scan.nextInt("아이스크림 가격 : "); 
			
			System.out.println("< 총 " + i + "개의 아이스크림 구매 정보 출력 >");
			System.out.println("번호 \t 아이스크림명 \t 아이스크림 가격");
			for(int j = 1; j <= num; j++) {
				System.out.println(j + "\t" + name + "\t" + price);
		}
		
			
		}
		
	}

}
