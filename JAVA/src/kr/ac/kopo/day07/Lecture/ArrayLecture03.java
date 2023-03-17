package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class ArrayLecture03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		int sum =0;
		int error = 0;
		double aver = 0;

		System.out.println("< 성적을 입력해주세요 >");

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "'s 성적 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("< PRINT >");
		System.out.println("번호" + "\t" + "성적" + "\t" + "학점");
		
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] > 100 || arr[i] < 0) {
				System.out.println((i + 1) + "\t" + "ERROR!!");
				arr[i] = 0;
				error++;
			} else {
				if(arr[i] >= 90) {
					System.out.print((i + 1) + "\t" + arr[i] + "\t" + "A");
				}else if(arr[i] >= 80) {
					System.out.print((i + 1) + "\t" + arr[i] + "\t" + "B");
				}else if(arr[i] >= 70) {
					System.out.print((i + 1) + "\t" + arr[i] + "\t" + "c");
				}else if(arr[i] >= 60) {
					System.out.print((i + 1) + "\t" + arr[i] + "\t" + "D");
				}else if(arr[i] >= 0) {
					System.out.print((i + 1) + "\t" + arr[i] + "\t" + "F");
				}
				sum = sum + arr[i];
				
			System.out.println();
			
			}
	}
		for(int i = 0; i < arr.length; i++) {
			aver = (double)sum / arr.length;
			
				
		}
		System.out.println();
		System.out.println(arr.length + "명 입력 중 [" + error + "]회 에러 발생" );
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f", aver);

	}
	

}
