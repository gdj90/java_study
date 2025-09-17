package ex04_polymorphism;
/*
 * Product클래스 생성하기
 * 멤버변수 : 가격(price),포인트(point)
 * 생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
 */
class Product {
	int price,point;
	Product(int price) {
		this.price = price;
		point = price/10;
	}
}
/*
 * TV 클래스 : Product클래스의 하위 클래스
 * 가격 : 100
 * toString() : TV 리턴
 */
class TV extends Product{
	TV() {
		super(100);
	}
	public String toString() {
		return "TV";
	}
}
/*
 * Computer 클래스 : Product클래스의 하위 클래스
 * 가격 : 200
 * toString() : Computer 리턴
 * 
 * HandPhone 클래스 : Product클래스의 하위 클래스
 * 가격 : 150
 * toString() : HandPhone 리턴
 */
class Computer extends Product {
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class HandPhone extends Product {
	HandPhone(){
		super(150);
	}
	public String toString() {
		return "HandPhone";
	}
}
/*
 * Buyer 클래스
 * 멤버변수 : money=500, point(포인트), cnt(구매물품갯수)
 *          Product[] cart = new Product[5];
 * 멤버메서드
 *   void buy(Product p)
 *     1. p 상품의 가격을 money에서 차감
 *     2. p상품의 포인트 만큼 Buyer의 포인트 증가
 *     3. cart에 p 제품 추가. cnt 값을 증가
 *     4. p 제품의 이름 출력         
 *   void summary() 
 *     1. 구매제품의 전체 금액 합계, 포인트 합계 계산. 출력
 *     2. 잔액 출력
 *     3. 전체 구매 물품의 이름 출력       
 */
class Buyer {
	int money=500,point,cnt;
	Product[] cart = new Product[5];
	void buy(Product p) { //Product : Product의 하위 객체들은 모두 처리할 수 있음
		money -= p.price;
		point += p.point;
		cart[cnt++] = p;
		System.out.println(p +"구입");
	}
	void summary() {
		int totAmt=0,totPoint=0;
		for(int i=0;i<cnt;i++) {
			totAmt += cart[i].price;
			totPoint += cart[i].point;
		}
		System.out.println("구매금액합계:" + totAmt);
		System.out.println("구매포인트합계:" + totPoint);
		System.out.println("잔액 :" + money);
		System.out.println("구매물품목록:");
		for(int i=0;i<cnt;i++) System.out.print(cart[i]+",");
	}
}
public class Exam01 {
	public static void main(String[] args) {
		TV t = new TV();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(c);
		b.buy(h);
		b.summary();;
	}
}
