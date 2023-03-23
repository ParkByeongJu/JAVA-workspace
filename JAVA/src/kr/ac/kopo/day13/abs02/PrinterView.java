package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

public class PrinterView {
	
	private Scanner sc = new Scanner(System.in);
	
	public void work() {
		
		System.out.println("출력할 프린터를 선택하세요(1. Samsung 2. HP 3. LG) : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		Printer p = null;
		switch(choice) {
		case 1:
			p = new SamsungPrinter();
			break;
		case 2:
			p = new HPPrinter();
			break;
		case 3:
			p = new LGPrinter();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		if(p != null) {
			p.print();
		}
		/*
		switch(choice) {
		case 1:
			Printer lg = new LGPrinter();
			lg.print();
			break;
		case 2:
			Printer sam = new SamsungPrinter();
			sam.print();
			break;
		}
		*/
	}

}
