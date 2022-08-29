package lesson_04;

public class Fibonacchi {


	/*
	 * Recursive olmadan fibonachhi
	 */

	public static int fib(int num) {
		int firstTerm = 0, secondTerm = 1,sum = 0,nextTerm = 0;
			for(int i = 1; i <= num; i++) {
				nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
		return nextTerm;
	}
	
	/*
	 * Fibonachi serisi recursive 
	 */
	
//	public static int fibonachiSeries(int num) {
//		if((num == 1) || (num == 0)) {
//			return num;
//		}
//		else {
//			return fibonachiSeries(num - 1) + fibonachiSeries(num - 2);
//		}
//	}
	
	public static void main (String[] args) {
		
//		System.out.println("Fibonachi number is : " + fibonachiSeries(12));
		
		System.out.println("Fibonachi number is : " + fib(7));
		
	}
}
