package lesson_06;

import java.time.Clock;

public class Test {
	public static void main(String[] args) {
		/*
		Person tipinden yarattigimiz nesneyi owner1 referansına atadık.
		Daha sonra ilk deger atamalarini yaptık.
		Ayni sekilde CarTest tipinden nesneyi vehicle1 referansına atadık.
		İlk deger tanıtımlarını yaptik.
		 */
		Person owner1 = new Person();
		owner1.tckn = "1";
		owner1.firstName = "Zeynep";
		owner1.lastName = "Yaman";

		CarTest vehicle1 = new CarTest();

		vehicle1.maker = "Nissan";
		vehicle1.model = "GTR34";
		vehicle1.year = "1998";
		vehicle1.speed = 250;
		vehicle1.distance = 13_500;

		vehicle1.owner = owner1;
		owner1.vehicle = vehicle1;

		System.out.println(vehicle1.getInfo());
		System.out.println(owner1.getInfo());
		System.out.println("***********************************************");
		vehicle1.speed = 350;
		vehicle1.go(100);
		System.out.println(vehicle1.getInfo());
		System.out.println(owner1.getInfo());
	}
}