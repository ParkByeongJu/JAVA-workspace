package kr.ac.kopo.day15.Homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		int num = 0;
		while (true) {
			System.out.print("원하는 항목을 선택하세요.(1.특정년도 2.특정월 3.종료) => ");
			num = sc.nextInt();
			if (num == 1) {
				System.out.print("년도를 선택하세요 : ");
				int selectYear = sc.nextInt();
				for (int i = 0; i <= 11; i++) {
					System.out.print("\n" + "\t" + selectYear + "년\t" + (i + 1) + "월");
					System.out.println();
					System.out.print("일\t월\t화\t수\t목\t금\t토\n");
					c.set(selectYear, i, 1);
					
					if(c.get(Calendar.DAY_OF_WEEK) >= 2 && c.get(Calendar.DAY_OF_WEEK) <= 7 ) {
						for(int j = 1; j < c.get(Calendar.DAY_OF_WEEK); j++) {
							System.out.print("\t");
						}
					}
					
					
					for(int k = 1; k <= c.getActualMaximum(Calendar.DAY_OF_MONTH); k++) {
						c.set(selectYear, i, k);
						System.out.print(k + "\t");
						if(c.get(Calendar.DAY_OF_WEEK) == 7) {
							System.out.println();
						}
						if(k == c.getActualMaximum(Calendar.DAY_OF_MONTH)) {
							System.out.println();
							System.out.println();
						}
					}
				}
			} else if (num == 2) {
				System.out.print("년도를 입력하세요 =>");
				int selectYear = sc.nextInt();
				System.out.print("월을 입력하세요 =>");
				int selectMonth = sc.nextInt();
				
				System.out.print("\n" + "\t" + selectYear + "년\t" + selectMonth + "월\n");
				System.out.println();
				System.out.print("일\t월\t화\t수\t목\t금\t토\n");
				c.set(selectYear, selectMonth - 1, 1);
				
				if(c.get(Calendar.DAY_OF_WEEK) >= 2 && c.get(Calendar.DAY_OF_WEEK) <= 7 ) {
					for(int i = 1; i < c.get(Calendar.DAY_OF_WEEK); i++) {
						System.out.print("\t");
					}
				}
				
				for(int j = 1; j <= c.getActualMaximum(Calendar.DAY_OF_MONTH); j++) {
					c.set(selectYear, selectMonth - 1, j);
					System.out.print(j + "\t");
					if(c.get(Calendar.DAY_OF_WEEK) == 7) {
						System.out.println();
					}
					if(j == c.getActualMaximum(Calendar.DAY_OF_MONTH)) {
						System.out.println();
						System.out.println();
					}
				}
			
				
			} else if (num == 3) {
				break;
			}

		}

	}

}
