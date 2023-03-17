package kr.ac.kopo.day05;

public class ContinueMain2 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		for(cnt = 1; cnt <=10 ; cnt++) {
			
			if(cnt >= 3) {
				continue;
				
			}
			System.out.println("Hi");
		}
		System.out.println("cnt : " + cnt);
	}

}
