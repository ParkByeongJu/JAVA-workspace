package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class LoopLecture06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자를 입력해주세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 1) {
			int n = 1;
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					System.out.print(((j >= n + 1) && (j <= num - n)) ? " " : "*");
				}
				if (i < num / 2 + 1) {
					n++;
				} else {
					n--;
				}

				System.out.println(" ");
			}

		} else {

			num = num - 1;
			int n = 1;
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					System.out.print(((j >= n + 1) && (j <= num - n)) ? " " : "*");
				}
				if (i < num / 2 + 1) {
					n++;
				} else {
					n--;
				}

				System.out.println(" ");
			}

		}

	}
}

