package kr.ac.kopo.day03;

/*
 
 	두개 정수 입력 : 12 5
 	12는 5의 배수판단 : 거짓
 	
 	두개 정수 입력  : 12 6
 	12는 6의 배수판단 : true
 
 */

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		int num01 = 12, num02 = 0;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		
		System.out.printf("%d는 %d의 배수판단 : %b\n", num01, num02, bool);
		
	}

}
