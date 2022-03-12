package it.sosinski;

public final class Section extends Polygon{

    private final Point pointA;
    private final Point pointB;

    public Section(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this);
    }

    @Override
    public String toString() {
        return "Section{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }
}
