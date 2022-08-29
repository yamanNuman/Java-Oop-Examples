package lesson_02;

public class Operators {

public static void main(String[] args) {
		
		/*
		 * Compoud assigments
		 * += / -= / *= / /= gibi
		 */

		int x = 5;
		x += 10;
		System.out.println(x);
		x -= 5;
		System.out.println(x);
		x *= 10;
		System.out.println(x);
		x /= 5;
		System.out.println(x);
		System.out.println("**************");
		
		/*
		 * prefix and postfix
		 */
		
		int y = 10;
		y++;
		System.out.println(y);
		int z = ++y;
		System.out.println(z);
		System.out.println(y);
		z = y++;
		System.out.println(z); //�nce atama yapt�. Sonra artt�rma islemi yapt�
		System.out.println(y);
		
		/*
		 * Ko�ul i�lemcileri
		 */
		
		int id1 = 10, id2 = 20;
		boolean sonuc;
		sonuc = (id1 == id2) && (id1 < id2);
			System.out.println(sonuc);
		sonuc = (id1 == id2) || (id1 < id2);
			System.out.println(sonuc);
		
		
	}
}
