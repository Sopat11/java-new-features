package it.sosinski;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SectionTest {

    Point pointA = new Point(1.0, 2.0);
    Point pointB = new Point(4.0, 3.0);
    Section section = new Section(pointA, pointB);

    @Test
    void shouldReturnStringWithProperFirstPointXValue() {
        String area = section.getArea();
        Assertions.assertThat(area).contains(String.valueOf(pointA.x()));
    }

    @Test
    void shouldReturnStringWithProperSecondPointXValue() {
        String area = section.getArea();
        Assertions.assertThat(area).contains(String.valueOf(pointB.x()));
    }

    @Test
    void shouldReturnStringEndingWithSection() {
        String area = section.getDiameter();
        Assertions.assertThat(area).endsWith("Section");
    }
}