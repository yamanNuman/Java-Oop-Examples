package lesson_09;

public class Circle {
    double yaricap;
    
    public Circle(double yaricap) {
        this.yaricap = yaricap;
    }
    void getShow(){
        System.out.println("Daire-1 Yaricap : " + yaricap);
    }

    double alanHesaplama(){
        return Math.pow(this.yaricap,2)*3.14;
    }
    double cevreHesaplama(){
        return 2*3.14*this.yaricap;
    }
}
