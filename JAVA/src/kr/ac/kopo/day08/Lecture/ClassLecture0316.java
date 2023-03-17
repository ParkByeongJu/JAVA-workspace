package kr.ac.kopo.day08.Lecture;

import java.util.Scanner;

public class ClassLecture0316 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();

		Student[] arr = { s1, s2, s3, s4, s5 };

		int sum = 0;
		int error = 0;
		double aver = 0;

		System.out.println("<성적을 입력해주세요>");
		for (int i = 0; i < arr.length; i++) {
			arr[i].num = (i + 1);
			System.out.printf("%d's 성적 : ", arr[i].num);
			arr[i].score = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].num + "\t");
			
			if (arr[i].score >= 0 && arr[i].score <= 100) {
				if (90 <= arr[i].score) {
					arr[i].grade = 'A';
				} else if (80 <= arr[i].score) {
					arr[i].grade = 'B';
				} else if (70 <= arr[i].score) {
					arr[i].grade = 'C';
				} else if (60 <= arr[i].score) {
					arr[i].grade = 'D';
				} else if (arr[i].score >= 0 && arr[i].score < 60) {
					arr[i].grade = 'F';
				}
				System.out.print(arr[i].score + "\t" + arr[i].grade + "\n");
				sum += arr[i].score;
			} else {
				System.out.println("ERROR!!");
				++error;
			}
		}
		System.out.println("\n5명 입력중 [" + error + "]회 에러발생");
		System.out.println("총점 : " + sum + "점");
		System.out.printf("평균 : %.1f점", (double) sum / 5);
		}
		
	}
