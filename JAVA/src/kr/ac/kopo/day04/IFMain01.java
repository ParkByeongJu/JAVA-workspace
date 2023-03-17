package kr.ac.kopo.day04;

/*
 
 	보유하고 있는 책권수 입력 : 3
 	3 Books
 	
 	보유하고 있는 책권수 입력 : 1
 	1 Book
 
 */


import java.util.Scanner;

public class IFMain01 {
	
	public static void main(String[] args) {
		
		System.out.print("보유하고 있는 책권수 입력 : ");
		
		Scanner sc  = new Scanner(System.in);
		int book = sc.nextInt();
		
		if(book <= 1) {
			
			System.out.printf("%d book", book);
			
		} else {

			System.out.printf("%d books", book);
		
		}
		
	}

}
