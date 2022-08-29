package lesson_01;

public class Casts {
	public static void main(String[] args) {
		byte var1 = 5;
		short var2 = 10;
		int var3 = 56;
		float var4 = 3.533F;
		char var5 = 'a';


		short cast1 = var1; //var1 byte tipinde idi onu short tipine cevirdik.Widing castin oldugu icin cast kullanmadan yapabildik.
		System.out.println(cast1);
		//byte cast2 = var2; derleyici hata verir.��nk� daraltan tipte d�n���m yap�l�rken cast kullan�lmas� zorunludur.
		byte cast2 = (byte)var2;//donusum yap�ld� cunku cast kulland�ktan daraltan donusum yap�lm�s oldu. short tipini byte tipine cevirdik.
		System.out.println(cast2);
		int cast3 = var2; //short tipindeki var2 degiskenini int tipine cevirdik.
		System.out.println(cast3);
		short cast4 = (short)var3; //var3 int tipinde idi cast islemi ile daraltan cevirim yapt�k. int tipinden sort tipine cevirdik.
		System.out.println(cast4);
		float cast5 = var3;
		System.out.println(cast5); //var3 int tipinde bir degiskendi onu float tipine cevirdik genisleten bir cevirim yaptik.
		int cast6 = (int)var4;
		System.out.println(cast6); //var4 float tipinde bir degiskendi daraltan cevirim yaptik cast ile g�rd�k ki veri kaybi oldu virg�lden sonraki veri kayboldu.
		int cast7 = (int)var5;
		System.out.println(cast7); //var5 char tipinde bir degisken int tipine daraltan bir cevrim yaptik.
		
		
		

	}

}
