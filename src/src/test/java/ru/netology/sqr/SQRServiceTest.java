package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    SQRService sqrService = new SQRService();

    @Test
    void shouldReturnThreeFor200And300() {
        int start = 200;
        int end = 300;
        int expected = 3;
        int actual = sqrService.calculateSqrCountInRange(start, end);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroForSmallRange() {
        int start = 0;
        int end = 99;
        int expected = 0;
        int actual = sqrService.calculateSqrCountInRange(start, end);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroForRevertedRange() {
        int start = 100;
        int end = 0;
        int expected = 0;
        int actual = sqrService.calculateSqrCountInRange(start, end);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneForInboundStart() {
        int start = 100;
        int end = 101;
        int expected = 1;
        int actual = sqrService.calculateSqrCountInRange(start, end);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneForInboundEnd() {
        int start = 120;
        int end = 121;
        int expected = 1;
        int actual = sqrService.calculateSqrCountInRange(start, end);
        assertEquals(expected, actual);
    }
}