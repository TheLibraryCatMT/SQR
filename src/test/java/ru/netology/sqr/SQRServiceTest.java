package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void sqrTest200_300 () {
        SQRService service = new SQRService();
        int actual = service.calcAmountSquaresInRange(200,300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrTest0_1000 () {
        SQRService service = new SQRService();
        int actual = service.calcAmountSquaresInRange(0,1000);
        int expected = 22;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void sqrTest0_10 () {
        SQRService service = new SQRService();
        int actual = service.calcAmountSquaresInRange(0,10);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
