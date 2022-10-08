package ru.job4j.condition;

import static org.junit.Assert.*;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32To21Then1dot4142() {
        double expected = 1.4142;
        int x1 = 3;
        int y1 = 2;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18To46Then3dot6055() {
        double expected = 3.6055;
        int x1 = 1;
        int y1 = 8;
        int x2 = 4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
