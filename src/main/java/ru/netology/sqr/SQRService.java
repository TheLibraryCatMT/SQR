package ru.netology.sqr;

public class SQRService {
    public int calcAmountSquaresInRange(int min, int max) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= max) {
                if (i * i >= min)
                    amount++;
            }
        }
        return amount;
    }

}
