package it.sosinski;

public record Circle(Point point, double radius) implements Shape{

    public Circle {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this);
    }
}
