package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private String name;
	private String phone;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	

	Employee(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	/*
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.name.equals(e.name) && this.phone.equals(e.phone)) {
			return true;
		}
		return false;
		 */
	}
	



class Car {
	String model;
	String no;

	Car(String model, String no) {
		this.model = model;
		this.no = no;
	}
}

public class MapMain02 {

	public static void main(String[] args) {

		Map<Employee, Car> carList = new HashMap<>();

		carList.put(new Employee("홍길동", "010-1111-2222"), new Car("소나타", "123나4567"));

		carList.put(new Employee("고길동", "010-3333-4444"), new Car("산타페", "234라3416"));

		carList.put(new Employee("한길동", "010-7777-8888"), new Car("K5", "567무2478"));

		carList.put(new Employee("홍길동", "010-1111-2222"), new Car("벤츠", "345구7367"));

		System.out.println("등록된 차량대수 : " + carList.size());

	}

}
