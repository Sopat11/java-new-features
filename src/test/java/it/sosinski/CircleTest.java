package it.sosinski;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    Point pointA = new Point(1.0, 2.0);
    Circle circle = new Circle(pointA, 2.0);

    @Test
    void shouldReturnStringWithProperPointXValue() {
        String area = circle.getArea();
        Assertions.assertThat(area).contains(String.valueOf(pointA.x()));
    }

    @Test
    void shouldReturnStringWithProperRadiusValue() {
        String area = circle.getArea();
        Assertions.assertThat(area).contains(String.valueOf(circle.radius()));
    }

    @Test
    void shouldReturnStringEndingWithCircle() {
        String area = circle.getDiameter();
        Assertions.assertThat(area).endsWith("Circle");
    }
}