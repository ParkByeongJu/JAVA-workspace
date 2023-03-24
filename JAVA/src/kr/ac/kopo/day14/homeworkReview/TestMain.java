package kr.ac.kopo.day14.homeworkReview;

class One{
	private 	int a;
	protected 	int b;
	public 		int c;
	
	public void ptint() {
		System.out.println(" a : " + this.a);
		System.out.println(" b : " + this.b);
		System.out.println(" c : " + this.c);
	}
}

class Two extends One{
	private 	int a2;
	protected 	int b2;
	public 		int c;
	
	public void print() {
		this.c = 10;
		super.c = 10;
	}
}

public class TestMain {
	
	public static void main(String[] args) {
		
	}

}
