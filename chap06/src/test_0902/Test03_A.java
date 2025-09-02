package test_0902;
/*
 * Coin 클래스를 이용하기
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */
public class Test03_A {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int mycount = 0, youcount = 0;
		System.out.println("myCoin\tyouCoin");
		while(true){ 
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side == 0){
				System.out.print("앞면\t");
				mycount++;
			}else{
				System.out.print("뒷면\t");
				mycount = 0;
			}			
			if(youCoin.side == 0){
				System.out.print("앞면\n");
				youcount++;
			}else{
				System.out.print("뒷면\n");
				youcount = 0;
			}			
			if(mycount == 3 || youcount == 3)
				break;
		}
		if(mycount > youcount)
			System.out.println("myCoin 승리");
		else if(mycount < youcount)
			System.out.println("youCoin 승리");
		else
			System.out.println("비김");

	}
}
