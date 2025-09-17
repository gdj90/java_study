package chap04;
/*
 * 중첩 if문 : if 문 내에 if문이 존재
 */
public class IfEx03 {
	public static void main(String[] args) {
		int score=35;
		if(score>=60) {
			System.out.println("합격입니다.");
			if(score >=80) {
				System.out.println("좋은성적입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
			if(score < 40) {
				System.out.println("더 많은 학습이 필요합니다.");
			}
		}
	}
}
