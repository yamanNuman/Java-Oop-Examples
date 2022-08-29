package lesson_04;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
		
		PrimeNumber pn = new PrimeNumber();
		System.out.print("Lutfen pozitif bir sayi giriniz : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//pn.isPrime(n);
		pn.countNumberOfPrimesUpTo(n);
	}
	
	boolean isPrime(int n) {
		boolean prime = true;
		int i;
		int upperBound = (int) (Math.sqrt(n) + 1);
		for(i = 2; i < upperBound; i++) {
			if(n % i == 0){
				prime = false;
				break;
			}
		}
//		if(!prime)
//			System.out.println("�lk b�len : " + i);
		
		return prime;
	}
	
	void countNumberOfPrimesUpTo(int n) {
		int numberOfPrimes = 0;
		for(int i = 2; i < n; i++) {
			boolean prime = isPrime(i);
			if(prime) {
				numberOfPrimes++;
			}
		}
		System.out.println(n + " say�s�na kadar " + numberOfPrimes + " asal say� vard�r.");
	}
}
