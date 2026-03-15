package com.gla.Level3;

class NumberChecker4 {
    public static int sumOfDivisors(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }
    public static boolean isPerfect(int num) {

        int sum = sumOfDivisors(num);

        return sum == num;
    }
    public static boolean isAbundant(int num) {

        int sum = sumOfDivisors(num);

        return sum > num;
    }
    public static boolean isDeficient(int num) {

        int sum = sumOfDivisors(num);

        return sum < num;
    }
    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
    public static boolean isStrong(int num) {

        int temp = num;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + factorial(digit);

            temp = temp / 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println("Number = " + number);

        System.out.println("Perfect Number: " + isPerfect(number));

        System.out.println("Abundant Number: " + isAbundant(number));

        System.out.println("Deficient Number: " + isDeficient(number));

        System.out.println("Strong Number: " + isStrong(number));
    }
}