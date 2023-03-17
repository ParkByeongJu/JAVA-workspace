package kr.ac.kopo.day06.Lecture;

import java.util.Scanner;

public class LectureMain05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9단 사이의 단을 입력 : ");
		int dan = sc.nextInt();
		
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
			
		
		
		
	}

}
