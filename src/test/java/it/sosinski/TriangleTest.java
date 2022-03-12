package it.sosinski;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    Point pointA = new Point(1.0, 2.0);
    Point pointB = new Point(1.0, 2.0);
    Point pointC = new Point(1.0, 2.0);
    Triangle triangle = new Triangle(pointA, pointB, pointC);

    @Test
    void shouldReturnStringWithProperFirstPointXValue() {
        String area = triangle.getArea();
        Assertions.assertThat(area).contains(String.valueOf(pointA.x()));
    }

    @Test
    void shouldReturnStringWithProperSecondPointXValue() {
        String area = triangle.getArea();
        Assertions.assertThat(area).contains(String.valueOf(pointB.x()));
    }

    @Test
    void shouldReturnStringWithProperThirdPointXValue() {
        String area = triangle.getArea();
        Assertions.assertThat(area).contains(String.valueOf(pointC.x()));
    }

    @Test
    void shouldReturnStringEndingWithTriangle() {
        String area = triangle.getDiameter();
        Assertions.assertThat(area).endsWith("Triangle");
    }
}