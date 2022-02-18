package ru.netology.sqr;

public class SQRService {
    public int calculateSqrCountInRange(int start, int end) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            int sqr = i * i;
            if (sqr >= start && sqr <= end) {
                counter++;
            }
        }
        return counter;
    }
}