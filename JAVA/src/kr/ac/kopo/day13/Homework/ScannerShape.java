package kr.ac.kopo.day13.Homework;

import java.util.Scanner;


public class ScannerShape {
	
	Scanner sc = new Scanner(System.in);
	
	int nextInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		return num;
	}
	

}
