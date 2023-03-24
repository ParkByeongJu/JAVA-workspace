package kr.ac.kopo.day13;

public class CastMain02 {

	public static void main(String[] args) {
		
		//컴파일 오류 발생
//		Child01 c = new Parent();
		
		//실행 시 오류가 발생
//		Child01 c = (Child01)new Parent();
		
//		자식클래스타입 = (자식클래스타입)부모클래스타입
		Parent p = new Child01();
		Child01 c = (Child01)p;
	}
}
