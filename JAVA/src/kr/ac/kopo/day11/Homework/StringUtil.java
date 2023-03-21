package kr.ac.kopo.day11.Homework;

public class StringUtil {
	/**
	 * 대문자 맞는지 확인
	 * 
	 * @param c 문자 입력
	 * @return 참 거짓 반환
	 */
	boolean isUpperChar(char c) {
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}

	boolean isLowerChar(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}

	int max(int i, int j) {
		return i > j ? i : j;
	}

	String reverseString(String str) {

		char[] chars = new char[str.length()];
		for (int i = str.length() - 1, j = 0; i >= 0; i--) {
			chars[j++] = str.charAt(i);
		}
		String revStr = new String(chars);
		return revStr;
		/*
		 * char[] chars = new char[str.length()]; for(int i = str.length()-1, j = 0; i
		 * >= 0; i--) { chars[j++] = str.charAt(i); } String revStr = new String(chars);
		 * return revStr;
		 */
		/*
		 * String revStr = ""; for(int i = str.length()-1; i >= 0; i--) { revStr =
		 * revStr + str.charAt(i); } return revStr; }
		 */
	}

	String toUpperString(String str) {
			
		String upperStr = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isLowerChar(c)) {
				c = (char)(c + ('A' - 'a'));
			}
			upperStr = upperStr + c;
		}
			return upperStr;
	}
	/*
	String toupperString(String str) {
		String upperStr = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isLowerChar(c)) {
				c = c + (char)(c + ('A' - 'a'));
			}
			upperStr = upperStr + c;
		}
		return uppperStr;
		*/
	int compareTo(String str, String str2) {
			
		int length = str.length() < str2.length() ? str.length() : str2.length();
		for (int i = 0; i < length; i++) {
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		if(str.length() == str2.length()) {
			return 0;
		} else if(str.length() == length) {
			return -str.charAt(length);
		}
		return str.charAt(length);
	
	
	}
	
	/**
	 * 입력한 문자열에서 입력한 문자를 찾는 메소드
	 */
	static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0; i < strData.length(); i++) {
			strData.charAt(i);
			if(ch == strData.charAt(i)) {
				++cnt;
			}
		
		}return cnt;
		
	}
	/**
	 * 입력한 문자열에서 입력한 문자 제외 출력 메소드
	 */
	static String removeChar(String oriStr, char delchar) {
		String charArr = "";
		for(int i = 0; i < oriStr.length(); i++) {
			if(delchar != oriStr.charAt(i)) {
				charArr += oriStr.charAt(i);
			}
		
		}return charArr;
	

	}
}
