package it.sosinski;

public final class Triangle extends Polygon{

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
