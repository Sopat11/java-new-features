package it.sosinski;

public sealed interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter() {
        return "getDiameter() called for " +
                switch (this) {
                    case Circle c -> "Circle";
                    case Section s -> "Section";
                    case Triangle t -> "Triangle";
        };
    }
}
