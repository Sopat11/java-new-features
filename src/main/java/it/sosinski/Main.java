package it.sosinski;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(4.0, 3.2);
        Section section = new Section(point1, point2);

        System.out.println(section.getDiameter());
    }
}
