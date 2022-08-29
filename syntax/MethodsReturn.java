package syntax;

public class MethodsReturn {
	public static void main(String[] args) {
		//int summary = sum(5,10);
		
		System.out.println("Toplam : " + sum(5,10)); // yada print icinde fonksiyonu cag�r�rsak da olur.
		

	}

	/*
	 * Method void tan�mlarsak return kullanamay�z.
	 * Int tipinde bir method olusturduk ve toplam return ettik.
	 * Main methodu i�inde methodu int bir degiskene atad�k ve yazd�rd�k.
	 */
	
	public static int sum(int a,int b) {
		int toplam = a + b;
		return toplam;
	}

}
