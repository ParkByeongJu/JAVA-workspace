package kr.ac.kopo.day13.Homework;

import java.util.Scanner;

public class ShapeChoice {

	public void choice() {

		ScannerShape scan = new ScannerShape();
		
		System.out.println("1.삼각형 2.정사각형 3. 직사각형 4. 원");
		int num = scan.nextInt("면적을 구할 도형을 선택하세요 : ");
		
		
		
		if(num == 1) {
			Triangle tri  = new Triangle();
			tri.area();
		} else if(num == 2) {
			Square sq = new Square();
			sq.area();
		} else if(num == 3) {
			Rectangle rac = new Rectangle();
			rac.area();
		} else if(num == 4) {
			Circle cir  = new Circle();
			cir.area();
		} 
		
		
	}
}
