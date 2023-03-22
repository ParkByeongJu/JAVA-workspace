package kr.ac.kopo.day12;

public class IceCream {
	String name;
	int price;
	static int total;
	
	public IceCream(){
		
	}
	
	public IceCream(String name, int price){
		this.name = name;
		this.price = price;
		IceCream.total += price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void totaInfo() {
		System.out.println("총액 : " + IceCream.total + "원");
	}
}
