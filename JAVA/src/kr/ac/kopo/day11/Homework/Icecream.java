package kr.ac.kopo.day11.Homework;
/**
 * 생성자 생성 및 초기화
 */

public class Icecream {
	
	String name = "";
	int price = 0;
	int no = 0;
	
	public Icecream() {
	
	}
	
	Icecream(String name){
		this.name = name;
	}
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info() {
		System.out.println(name + "\t" + price);
	}
	

}
