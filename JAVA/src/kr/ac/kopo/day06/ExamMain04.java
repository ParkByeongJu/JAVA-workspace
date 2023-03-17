package kr.ac.kopo.day06;

public class ExamMain04 {

	public static void main(String[] args) {
		
		int num = 5;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 9; j >= i * 2 + 1; j--) {
				System.out.print("*");
				--num;
			}

			System.out.println();
		}

	}

}
