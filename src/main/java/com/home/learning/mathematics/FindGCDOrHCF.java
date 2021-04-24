package com.home.learning.mathematics;

public class FindGCDOrHCF {
    
    public static void main(String[] args) {
        FindGCDOrHCF problem = new FindGCDOrHCF();
        Integer number1 = 10;
        Integer number2 = 150;

        Integer gcd = problem.findGCDOrHCF(number1, number2);
        System.out.println("GCD or HCF of " + number1 + " and " + number2 +
        " is " + gcd);
    }

    private Integer findGCDOrHCF(Integer number1, Integer number2) {
        Integer smaller, larger;
        if(number1 > number2) {
            smaller = number2;
            larger = number1;
        } else {
            smaller = number1;
            larger = number2;
        }

        if(larger%smaller == 0)
            return smaller;
        else 
            return findGCDOrHCF(smaller, larger%smaller);
    }
}
