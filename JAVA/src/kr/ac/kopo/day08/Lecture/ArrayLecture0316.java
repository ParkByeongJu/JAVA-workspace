package kr.ac.kopo.day08.Lecture;

import java.util.Scanner;

public class ArrayLecture0316 {
	
	public static void main(String[] args) {
		
		
		int[][] arr = new int[10][20];
		Scanner sc = new Scanner(System.in);
		System.out.print("< 정수를 입력하세요. 단 0입력시 종료>");
		int i = 0, j = 0, k = 0;
		
		for(i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			for(j = num, k = 0; j >= 1; j--) {
				if(num % j == 0) {
					arr[i][k] = j;
					k++;
				}
			}
		}
		for(i = 0; i <arr.length; i++) {
			if(arr[i][0] != 0) {
				System.out.printf("%d의 약수 : ",arr[i][0]);
			}
			for(j = 0; j <= arr[i][0];) {
				if(arr[i][j] != 0) {
					System.out.print(arr[i][j] + "\t");
					j++;
				} else {
					break;
				}
			}
			System.out.println();
		}				
	}

}
