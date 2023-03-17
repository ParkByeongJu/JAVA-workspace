package kr.ac.kopo.day09;

public class MethodMain01 {
	
	static int prnStar(int num, String data) {
		System.out.println("**********");
		System.out.println("호출자가 넘겨준 정수 : " + num);
		System.out.println("호출자가 넘겨준 문자열 : " + data);
		int sum = num % 10 + num / 10;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int cnt = 10;
		int s = prnStar(cnt, "abc");
		System.out.println("자리수 합 : " + s);
		System.out.println("Hello");
		s = prnStar(5,"hi");
		System.out.println("자리수 합 : " + s);
		System.out.println("HI");
		s = prnStar(22,"good");
		System.out.println("Good-Bye");
		System.out.println("자리수 합 : " + s);
		s = prnStar(90, "bye");
		System.out.println("자리수 합 : " + s);
	}

}
