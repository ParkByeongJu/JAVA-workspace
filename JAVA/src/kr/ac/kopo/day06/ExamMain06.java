package kr.ac.kopo.day06;

public class ExamMain06 {

	public static void main(String[] args) {

		int n = 1;
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(((j >= n+1) && (j <= 9-n))? " " : "*");
			}
			if(i <5) {
				n++;
			} else {
				n--;
			}

			System.out.println(" ");
		}

	}

}
