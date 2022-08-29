package lesson_13;

public class Singleton {

    // Nesne degil class degiskeni yapmamiz gerekir bu yuzden static olarak tanimladik
    private static Singleton object = new Singleton();
    private static int count;
    private String name;

    private Singleton() {
        count++;
        name = "Singleton" + "-" + count;
    }
    //Global erisim noktasi
    public static Singleton getInstance() {
        return object;
    }
    public void printName() {
        System.out.println(name);
    }


}
