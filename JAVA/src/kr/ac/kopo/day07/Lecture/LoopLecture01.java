package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class LoopLecture01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
