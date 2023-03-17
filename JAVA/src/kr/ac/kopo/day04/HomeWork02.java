package kr.ac.kopo.day04;

/*
 
 2. 물건값을 입력하고, 돈을 지불했을 때 거스름돈과 잔액을 표시하는 코드를 작성하시오
   물건값을 입력 : 4230
   지불한 돈 입력 : 10000
   거스름돈 : 5770원
   1000원 : 5개
    500원 : 1개
    100원 : 2개
     50원 : 1개
     10원 : 2개
        
   물건값을 입력 : 4230
   지불한 돈의 액수 : 3000
   1230원이 부족합니다
 
 */

import java.util.Scanner;

public class HomeWork02 {
	
	public static void main(String[] args) {
		
		System.out.print("물건값 입력 : ");
		Scanner sc = new Scanner(System.in); //물건 값 입력
		int value = sc.nextInt();
		
		System.out.print("지불한 돈 입력 : ");
		Scanner sca = new Scanner(System.in); // 지불한 돈 입력
		int pay = sca.nextInt();
		
		int change = pay - value; // 거스름돈
		if (value > pay) {
			System.out.printf("%d원이 부족합니다.", value - pay);
		} else {
		
			System.out.println("거스름돈 : " + change); // 거스름돈 출력
			
			int change1000 = change / 1000; 
			int change500 = (change % 1000) / 500;
			int change100 = ((change % 1000) % 500) / 100;
			int change50 = (((change % 1000) % 500) % 100) / 50;
			int change10 = ((((change % 1000) % 500) % 100) % 50) / 10;
			
			System.out.printf("1000원 : %d개\n", change1000);
			System.out.printf("500원 : %d개\n", change500);
			System.out.printf("100원 : %d개\n", change100);
			System.out.printf("10원 : %d개\n", change50);
			System.out.printf("10원 : %d개\n", change10);
			
		}
				
	}

}
