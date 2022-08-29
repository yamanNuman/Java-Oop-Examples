package lesson_03;

public class Dikdortgen {
public static void main(String[] args) {
		
		int i,j;
		
		/*
		 * ici dolu dikkd�rtgen
		 */
		
		for(i = 0; i < 6; i++) {

			for(j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();	// if(j == 5 - 1) sysout(); yaparsak da son kolona gelince alta gec demis oluruz.
		}
		
		System.out.println("\n\n");
		
		/*
		 * ici bos dikdortgen
		 */
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 3; j++) {
				if(i == 0 | i == 4) {
					System.out.print("*");
				if(j == 2)
					System.out.println("*");
				}
				else {
					if(j == 0)
						System.out.print("*");
					else if(j == 3-1)
						System.out.println("*");
					else
						System.out.print("  ");
				}
			}
		}
}
}
