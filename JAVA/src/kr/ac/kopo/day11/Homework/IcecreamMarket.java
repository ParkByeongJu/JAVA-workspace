package kr.ac.kopo.day11.Homework;

import java.util.Scanner;

public class IcecreamMarket {
	
	ScannerIcecream scan = new ScannerIcecream();
	Icecream[] iceArr;
	
	void buy() {
		int cnt = scan.nextInt("아이스크림 몇개 구입할래?");
		iceArr = new Icecream[cnt];
		
		for(int i = 0; i < iceArr.length; i++) { 
			System.out.println("***" + (i + 1) + "번째 아이스크림 구매 정보 입력");
			String name = scan.nextString("아이스크림 명 : ");
			int price = scan.nextInt("아이스크림 가격 : ");
			iceArr[i] = new Icecream(name, price); 
		}
	}
	void outPut() {
		System.out.println(" < 총" + iceArr.length + "개 구매정보 출력 >");
		System.out.println("번호  아이스크림 명  아이스크림 가격");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.print((i + 1) + "\t");
			iceArr[i].info();
		}
	}
	void process() {
		buy();
		outPut();
	}
	
}
