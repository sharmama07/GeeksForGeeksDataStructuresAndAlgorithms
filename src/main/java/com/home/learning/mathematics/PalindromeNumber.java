package com.home.learning.mathematics;

/**
 * @author Mayur Sharma
 * Given a number N, 
 * following program will check whether it is a palindrome
 */
public class PalindromeNumber {
    
    public static void main(String[] args) {
        PalindromeNumber problem = new PalindromeNumber();
        Integer number = 7887;
        boolean isPalindrome = problem.isPalindrome(number);
        System.out.println("Is Number " + number + " palindrome " + isPalindrome);
    }

    private boolean isPalindrome(int number) {
        int save = number;
        int reverse =0;
        while(number != 0) {
            int rem = number % 10;
            reverse = reverse*10 + rem;
            number = number/10;
        }
        if(save == reverse) return true;
        return false;

    }
}
