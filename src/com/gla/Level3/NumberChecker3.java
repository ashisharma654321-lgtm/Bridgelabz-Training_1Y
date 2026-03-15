package com.gla.Level3;

class NumberChecker3 {
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }

        return sum == num;
    }
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }

        return sum == product;
    }
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;

            num = num / 10;
            square = square / 10;
        }

        return true;
    }
    public static boolean isBuzz(int num) {
        if (num % 7 == 0 || num % 10 == 7)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println("Number = " + number);

        System.out.println("Prime Number: " + isPrime(number));

        System.out.println("Neon Number: " + isNeon(number));

        System.out.println("Spy Number: " + isSpy(number));

        System.out.println("Automorphic Number: " + isAutomorphic(number));

        System.out.println("Buzz Number: " + isBuzz(number));
    }
}