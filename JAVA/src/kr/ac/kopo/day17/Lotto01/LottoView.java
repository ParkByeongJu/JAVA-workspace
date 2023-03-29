package kr.ac.kopo.day17.Lotto01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoView {

	Random random = new Random();

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 3;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}

	private int[] getLotto() {
		int[] lottoNums = new int[6];
		loop: for (int i = 0; i < lottoNums.length;) {
			lottoNums[i] = random.nextInt(45) + 1;
			boolean bool = true;
			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					continue loop;
				}
			}

			i++;
		}
		/*
		 * int[] lottoNums = new int[6];	
		 * for (int i = 0; i < lottoNums.length; ) {
		 * 		lottoNums[i] = random.nextInt(45) +1; 
		 * 		boolean bool = true; 
		 * 		for (int j = 0; j < i; j++) { 
		 * 			if (lottoNums[i] == lottoNums[j]) { 
		 * 				System.out.print('!'); 
		 * 				bool = false; 
		 * 				break; 
		 * 			} 
		 * 		} 
		 * if(bool) {
		 * 	i++; 
		 * 	} 
		 * }
		 */

		return lottoNums;
	}
}
