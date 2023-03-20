package kr.ac.kopo.day10;

import java.util.Scanner;

public class StringUtil {
	
	
	boolean isUpperChar(char c) {
		if((int)c < 97) {
			return true;
		}else {
			return false;
		}
	}
	boolean isLowerChar(char c) {
		if((int)c < 97) {
			return false;
		} else {
			return true;
		}
	}
	int maxReturn(int i, int j) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		i = num;
		int num2 = sc.nextInt();
		j = num2;
		if(i > j) {
			return i;
		} else {
			return j;
		}
	}
	int minReturn(int i, int j) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		i = num;
		int num2 = sc.nextInt();
		j = num2;
		if(i > j) {
			return j;
		} else {
			return i;
		}
	}
	String reverseString(String str) {
		String[] reverse = new String[10];
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
	}
}