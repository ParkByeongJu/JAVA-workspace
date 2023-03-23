package kr.ac.kopo.day13.Homework;

public class Circle extends Shape {

	ScannerShape scan = new ScannerShape();

	public int radius = scan.nextInt("한변의 길이를 입력하세요 : ");

	double area = (double)radius * (double)radius * 3.14;

	public void area() {

		System.out.printf("반지름이 %d인 원의 넓이는 %.1f입니다.", radius, area);
	}

}
