package com.home.learning.mathematics;

public class CountDigits {

    public static void main(String[] args) {
        CountDigits problem = new CountDigits();
        Integer digits = problem.countDigits(100);
        System.out.println("Number of digit in 10 are "+ digits);
    }

    private int countDigits(int i) {

        int digits = 0;
        while(i!=0) {
            digits++;
            i = i/10;
        }

        return digits;

    }
    
}
