package kr.ac.kopo.day15.Homework;

import java.util.Scanner;
import java.util.Random;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1; 	// 가위
	final static int ROCK 	= 2; 	// 바위
	final static int PAPER 	= 3; 	// 보

	Random random = new Random();
	Scanner sc = new Scanner(System.in);

	@Override
	public int startGame(int you) {
		
		
		int me = random.nextInt(3)+1;
		int user = sc.nextInt();
		
//		if() {
//			
//		}
		
	}

}
