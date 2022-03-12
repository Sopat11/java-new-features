package it.sosinski;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    Point pointA = new Point(1.0, 2.0);
    Point pointB = new Point(2.0, 3.0);

    @Test
    void shouldReturnStringWithProperFirstPointXValue() {
        String distance = pointA.distance(pointB);
        Assertions.assertThat(distance).contains(String.valueOf(pointA.x()));
    }

    @Test
    void shouldReturnStringWithProperSecondPointXValue() {
        String distance = pointA.distance(pointB);
        Assertions.assertThat(distance).contains(String.valueOf(pointB.x()));
    }
}