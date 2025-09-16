package ex05_stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO(Last In First Out)
 *   Stack 클래스 : Vector의 하위 클래스. List객체
 *   주요메서드
 *       push(Object) : 객체를 stack에 추가
 *       Object pop() : 객체를 stack에서 제거. 제거된 객체 리턴
 *       Object peek(): stack에서 조회될 객체 리턴
 *       
 * Queue : FIFO(First In First Out)
 *    Queue 인터페이스 : LinkedList가 구현클래스임.List객체      
 *   주요메서드
 *       offer(Object) : 객체를 queue에 추가
 *       Object poll() : 객체를 queue에서 제거. 제거된 객체 리턴
 *       Object peek() : queue에서 조회될 객체 리턴 
 */
public class MainEx01_stackqueue {
	public static void main(String[] args) {
		String[] cars = {"소나타","그랜저","K9","SM5"};
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) {
			stack.push(s);
			queue.offer(s);
		}
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size());
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
		System.out.println(stack); // 소나타 그랜저 K9 SM5
		System.out.println(queue); // 소나타 그랜저 K9 SM5
		System.out.println("stack.peek() : " + stack.peek()); //SM5
		System.out.println("queue.peek() : " + queue.peek()); //소나타
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size()); //4
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());   //4
		System.out.println("stack.pop() : " + stack.pop()); //SM5
		System.out.println("queue.poll() : " + queue.poll()); //소나타
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size()); //3
		System.out.println("큐에 저장된 객체의 갯수:" + queue.size());   //3
		System.out.println(stack); // 소나타 그랜저 K9
		System.out.println(queue); // 그랜저 K9 SM5
		System.out.println("stack.pop() : " + stack.pop()); //K9
		System.out.println("queue.poll() : " + queue.poll()); //그랜저
		System.out.println(stack); // 소나타 그랜저
		System.out.println(queue); // K9 SM5
	}
}
