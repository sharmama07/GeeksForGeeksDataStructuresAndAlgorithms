package com.home.learning.mathematics;

public class FindGCDOrHCF {
    
    public static void main(String[] args) {
        FindGCDOrHCF problem = new FindGCDOrHCF();
        Integer number1 = 12;
        Integer number2 = 15;

        Integer gcd = problem.findGCDOrHCF(number1, number2);
        System.out.println("GCD or HCF of " + number1 + " and " + number2 +
        " is " + gcd);
        gcd = problem.improvedFindGCDOrHCF(number1, number2);
        System.out.println("Improved : GCD or HCF of " + number1 + " and " + number2 +
        " is " + gcd);
    }
    private Integer improvedFindGCDOrHCF(Integer number1, Integer number2) {
        if(number2 == 0)
            return number1;
        else 
            return findGCDOrHCF(number2, number1%number2);
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
