package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class LoopLecture05 {
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
			
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 9; j >= i * 2 + 1; j--) {
				System.out.print("*");
				
			}

			System.out.println();
		}

	}


}
