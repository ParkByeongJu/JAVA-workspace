package kr.ac.kopo.day13.abs02;

public class LGPrinter extends Printer {
	
	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void lgPrint() {
		System.out.println(model + "에서 출력 중 ...");
	}
	@Override
	public void print() {
		
//		System.out.println("LG프린터에서 출력 중...");
		lgPrint();
		
	}

}
