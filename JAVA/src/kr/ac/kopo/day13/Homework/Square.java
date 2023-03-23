package kr.ac.kopo.day13.Homework;


public class Square extends Shape {
	
	ScannerShape scan = new ScannerShape();
	
	public int width = scan.nextInt("한변의 길이를 입력하세요 : ");
	public int area = width *width;
		

	@Override
	void area() {
		System.out.printf("한변 %d인 정사각형의 넓이는 %d이다.", width, area);
		
	}

}
