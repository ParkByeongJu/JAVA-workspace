package kr.ac.kopo.day02;

public class VariableMain02 {
	
	public static void main(String[] args) {
		
		double num = 12.34;
		
		num = /*(double)*/34;  //묵시적형변환(키워드를 생략할 수 있는 경우)
				
		System.out.println("num : " + num);
		
		int num2;
		
		num2 = (int)45.67; //강제적(명시적)형변환
		
		System.out.println("num : " + num2);
		
		float num3;
		
		num3 = (float)10.4;
		
		num3 = 10.4f;
		
		System.out.println("num3 : " + num3);
		
		System.out.println(12 + (int)12.34);
		
		System.out.println((double)12 + 12.34);
		
		System.out.println(12 + 12.34);
		
	}

}
