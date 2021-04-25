package com.home.learning.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeFactors {
    public static void main(String[] args) {
        Integer number = 150;
        FindPrimeFactors problem = new FindPrimeFactors();

        Integer [] primeFactors = problem.findPrimeFactors(number);
        String primeFactorStr = Arrays.stream(primeFactors)
          .map(factor -> factor.toString())
          .collect(Collectors.joining(", "));
        System.out.println("Prime factors of " + number + " are " + primeFactorStr);

        primeFactors = problem.findPrimeFactorsEfficienytly(number);
        primeFactorStr = Arrays.stream(primeFactors)
          .map(factor -> factor.toString())
          .collect(Collectors.joining(", "));
        System.out.println("Improved: Prime factors of " + number + " are " + primeFactorStr);
    }

    private Integer[] findPrimeFactors(Integer number) {
        List<Integer> primeFactors = new ArrayList<>();
        for(int start=2; start*start<=number; start++) {
            while(number%start ==0) {
                primeFactors.add(start);
                number = number/start;
            }
        }
        if(number > 1)
            primeFactors.add(number);
        return primeFactors.toArray(new Integer[0]);
    }

    private Integer[] findPrimeFactorsEfficienytly(Integer number) {
        List<Integer> primeFactors = new ArrayList<>();

        while(number%2==0){
            primeFactors.add(2);
            number=number/2;
        }
        while(number%3==0){
            primeFactors.add(3);
            number=number/3;
        }
         for(int start=5; start*start<=number; start=start+6) {
            while(number%start ==0) {
                primeFactors.add(start);
                number = number/start;
            }
            while(number%(start+2) ==0) {
                primeFactors.add(start+2);
                number = number/(start+2);
            }
        }
        if(number > 3)
            primeFactors.add(number);
        return primeFactors.toArray(new Integer[0]);
    }
}
