package syntax;

public class BasicSyntax {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Bir string giriniz : ");
//		String sc3 = scan.nextLine();
//		System.out.println("Integer bir deger giriniz : ");
//		int sc1 = scan.nextInt();
//		System.out.println("Double bir deger giriniz : ");
//		double sc2 = scan.nextDouble();
//
//		
//		System.out.println("Girilen string deger : " + sc3);
//		System.out.println("Girilen integer deger : " + sc1);
//		System.out.println("Girilen double deger : " + sc2);
		
		
		for(int i = 0; i < 5; i++) {
			if(i == 3)
				break; //break dersek 3'e esit oldugu yerde durur yazdirmaz ve dongu sonlan�r.Continue dersek 3'e gelir onu atlar bir sonraki islemden devam eder.
			System.out.println(i);
		}
	}
}
