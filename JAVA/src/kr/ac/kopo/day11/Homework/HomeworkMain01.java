package kr.ac.kopo.day11.Homework;

import java.util.Scanner;

public class HomeworkMain01 {
	
	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		StringUtil util = new StringUtil();
		
		//대문자 여부 판단
		char c = scan.nextChar("문자를 입력 : ");
		boolean bool = util.isUpperChar(c);
		if(bool) {
			System.out.println(c + " : 대문자가 맞습니다.");
		} else {
			System.out.println(c + " : 대문자가 아닙니다.");
		}
		
		//두개의 정수 비교
		int num1 = scan.nextInt("첫번째 정수를 입력 : ");
		int num2 = scan.nextInt("두번째 정수를 입력 : ");
		int maxNum = util.max(num1, num2);
		System.out.println(num1 + "," + num2 + "중 큰수 : " + maxNum);
		
		//문자열 입력 거꾸로 출력
		String str = scan.nextString("문자열을 입력 : ");
		String revStr = util.reverseString(str);
		System.out.println("str : " + str );
		System.out.println("revStr : " + revStr );
		
		String upperStr = util.toUpperString(str);
		System.out.println("대문자변환 : " + upperStr);
		
		String str2 = scan.nextString("첫번째 문자열을 입력 :");
		String str3 = scan.nextString("두번째 문자열을 입력 :");
		
		int cmp = util.compareTo(str, str2);
		if(cmp == 0) {
			System.out.println(str2 + " == " + str3);
		} else if(cmp > 0) {
			System.out.println(str3 + " < " + str2);
		} else {
			System.out.println(str2 + " < " + str3);
		}
		//특정문자 개수 리턴 메인
		String strData = scan.nextString("문자열을 입력 : ");
		char ch = scan.nextChar("찾을 문자를 입력 : ");
		int cnt = util.checkChar(strData, ch);
		
		System.out.println(ch + "가" + cnt + "개");
		
		//특정문자 제외 메인
		String oriStr = scan.nextString("문자열을 입력 : ");
		char delchar = scan.nextChar("삭제 할 문자를 입력 : ");
		String charArr = util.removeChar(oriStr, delchar);
		
		System.out.println(charArr);
				
		
	}

}
