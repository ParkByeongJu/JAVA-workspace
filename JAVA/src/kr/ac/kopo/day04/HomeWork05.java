package kr.ac.kopo.day04;

/*
 
 5. 다음의 결과를 보이는 코드를 if문 switch문으로 각각 작성하시오

   보유하고 있는 책권수 : 0
   보유하고 있는 책 없다
   
   보유하고 있는 책권수 : 1
   1 book
   
   보유하고 있는 책권수 : 3
   3 books
   
   보유하고 있는 책권수 : -3
   잘못입력했습니다
 
 */

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		
		System.out.print("(switch)보유하고 있는 책권수 : ");
		Scanner sc = new Scanner(System.in);
		int book = sc.nextInt();
		
		switch(book) {
			case 0:
				System.out.println("보유하고 있는 책이 없습니다.");
				break;
			case 1:
				System.out.println(book + "book");			
				break;
			default:
				System.out.println(book < 2 ? "잘못입력했습니다" : book + "books");
		
		}
		
		System.out.print("(if)보유하고 있는 책권수 : ");
		Scanner sca = new Scanner(System.in);
		int books = sc.nextInt();
		
		if(books == 0) {
			System.out.println("보유하고 있는 책 없다.");
		}else if(books == 1) {
			System.out.println(books + "book");
		}else {
			System.out.println(books < 2 ? "잘못입력했습니다" : books + "books");
		}
		

	}

}
