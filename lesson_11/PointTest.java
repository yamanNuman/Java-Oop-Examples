package lesson_11;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(3.15,4.35);
        Point point2 = new Point(3.56,6.43);


        point1.originLength();
        point1.twoPointLength(point2);
        Point clonePoint =  point1.clone(point1);
        System.out.println("Clone Point Coordinate : " + clonePoint.x + " " + clonePoint.y);

        point1.getMove(point1);
        System.out.println();
        point1.setMove();
        point1.getMove(point1);

    }
}
