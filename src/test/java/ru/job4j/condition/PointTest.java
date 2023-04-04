package ru.job4j.condition;

import static org.junit.Assert.*;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32To21Then1dot4142() {
        Point a = new Point(3, 2);
        Point b = new Point(2, 1);
        double expected = 1.4142;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18To46Then3dot6055() {
        Point a = new Point(1, 8);
        Point b = new Point(4, 6);
        double expected = 3.6055;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when235To010Then5dot7445() {
        Point a = new Point(2, 3, 5);
        Point b = new Point(0, 1, 0);
        double expected = 5.7445;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when143To021Then3() {
        Point a = new Point(1, 4, 3);
        Point b = new Point(0, 2, 1);
        double expected = 3;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }
}
