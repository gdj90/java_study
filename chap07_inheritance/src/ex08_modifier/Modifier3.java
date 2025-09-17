package ex08_modifier;

import ex08_modifier.test.Modifier2;

public class Modifier3 extends Modifier2{
	
	public void method() {  //오버라이딩 조건중 접근제한자는 넓은 범위로 가능
		System.out.println("ex08_modifier.Modifier3 클래스의 method()");
	//	System.out.println("v1=" + v1);//private. 다른클래스에서 접근
	//	System.out.println("v2=" + v2);//다른 패키지에서 접근
		System.out.println("v3=" + v3);//상속 관계이므로 접근 허용
		System.out.println("v4=" + v4);		
	}
}

