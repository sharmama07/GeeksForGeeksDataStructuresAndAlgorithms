package com.home.learning.mathematics;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        PrimeNumberCheck problem = new PrimeNumberCheck();
        Integer number = 1010;
        boolean isPrime = problem.isANumberPrime(number);

        System.out.println("Is a number " + number + " prime: " + isPrime);
    }

    private boolean isANumberPrime(Integer number) {

        if(number == 1)
            return false;
        if(number == 2 || number == 3)
            return true;
        if(number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for(int i=5; i*i<number; i=i+6){
            if(number%i == 0 || number%(i+2) == 0 )
                return false;
        }
        return true;
    }
}
