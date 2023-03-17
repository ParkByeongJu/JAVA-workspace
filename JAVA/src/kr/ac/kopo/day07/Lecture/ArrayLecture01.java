package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class ArrayLecture01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		System.out.println("< 10개의 정수를 입력해 주세요 >");

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i  + 1) + "num : ");
			arr[i] = sc.nextInt();
		}
		
			
		System.out.print("< 홀수 >\n");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				System.out.printf("%d\t", arr[i]);
			} 
		}
		
		System.out.print("\n< 짝수 >\n");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.printf("%d\t", arr[i]);
			} 
		}

	}

}
