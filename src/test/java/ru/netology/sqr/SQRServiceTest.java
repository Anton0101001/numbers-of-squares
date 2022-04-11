package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void numbersEquals() {
        SQRService service = new SQRService();
        int actual = service.numberSquare(200, 300);
        int expected = 3;

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void numbersLessForOne() {
        SQRService service = new SQRService();
        int actual = service.numberSquare(199, 299);
        int expected = 3;

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void numbersMoreForOne() {
        SQRService service = new SQRService();
        int actual = service.numberSquare(201, 301);
        int expected = 3;

        assertEquals(expected, actual);
    }
}