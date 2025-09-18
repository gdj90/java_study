package ex04_operator;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 *  - Function 하위 인터페이스
 *  - 매개변수,리턴값 모두 존재
 *  
 * 종류
 *  - UnaryOperator<T> : T apply<T> : 매개변수자료형과 리턴타입이 같음 
 *  - BinaryOperator<T> : T apply<T,T> : BiFunction 하위 클래스
 *  - IntUnaryOperator : int applyAsInt(int) 
 *  - IntBinaryOperator : int applyAsInt(int,int) 
 *  - DoubleUnaryOperator : double applyAsDouble(double) 
 *  - DoubleBinaryOperator : double applyAsDouble(double,double) 
 *  - LongUnaryOperator : long applyAsLong(long) 
 *  - LongBinaryOperator : long applyAsLong(long,long) 
 */
public class MainEx01 {
	private static int[] score = {92,95,87,100,55};
	public static void main(String[] args) {
		int max = score[0];
		int min = score[0];
		for(int i : score) {
			max = (i > max)?i:max;
			min = (i < min)?i:min;
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);		
		System.out.println("최대값:" + maxOrMin((a,b)->(a>b)?a:b));
		System.out.println("최소값:" + maxOrMin((a,b)->(a<b)?a:b));		
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = score[0];
		for(int s: score) result = op.applyAsInt(result, s);
		return result;
	}
}
