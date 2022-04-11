package ru.netology.sqr;

public class SQRService {


    public int numberSquare(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr < min) {
                continue;
            }
            if (sqr > max) {
                continue;
            }
            count++;
        }
        return count;
    }
}

