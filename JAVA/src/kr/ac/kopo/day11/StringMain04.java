package kr.ac.kopo.day11;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		char ch = 'l';
		
		int idx = str.indexOf(ch);
		
		idx = -1;
		while((idx = str.indexOf(ch)) != -1) {
			System.out.println(ch + "위치 : " + idx);
		}
		
		/*
		while(idx != -1) {
			System.out.println(ch + "위치 : " + idx);
			idx = str.indexOf(ch, idx + 1);
		}
		*/
		
	}
	
}
