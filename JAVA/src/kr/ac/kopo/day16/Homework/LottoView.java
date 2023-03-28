package kr.ac.kopo.day16.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoView {

	Random random = new Random();

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}
	/*
	 * 1번
	 */
//	private Integer[] getLotto() {
//		
//				
//		Set <Integer> set = new HashSet<Integer>();
//		for(; 6 > set.size();) {
//			set.add(random.nextInt(45) + 1);
//		}
//		Integer[] dataArr = set.toArray(new Integer[0]);
//		
//		return dataArr; 
//	}

	/*
	 * 2번
	 */
//	private int[] getLotto() {
//		
//		List<Integer> list = new ArrayList<>();
//		for(int i = 1; i <= 45; i++) {
//			list.add(i);
//		}
//		int[] arr = new int[6];
//		int data = 45;
//		for(int j = 0; j <=5; j++) {
//			arr[j] = list.remove(random.nextInt(data));
//			--data;
//		}
//		return arr;
//	}

	private int[] getLotto() {

		int[] arr = new int[6];
		while (true) {


			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(45) + 1;
			}

			if ((arr[0] != arr[1]) && (arr[0] != arr[2]) && (arr[0] != arr[3]) && (arr[0] != arr[4]) && (arr[0] != arr[5])
					&& (arr[1] != arr[2]) && (arr[1] != arr[3]) && (arr[1] != arr[4]) && (arr[1] != arr[5])
					&& (arr[2] != arr[3]) && (arr[2] != arr[4]) && (arr[2] != arr[5]) && (arr[3] != arr[4])
					&& (arr[3] != arr[5]) && (arr[4] != arr[5])) {
				break;
			}

		}
		return arr;
	}
}
