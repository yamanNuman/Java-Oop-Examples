package lesson_01;

public class FootballPlayerTest {
	public static void main(String[] args) {
		
		/*
		 * FootballPlayer class�ndan hagi ve sneijder nesnesi olusturduk.
		 * Uye degiskenleri ile nesneyi betimledik.Bilgilerini girdik.
		 * Daha sonra metotlara degiskenleri g�nderdir ve yazdirdik.
		 */
			
		FootballPlayer hagi = new FootballPlayer();
		hagi.no = 10;
		hagi.name = "George Hagi";
		hagi.minutes = 0;
		hagi.inPlay = true;
		hagi.numberOfGoals = 0;
		
		hagi.play(90);
		hagi.score();
		hagi.score();
		
		System.out.println("Number of goals George Hagi : " + hagi.numberOfGoals); // number of goals 2
		System.out.println("Hagi played totally " + hagi.minutes + " minutes so far."); //minutes is 90
		
		hagi.play(60);
		hagi.score();
		hagi.score();
		
		System.out.println("Number of goals George Hagi : " + hagi.numberOfGoals); // number of goals 2
		System.out.println("Hagi played totally " + hagi.minutes + " minutes so far."); //minutes is 90
		
		System.out.println("********************************************************************************");
		
		FootballPlayer sneijder = new FootballPlayer();
		sneijder.no = 10;
		sneijder.name = "Wesley Sneijder";
		sneijder.minutes = 0;
		sneijder.inPlay = true;
		sneijder.numberOfGoals = 0;
		
		sneijder.play(90);
		sneijder.score();
		sneijder.score();
		
		System.out.println("Number of goals Wesley Sneijder : " + sneijder.numberOfGoals); // number of goals 2
		System.out.println("Sneijder played totally " + sneijder.minutes + " minutes so far."); //minutes is 90
		
		sneijder.play(67);
		sneijder.score(); //sneijder.score(3); diye 3 gol attigini gonderirdik 3 kez metot cagirmazdik.
		sneijder.score();
		sneijder.score();
		
		System.out.println("Number of goals Wesley Sneijder : " + sneijder.numberOfGoals); // number of goals 2
		System.out.println("Sneijder played totally " + sneijder.minutes + " minutes so far."); //minutes is 90
		
		}

}
