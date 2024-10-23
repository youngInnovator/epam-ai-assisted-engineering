package com.epam.ai;

public class PrimeSum {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to calculate the sum of primes up to n
    public static int sumOfPrimes(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        int n = 20; // Replace with your desired value of n
        System.out.println("The sum of prime numbers up to " + n + " is: " + sumOfPrimes(n));
    }
}

