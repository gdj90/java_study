package ex03_map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
 * 도서정보를 책이름으로 정보 저장하기
 */
class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "," + author + "," + price + ")";
	}
}
public class MainEx02 {
	static Map<String, Book> books = new HashMap<>(); //클래스 멤버
	public static void main(String[] args) {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
			try {
			menu = scan.nextInt();
			if(menu == 0) break;
			switch (menu) {
			  case 1 : addBook();break;
			  case 2 : deleteBook();break;
			  case 3 : printBook();break;
			  case 4 : findBook();break;
			  default : 
				  System.out.println("잘못된 입력입니다. 0,1,2,3,4만 가능합니다.");
			}
			} catch (InputMismatchException e) {
				System.out.println("숫자 0,1,2,3,4 만 가능합니다.");
				scan.next();
			}
		}
	}
	//제목을 입력받아서 books 객체에서 도서를 제거하기
	private static void deleteBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 도서의 제목을 입력하세요");
		String title = scan.next();
	    //key에 해당하는 요소 제거하고, value객체 리턴
		Book book = books.remove(title);
		if(book == null) {  //삭제 도서가 없는 경우
			System.out.println(title + " 도서가 없습니다.");
		} else {
			System.out.println(book + " 도서가 삭제 되었습니다.");
		}
	}
	//제목을 입력받아서 도서 정보를 출력하기
	private static void findBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색 도서의 제목을 입력하세요");
		String title = scan.next();
		Book book = books.get(title);
		if(book == null) {
			System.out.println(title + " 도서는 없습니다.");
		} else {
			System.out.println(title + " 도서정보:" + book);
		}
	}
	private static void printBook() {
		System.out.println("도서 목록을 조회합니다.");
		for(Book b : books.values()) {
			System.out.println(b);
		}
	}
	/*
	 * 제목,저자,가격을 입력받아서 books map에 저장하기
	 */
	private static void addBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("등록할 도서의 제목,저자,가격을 입력하세요");
		String title = scan.next();
		String author = scan.next();
		int price = scan.nextInt();
		books.put(title, new Book(title,author,price));
		System.out.println(title + " 도서가 추가 되었습니다.");
	}
}
