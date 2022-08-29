package lesson_01;

public class FootballPlayer {
	

		/*
		 * FootbalPlayer diye bir class olusturduk ve instance variable(�ye degiskenleri) atadik
		 */
		
		int no;
		String name;
		boolean inPlay;
		int minutes;
		int numberOfGoals;
		
		
		/*
		 * Ne kadar oynadi ve ne kadar skor katk�s� yapt�g� icin 2 tane metot olusturduk.
		 */
		
		void play(int minutesToPlay) {
			minutes = minutes + minutesToPlay;
		}
		
	    void score() { //int goalCount deyip direk kac gol attigini da gonderebilirdik.
			numberOfGoals = numberOfGoals + 1; //numberOfGoals++;
		}

}
