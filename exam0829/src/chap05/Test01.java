package chap05;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
int num = Integer.parseInt(args[0]);
[결과]
10의 약수 : 1,2,5,10,
*/
//java Test01 10 20 30
public class Test01 {
	public static void main(String[] args) { //매개변수, 인자
		//args.length : command 라인에서 전달 받은 인자값의 갯수
		if(args.length == 0) {
			System.out.println("숫자를 command 라인에 입력하세요");
			return;
		}
		//int <=Integer.parseInt("숫자형태문자열")
		for(int a=0;a<args.length;a++) {
			int num = Integer.parseInt(args[a]); //10 <= "10"
			System.out.print(num + "의 약수:");
			for(int i=1;i<=num;i++) {//11
				if(num%i==0) System.out.print(i+","); //1,2,5,10,
			}
			System.out.println();
		}
		System.out.println("=========");
		for(String a : args) { //java Test01 10 15 30
			int num = Integer.parseInt(a); //10 <= "10"
			System.out.print(num + "의 약수:");
			for(int i=1;i<=num;i++) {//11
				if(num%i==0) System.out.print(i+","); //1,2,5,10,
			}
			System.out.println();
		}
		
	}
}
