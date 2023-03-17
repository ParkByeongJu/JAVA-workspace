package kr.ac.kopo.day05;

public class LoopLecture08 {
	
	public static void main(String[] args) {
		
		int i,j;
		
		/*
		 //방법2
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if(j < i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		
		 //방법1
		for(i = 1; i <= 5; i++) {
			
			for(j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= 6-i; j++){
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}