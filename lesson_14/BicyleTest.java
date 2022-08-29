package lesson_14;

public class BicyleTest {
    public static void main(String[] args) {
        Bicyle pedal = new Bicyle();
        Bicyle sele = new Bicyle();
        Bicyle tekerlek = new Bicyle();

        pedal.pedalCevirme();
        sele.seleAyari();
        tekerlek.tekerlekHareketi();
    }
}
