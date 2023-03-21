package kr.ac.kopo.day11.Homework;

import java.util.Scanner;

public class ScannerIcecream {
	
	Scanner sc;
	
	ScannerIcecream(){
		sc = new Scanner(System.in);
	}
	
	char nextChar(String msg) {
		System.out.print(msg);
		return sc.nextLine().charAt(0);
	}
	
	int nextInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String nextString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}

}
