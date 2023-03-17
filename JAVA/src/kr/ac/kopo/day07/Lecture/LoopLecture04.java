package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class LoopLecture04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 1) {

			for (int i = 1; i <= num; i++) {
				if (i <= num / 2 + 1) {
					for (int j = 1; j <= (num / 2 + 1) - i; j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
				} else {
					for (int j = 1; j <= i - (num / 2 + 1); j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= (num + 1) - i; j++) {
						System.out.print("*");
					}
				}

				System.out.println();
			}
		} else {
			num = num - 1;
			
			for (int i = 1; i <= num; i++) {
				if (i <= num / 2 + 1) {
					for (int j = 1; j <= (num / 2 + 1) - i; j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
				} else {
					for (int j = 1; j <= i - (num / 2 + 1); j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= (num + 1) - i; j++) {
						System.out.print("*");
					}
				}

				System.out.println();
			}
		}

	}
}
