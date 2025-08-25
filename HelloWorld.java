/* 여러줄 주석
    주석 (comment)
     - 실행 영역이 아님. 자바문법과 상관이 없음
     - 기계어로 번역되지 않는 영역
     여러줄 주석 : /* ..... 
*/   
// 한줄주석 : //  이후부분이 주석
/*
   1. public class HelloWorld => HelloWorld라는 클래스를 정의
                                       public class의 이름과 파일의 이름은 같아야 한다
   2. 하나의 파일에는 한개의 public class만 존재 가능함
   3. 대소문자를 구분함 : public / Public  은 다른 단어임.
   4. 자바 소스 파일의 확장자는 .java로 한다
   5. 컴파일러 : javac => 소스파일을 번역하여 바이트코드로 생성한다
   6. 인터프리터 : java => 자바소스를 실행한다.
*/
public class HelloWorld {
   public static void main(String[] args) {
     System.out.println("Hello World");  //Hello World 를 화면에 출력
   }
}