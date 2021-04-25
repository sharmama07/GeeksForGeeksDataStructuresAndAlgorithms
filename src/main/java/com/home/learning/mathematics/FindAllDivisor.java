package com.home.learning.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDivisor {
    public static void main(String[] args) {
        FindAllDivisor problem = new FindAllDivisor();
        Integer number =150;
        
        Integer [] factors = problem.findAllDivisor(number);
        String factorStr = Arrays.stream(factors)
            .map(factor -> factor.toString())
            .collect(Collectors.joining(", "));
        System.out.println("Divisor of number "+ number +" are "+ factorStr);
    }

    private Integer[] findAllDivisor(Integer number) {
        List<Integer> factors = new ArrayList<>();
        factors.add(1);
        int i=2;
        for(; i*i <=number; i++) {
            if(number%i == 0)
            {
                factors.add(i);
            }
        }
        for(i=i-1; i*i >0; i--) {
            if(number%i == 0 && (i != number/i))
            {
                factors.add(number/i);
            }
        }
        return factors.toArray(new Integer [0]);
    }
}
