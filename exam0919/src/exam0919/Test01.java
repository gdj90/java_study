package exam0919;
/*
가운데 글자 가져오기

문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
제한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
abcde	c
qwer	we
 */

public class Test01 {
    public static String solution(String s) {
  	  String answer = null;
  	  if(s.length()%2 == 1) {
  	   	  answer = ""+s.charAt(s.length()/2);
  	   } else {
  	   	  int len = s.length()/2;
  	   	  answer = s.substring(len-1,len+1);
  	   }
  	   return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("abced"));
		System.out.println(solution("qwer"));
		System.out.println(solution("q1sfjksdfjhsdfaaaaawer"));

	}

}
