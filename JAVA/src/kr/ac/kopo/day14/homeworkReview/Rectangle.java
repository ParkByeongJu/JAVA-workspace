package kr.ac.kopo.day14.homeworkReview;

public class Rectangle extends PlainFigure{
	
	protected String name;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
		double area = width * height;
		name = "직사각형";
		setArea(area);
	}
	
	@Override
	public void printArea() {
		System.out.printf("가로 %d 세로 %d인 %s의 넓이 : %f\n", getWidth(), height, name, getArea() );
	}
}
