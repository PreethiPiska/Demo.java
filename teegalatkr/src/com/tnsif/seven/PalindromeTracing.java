package com.tnsif.seven;

class PalindromeTracing {
    public static void main(String[] args) {
        int num = 121;   // You can change this value to test other numbers
        int rev = 0, temp = num;

        System.out.println("=== Palindrome Tracing ===");
        System.out.println("Initial number: " + num);

        while (temp > 0) {
            int digit = temp % 10;
            System.out.println("Extracted digit: " + digit);

            rev = rev * 10 + digit;
            System.out.println("Updated reverse number: " + rev);

            temp = temp / 10;
            System.out.println("Remaining number after removing last digit: " + temp);
        }

        System.out.println("Final reversed number: " + rev);

        if (num == rev) {
            System.out.println(num + " is a Palindrome ✅");
        } else {
            System.out.println(num + " is NOT a Palindrome ❌");
        }
    }
}