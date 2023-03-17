package kr.ac.kopo.day09;

import java.util.Random;

public class RandomMain {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int random = r.nextInt();//매개변수 값으로 바운더리 설정가능
		System.out.println(random);
		
	}

}
