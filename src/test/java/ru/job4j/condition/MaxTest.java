package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To7Then7() {
        int left = 2;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2And3And4Then4() {
        int first = 2;
        int second = 3;
        int third = 4;
        int result = Max.max(first, Max.max(second, third));
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2And7And8And10Then10() {
        int first = 2;
        int second = 7;
        int third = 8;
        int fourth = 10;
        int result = Max.max(Max.max(first, second), Max.max(third, fourth));
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}
