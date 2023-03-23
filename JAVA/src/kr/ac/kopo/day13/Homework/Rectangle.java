package kr.ac.kopo.day13.Homework;

public class Rectangle extends Shape {

	public int width = scan.nextInt("가로의 길이를 입력하세요 : ");
	public int height = scan.nextInt("세로의 길이를입력하세요 : ");

	public int area = width * height;

	public void area() {

		System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이는 %d입니다.", width, height, area);
	}

}
