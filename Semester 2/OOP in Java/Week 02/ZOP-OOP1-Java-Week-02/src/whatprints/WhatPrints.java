package whatprints;

public class WhatPrints {
    public static void main(String[] args) {
        // ⁡⁣⁢⁢Part A:⁡
        int answer = 4;
        int counter = 2;
        while (counter < 5) {
            if (counter < 4) {
                answer += counter;
            } else {
                answer -= counter;
            }
            counter++;
        }
        System.out.println(answer);

        // ⁡⁣⁢⁢Part B:⁡
        int luckyNumber = 0;
        for (int i = 10; i > 0; i -= 2) {
            if (i > luckyNumber) {
                luckyNumber++;
            } else {
                {
                    luckyNumber--;
                }
            }
        }
        System.out.println(luckyNumber);
    }
}
