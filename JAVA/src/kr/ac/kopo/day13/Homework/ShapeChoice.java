package kr.ac.kopo.day13.Homework;

import java.util.Scanner;

public class ShapeChoice {

	public void choice() {

		ScannerShape scan = new ScannerShape();
		int num = 0;

		do {
			System.out.println("1.삼각형 2.정사각형 3. 직사각형 4. 원\n");
			num = scan.nextInt("면적을 구할 도형을 선택하세요 : ");
			if(num >4) {
				System.out.println("\n***잘못입력했습니다. 다시입력해주세요***\n");
			}
		} while (num > 4);

		if (num > 0 && num < 5) {
			if (num == 1) {
				Triangle tri = new Triangle();
				tri.area();
			} else if (num == 2) {
				Square sq = new Square();
				sq.area();
			} else if (num == 3) {
				Rectangle rac = new Rectangle();
				rac.area();
			} else if (num == 4) {
				Circle cir = new Circle();
				cir.area();
			}

		}
	}
}
