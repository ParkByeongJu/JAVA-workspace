package kr.ac.kopo.day06.Lecture;

import java.util.Scanner;

public class LectureMain07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작단을 입력 : ");
		int start = sc.nextInt();
		Scanner sca = new Scanner(System.in);
		System.out.println("종료단을 입력 : ");
		int end = sc.nextInt();
		
		if(end >= start) {
			System.out.println("***" + start + "단" +"***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", start, i, start * i);	
			}
			System.out.println("***" + end + "단" + "***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", end, i, end * i);
			}
		} else {
			System.out.println("***" + end + "단" +"***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", end, i, end * i);	
			}
			System.out.println("***" + start + "단" + "***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", start, i, start * i);
			}
		}
		
		
		
	}

}
