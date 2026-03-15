package com.gla.Level3;

class Football {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }

        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;

        for (int h : heights) {
            sum += h;
        }

        return sum;
    }
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];

        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }

        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Heights of players:");

        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n");

        System.out.println("Sum of heights: " + findSum(heights));
        System.out.println("Mean height: " + findMean(heights));
        System.out.println("Shortest height: " + findShortest(heights));
        System.out.println("Tallest height: " + findTallest(heights));
    }
}