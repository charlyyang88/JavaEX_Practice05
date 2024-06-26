package com.javaex.ex10;

import java.util.Scanner;

import com.javaex.ex09.StringUtil;

public class BookShop {
//	문제] com.javaex.ex10 패키지
//	주어진 BookShop.java 를 실행했을 때 다음과 같은 실행결과가 나타나도록 아래의 문제설명을 참고하여
//	Book.java 를 작성하고 BookShop.java 를 완성하세요
	public static void main(String[] args) {
		Book[] books = new Book[10];

		books[0] = new Book(1, "트와일라잇", "스테파니메이어");
		books[1] = new Book(2, "뉴문", "스테파니메이어");
		books[2] = new Book(3, "이클립스", "스테파니메이어");
		books[3] = new Book(4, "브레이킹던", "스테파니메이어");
		books[4] = new Book(5, "아리랑", "조정래");
		books[5] = new Book(6, "젊은그들", "김동인");
		books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
		books[7] = new Book(8, "귀천", "천상병");
		books[8] = new Book(9, "태백산맥", "조정래");
		books[9] = new Book(10, "풀하우스", "원수연");

		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo(books);

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		int num = scanner.nextInt();

		// (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
		// 코드작성
		books[num - 1].rent();

		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo(books);

		scanner.close();
	}

	// (2)전달받은 배열을 모두 출력하는 메소드
	private static void displayBookInfo(Book[] books) {
		// 코드작성
		for (Book book : books) {
			System.out.print(book.getBookNo() + ". " + book.getTitle() + " (" + book.getAuthor() + ")");
			if (book.getStateCode() == 0) {
				System.out.print(" - 대여현황: 대여중");
			} else {
				System.out.print(" - 대여현황: 재고 있음");
			}
			System.out.println();
		}
	}
}
