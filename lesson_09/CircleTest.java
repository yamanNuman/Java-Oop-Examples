package lesson_09;

public class CircleTest {
    public static void main(String[] args) {
        Circle daire1 = new Circle(10);
        Circle daire2 = new Circle(15);

        daire1.getShow();
        daire2.getShow();
        double alan1 = daire1.alanHesaplama();
        double cevre1 = daire1.cevreHesaplama();
        double alan2 = daire2.alanHesaplama();
        double cevre2 = daire2.cevreHesaplama();

        System.out.println("Daire-1 Alani : " + alan1);
        System.out.println("Daire-1 Cevresi : " + cevre1);
        System.out.println("Daire-2 Alani : " + alan2);
        System.out.println("Daire-2 Cevresi : " + cevre2);
        }
    }

