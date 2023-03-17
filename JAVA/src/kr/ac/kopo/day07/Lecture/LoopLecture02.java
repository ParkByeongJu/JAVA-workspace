package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class LoopLecture02 {

	public static void main(String[] args) {
		
		System.out.print(" 숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
