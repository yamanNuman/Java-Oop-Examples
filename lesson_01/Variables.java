package lesson_01;

public class Variables {
	public static void main(String[] args) {
		
		String var1;
		var1 = "Numan";
		int var2;
		var2 = 27;
		float var3;
		var3 = 18.5F;
		char var4;
		var4 = 'P';
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		{
			/*
			 * Blok icinde olusturulan degisken o blok icerisinde gecerli olur. 
			 * Blok d�s�nda o degiskeni bastiramay�z.
			 */
			int age = 25;
			System.out.println(age);
		}
		
	}

}
