package kr.ac.kopo.day07.Lecture;

import java.util.Scanner;

public class ArrayLecture02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("< 0 - 99사이의 정수 5개 입력해주세요. >");

		
		for(int i = 0; i < arr.length; ) {
			System.out.print((i+1) + "num : ");
			arr[i] = sc.nextInt();
			if(arr[i] <= 99 && arr[i] >= 0) {
				i++;
			}
			
		}
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		
		}
		System.out.println();
		System.out.println("< REVERSE >");
		for(int i = arr.length - 1; 0 <= i; i--) {
			arr[i] = ((arr[i] % 10) * 10) + arr[i] / 10;
			
			System.out.print(arr[i] + "\t");
			
		}

	}

}
