package kr.ac.kopo.day09;

import java.util.Scanner;
import java.util.Random;

public class QuizHomework {
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int random = ran.nextInt(100)+1;
		
		int max = 100;
		int min = 1;
		
		System.out.println("1-100사이의 정수를 입력해주세요!");
		
		for(int i = 5; i >= 0 ; i--) {
			System.out.print(min + "-" + max + " : ");
			int num = sc.nextInt();
			
		
			if(random == num) {
				System.out.println("축하합니다. 정답입니다");
				break;
			} else if(random > num){
				System.out.println(num + "보다 큰 수 입니다.");
				min = num;
				
			} else {
				System.out.println(num + "보다 작은 수 입니다.");
				max = num;
			}
			
			if(i == 0) {
				System.out.println("아쉽습니다. 기회를 소진하셨습니다.");
				break;
			}
			
			System.out.println("기회는 총 "+ i + "번 남았습니다.");
		}
		
		System.out.printf("정답은 [%d] 입니다.", random);
		
	}

}
