package com.tnsif.seven;

class ArmstrongRangeTracing {
    public static void main(String[] args) {
        System.out.println("=== Armstrong Numbers from 1 to 50 (Tracing) ===");

        for (int num = 1; num <= 50; num++) {
            int sum = 0, temp = num;
            System.out.println("\nChecking number: " + num);

            while (temp > 0) {
                int digit = temp % 10;
                int cube = digit * digit * digit;

                System.out.println("  Extracted digit: " + digit);
                System.out.println("  Cube of " + digit + " = " + cube);

                sum += cube;
                System.out.println("  Updated sum: " + sum);

                temp = temp / 10;
                System.out.println("  Remaining number: " + temp);
            }

            System.out.println("Final sum of cubes: " + sum);

            if (sum == num) {
                System.out.println("✅ " + num + " is an Armstrong Number");
            } else {
                System.out.println("❌ " + num + " is NOT an Armstrong Number");
            }
        }
    }
}
