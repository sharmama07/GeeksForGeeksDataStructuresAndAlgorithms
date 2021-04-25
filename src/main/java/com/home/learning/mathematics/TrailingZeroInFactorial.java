package com.home.learning.mathematics;

public class TrailingZeroInFactorial {
    
    public static void main(String[] args) {
        TrailingZeroInFactorial problem = new TrailingZeroInFactorial();
        Integer number = 10;
        Integer numOfZero = problem.findTrailingZeroInFactorial(number);
        System.out.println("Number of trailing zero in factorial of " + number + 
        " are " + numOfZero);
    }

    private Integer findTrailingZeroInFactorial(Integer number) {
        Integer trailingZero = 0;
        Integer divisor =5;
        while(number/divisor > 0 ) {
            trailingZero = trailingZero + number/divisor;
            divisor = divisor*5;
        }
        return trailingZero;
    }
}
