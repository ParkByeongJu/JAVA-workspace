package kr.ac.kopo.day14.homeworkReview;

public abstract class Figure {
	
	private double area;
	
	
	//가지고 있는 값을 외부에 보여줄땐 get을 사용
	public double getArea() {
		return this.area;
	}
	//외부에 수정을 할것을 보여줄때는 Set을 사용
	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void printArea();
}
