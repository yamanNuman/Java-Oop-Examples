package lesson_11;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void originLength(){
       double num1 = Math.pow(this.x,2) + Math.pow(this.y,2);
       double num2 = Math.sqrt(num1);
       System.out.println("Origin Length : " + num2);
    }

    void twoPointLength(Point point2){
       double num1 = Math.pow(this.x-point2.x,2) + Math.pow(this.y - point2.y,2);
       double num2 = Math.sqrt(num1);
       System.out.println("Two Points Length : " + num2);
    }

    Point clone (Point point){
        return new Point(point.x, point.y);
    }

    void getMove(Point point){
        System.out.println("Current Coordinates : " + point.x + " " + point.y);
    }

    void setMove(){
       this.x = x + 2;
       this.y = y + 3;
    }
}
