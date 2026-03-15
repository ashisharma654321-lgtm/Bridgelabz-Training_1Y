package com.gla.Level3;

class NumberChecker2 {
    public static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
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
    public static int[] reverseArray(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }
    public static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i])
                return false;
        }

        return true;
    }
    public static boolean isPalindrome(int[] digits) {

        int[] rev = reverseArray(digits);

        return compareArrays(digits, rev);
    }
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int number = 12021;

        System.out.println("Number = " + number);

        int[] digits = storeDigits(number);

        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println();

        System.out.println("Palindrome Number: " + isPalindrome(digits));

        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
