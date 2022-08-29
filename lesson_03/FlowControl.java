package lesson_03;

public class FlowControl {
public static void main(String[] args) {
		
		String testage = args[0];
		int age = Integer.parseInt(testage);
		
		if(age < 0 | age > 120) {
			System.out.println("Bu yas araliginda bir tan�m yok.");
		}
		
		else if(age > 0 & age <= 3) {
			System.out.println("Bebek");
		}
		
		else if(age > 3 & age <= 12) {
			System.out.println("Cocuk");
		}
		
		else if(age > 12 & age <= 19) {
			System.out.println("Ergen");
		}
		
		else if(age > 19 & age <= 30) {
			System.out.println("Genc");
		}
		
		else if(age > 30 & age <=59) {
			System.out.println("Orta Yas");
		}
		
		else if(age >59 & age <= 120) {
			System.out.println("Yasli");
		}
		
}

}
