package lesson_05;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

public static void main(String[] args) {
		
		SieveOfEratosthenes soe = new SieveOfEratosthenes();
		System.out.print("Lutfen pozitif bir say� giriniz : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		soe.countNumberOfPrimesUpTo(n);
		
}

	void countNumberOfPrimesUpTo(int n) {
		boolean[] list = new boolean[n + 1];
		Arrays.fill(list, true); //array'in icindeki t�m elemanlar� true yapar.(Arrays.fill)
		
		int upperBound = (int) (Math.sqrt(n) + 1);
		
		for(int i = 2; i <= upperBound; i++) { //daha h�zl� arama yapmas� icin karak�k�n� ald�k
			if(list[i] == true)
				for(int j = 2; i * j <= n; j++)
					list[i * j] = false;
		}
		
		int numberOfPrimes = 0;
		for(boolean b : list) {
			if(b == true)
				numberOfPrimes++;
		}
		
		System.out.println(n + " say�s�na kadar " + (numberOfPrimes - 2) + " tane asal say� vard�r."); //why -2 ? 0 and 1 not a prime number.
	}
}
