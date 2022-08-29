package lesson_04;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		SwitchDemo demo = new SwitchDemo();
		    	
		    	System.out.println("A number :");
				Scanner stdin = new Scanner(System.in);
				int month = stdin.nextInt();
				
				demo.switchDemo1(month);
				
			}
			
			public void switchDemo1(int month) {
				
				switch(month) {
				case 1,2,12 -> System.out.println("K��");
				case 3,4,5 -> System.out.println("�lkbahar");
				case 6,7,8 -> System.out.println("Yaz");
				case 9,10,11 -> System.out.println("Sonbahar");
				default -> System.out.println("Error");
				}
			}
}
