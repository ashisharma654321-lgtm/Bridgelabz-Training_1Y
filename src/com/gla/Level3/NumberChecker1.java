package com.gla.Level3;

class NumberChecker1 {
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static int[] storeDigits(int num) {
        int size = countDigits(num);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    public static int sumdigitsOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        int number = 21231;

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Digit count: " + count);

        int[] digits = storeDigits(number);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int squareSum = sumOfDigits(digits);
        System.out.println("Sum of squares: " + squareSum);

        System.out.println("Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " : " + freq[i][1]);
            }
        }
    }
}