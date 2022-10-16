package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void standardСheck() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fullСheck() {
        SQRService service = new SQRService();
        int actual = service.calculate(99, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void singleValue() {
        SQRService service = new SQRService();
        int actual = service.calculate(99, 101);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
