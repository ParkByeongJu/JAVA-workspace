package kr.ac.kopo.day13.Homework;

public class Triangle extends Shape {

	public void area() {

		int width = scan.nextInt("밑변의 길이를 입력하세요 : ");
		int height = scan.nextInt("높이의 길이를 입력하세요 : ");

		int area = (width * height) / 2;

		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이는 %d입니다.", width, height, area);
	}

}
