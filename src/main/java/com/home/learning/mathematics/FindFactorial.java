package com.home.learning.mathematics;

public class FindFactorial {
    
    public static void main(String[] args) {
        FindFactorial problem = new FindFactorial();
        Integer number = 10;
        Integer factorial = problem.findFactorial(number);
        System.out.println("Factorial of a number " + number +" is "+ factorial);
    }

    private Integer findFactorial(Integer number) {
        if(number ==0 || number ==1)
            return 1;
        return number*findFactorial(number-1);
    }
}
