package kr.ac.kopo.day11.stat;

public class EmployeeMain {
	
	public static void main(String[] args) {

		Employee.employeeCntInfo(); //static 변수는 클래스 명으로 만드는 것이 가장 좋다. 왜냐하면 static 변수가 가장 먼저 생성되기 때문이다.

		Employee e = new Employee(1,"홍길동", 3_400,"사원");
		Employee e2 = new Employee(2, "고길동", 3_700, "주임");
		Employee e3 = new Employee(3, "임길동", 3_500, "사원");
		
		e.info();
		e2.info();
		e3.info();
		
		Employee.employeeCntInfo(); //static 변수는 클래스 명으로 만드는 것이 가장 좋다.
	}

}
