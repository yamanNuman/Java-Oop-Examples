package lesson_04;

public class Bottles {
	static void printSong(Object stuff,int n) {
	String plural = (n == 1) ? "" : "s";
	loop: while(true) {
		System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall,");
		System.out.println(n + " bottle" + plural + " of " + stuff + ";");
		System.out.println("You take one down " + "and pass it araound:");
		--n;
		plural = (n==1) ? "" : "s";
		if(n==0) break loop;
		System.out.println(n + " bottle" + plural + " of" + stuff + " on the wall!\n");
	}
	System.out.println(n + " bottle" + plural + " of" + stuff + " on the wall!\n");
	}
	public static void main(String[] args) {
		printSong("slime",3);
		
	}

}
