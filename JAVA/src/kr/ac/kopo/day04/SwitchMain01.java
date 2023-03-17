package kr.ac.kopo.day04;

/*
 
 1 - 3 사이의 정수 입력 : 
 
 1입력 => ONE
 2입력 => TWO
 3입력 => THREE
 그외 입력 => ERROR
 
 */

import java.util.Scanner;

public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3 사이의 정수 : ");
		int no = sc.nextInt();
		
		switch(no) {
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			default :
				System.out.println("ERROR");
		}
		
		if(no == 1) {
			System.out.println("ONE");
		} else if(no == 2){
			System.out.println("TWO");
		} else if (no == 3) {
			System.out.println("THREE");
		}else {
			System.out.println("ERROR");
		}
		
	}

}
