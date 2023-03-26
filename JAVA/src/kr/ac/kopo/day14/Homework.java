package kr.ac.kopo.day14;

import java.util.Scanner;
import java.util.Random;

public class Homework {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		int user1, user2, user3; //유저가 입력하는 변수
		int cnt = 0;//기회 초기화
		int sCnt = 0, bCnt = 0, oCnt = 0; //스트라이크, 볼, 아웃 초기화
		
		
		System.out.println("야구 게임을 시작합니다.");
		while(true) {
			num1 = (int)random.nextInt(100) % 9 + 1; //컴퓨터에 난수 입력1
			num2 = (int)random.nextInt(100) % 9 + 1; //컴퓨터에 난수 입력2
			num3 = (int)random.nextInt(100) % 9 + 1; //컴퓨터에 난수 입력3
			
			if(!(num1 == num2 || num2 == num3 || num1 == num3)) {
				break;
			}
		}
		
		while(cnt > 0) {
			System.out.println("숫자를 입력해주세요");
			user1 = sc.nextInt();
			user2 = sc.nextInt();
			user3 = sc.nextInt();
			
			if(num1 == user1) {
				sCnt++;
			}
			if(num2 == user2) {
				sCnt++;
			}
			if(num3 == user3) {
				sCnt++;
			}
			
			if((num1 == user2) || (num1 == user3)){
				bCnt++;
			}
			if((num2 == user1) || (num2 == user3)){
				bCnt++;
			}
			if((num3 == user1) || (num3 == user1)){
				bCnt++;
			}
			
			cnt++;
			
			if(sCnt == 3) {
				System.out.printf("%d Strike 입니다.\n", sCnt);
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				if(sCnt == 0 && bCnt == 0) {
					oCnt++;
					System.out.printf("%d Out입니다.\n", oCnt);
				} 
				else {
					System.out.printf("%d %d %d\t%d Strike %dBall 입니다.\n",user1, user2, user3, sCnt, bCnt);
				}
				
				sCnt = 0;
				bCnt = 0;
				
			}
			
			if(oCnt == 3) {
				System.out.printf("%d Out으로 게임을 종료 합니다.\n", oCnt);
				System.out.printf("정답은 %d %d %d 입니다.", num1, num2, num3);
				break;
			} 
			
			if(cnt == 6){
				System.out.printf("기회를 모두 사용하셨습니다.\n");
				System.out.printf("정답은 %d %d %d 입니다.", num1, num2, num3);
				break;
			}
			
			
			
		}
		
	}

}
	


