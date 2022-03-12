package it.sosinski;

public record Point(double x, double y) {

    String distance(Point p) {
        return String.format("distance(%s) called for %s", p, this);
    }
}
