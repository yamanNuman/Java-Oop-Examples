package lesson_04;

import java.util.Scanner;

public class MonteCarloPI {

public static void main(String[] args) {
		
		System.out.println("Nokta sayisini giriniz : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int numberCircle =0;
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < n; i++) {
			double x = Math.random();
			double y = Math.random();
			double distance = x * x + y * y;
			if(distance <= 1)
				numberCircle++;
		}
		
		long end = System.currentTimeMillis();
		
		double myPI = 4.0 * numberCircle / n;
		System.out.println("My pi : " + myPI);
		System.out.println("Java's PI : " + Math.PI);
		System.out.println("Time : " + (end - start) + " ms");
	}
}
