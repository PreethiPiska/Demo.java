package com.tnsif.seven;

class PrimeTracing {
    public static void main(String[] args) {
        System.out.println("=== Prime Numbers from 1 to 100 with Tracing ===");

        for (int num = 1; num <= 100; num++) {
            boolean isPrime = true;
            System.out.println("\nChecking number: " + num);

            if (num <= 1) {
                System.out.println("Number is <= 1, so NOT prime");
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    System.out.println("  Dividing " + num + " by " + i);
                    if (num % i == 0) {
                        System.out.println("  " + num + " is divisible by " + i + " → NOT prime");
                        isPrime = false;
                        break; // stop checking further
                    }
                }
            }

            if (isPrime) {
                System.out.println("Result: " + num + " is PRIME ✅");
            } else {
                System.out.println("Result: " + num + " is NOT PRIME ❌");
            }
        }
    }
}