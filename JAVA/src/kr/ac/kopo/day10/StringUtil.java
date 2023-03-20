package kr.ac.kopo.day10;

import java.util.Scanner;

public class StringUtil {
	
	/**
	 * 문자 입력 메소드
	 * @return
	 */
	public char getchar() {
		System.out.print("문자를 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		return ch;
	}
	/**
	 * 숫자 입력 메소드
	 */
	public int getnum() {
		System.out.print("숫자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		return num;
	}
	/**
	 * 문자열 입력 메소드
	 */
	public String getstr() {
		System.out.print("문자열을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		return str;
	}
	/**
	 * 입력 문자가 대문자인 경우 true 출력
	 */
	//1
	public boolean isUpperChar() {
		if(this.getchar() >= 'A' && this.getchar() <= 'Z' ) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 입력 문자가 소문자인 경우 true 출력
	 */
	//2
	public boolean isLowChar() {
		if(this.getchar() >= 'a' && this.getchar() <= 'z' ) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 *두수를 입력해서 큰 수 출력
	 */
	//3
	public int max() {
		int i = this.getnum();
		int j = this.getnum();
		
		if(i > j) {
			return i;
		} else {
			return j;
		}
	}
	/**
	 *두수를 입력해서 작은 수 출력
	*/
	//4
	public int min() {
		int i = this.getnum();
		int j = this.getnum();
			
		if(i > j) {
			return j;
		} else {
			return i;
		}
	}
	/**
	 * 문자열을 입력받아 거꾸로 변경하는 문자열 출력
	 */
	//5
	//확실하지 않음 한번 더 확인
	public String reverseString() {
		String str = this.getstr();
		char[] reverse = new char[this.getstr().length()];
		for(int i = this.getstr().length()-1; i >= 0; i--) {
			str.getChars(i, i+1, reverse, i++);
		}
		String rev = new String(reverse);
		return rev;
	}
	/**
	 * 문자열을 입력받아 대문자로 변경하여 출력
	 */
	//6
	public String toUpperString() {
		char[] ch = new char[this.getstr().length()];
		for(int i = 0; i < this.getstr().length(); i++) {
			if(this.getstr().charAt(i) >= 97) {
				ch[i] = (char)(this.getstr().charAt(i) - 32);
			}else {
				ch[i] = this.getstr().charAt(i);
			}
		}
		String str = new String(ch);
		return str;
 		
	}
	
}