package kr.ac.kopo.day11.Homework;
/**
 * 다양한 상수를 입려받을 수 있는 기능클래스
 * @author User
 *
 */
import java.util.Scanner;

public class ScannerUtil {
	
	Scanner sc;
	
	ScannerUtil(){
		sc = new Scanner(System.in);
	}
	
	char nextChar(String msg) {
		System.out.print(msg);
		return sc.nextLine().charAt(0);
	}
	
	int nextInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String nextString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}

}
