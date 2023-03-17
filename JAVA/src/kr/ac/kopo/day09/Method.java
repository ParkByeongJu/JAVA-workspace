package kr.ac.kopo.day09;
//메소드 오버로딩 : 같은 클래스 내에 다수의 메소드명이 존재해도 매개변수가 다르면 선언할 수 있다.
//"같은" 클래스에 있는 매개변수들은 공유할 수 있다.
//클래스가 다르면 매개변수는 독립적이다.

public class Method {
	
	int data = 10;
	
	void call() {
		System.out.println("call() 메소드 호출...");
		System.out.println(data);
	}
	
	void call(int i) {
		System.out.println("call(int)메소드 호출...");
		System.out.println(data);
	}
	
	void call(String s, int i) {
		System.out.println("call(String, int)메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double)메소드 호출...");
	}

}
