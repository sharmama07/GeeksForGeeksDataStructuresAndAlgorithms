package com.home.learning.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Also called sieve of eratosthenes
 */
public class FindAllPrimeNumberLessThanNumber {
    public static void main(String[] args) {
        FindAllPrimeNumberLessThanNumber problem = new FindAllPrimeNumberLessThanNumber();
        Integer number = 23;
        Integer primes [] = problem.findAllPrimeNumberLessThanOrEqualTo(number);
        String primesStr = Arrays.stream(primes)
            .map(prime -> prime.toString())
            .collect(Collectors.joining(", "));
        System.out.println("Prime number less than or equal to "+ number + " are \n " + primesStr);
    }

    private Integer[] findAllPrimeNumberLessThanOrEqualTo(Integer number) {
        List<Integer> primes = new ArrayList<>();
        Boolean arr [] = new Boolean[number+1];
        Arrays.fill(arr, true);
        for(int i=2; i<=number; i++) {
            if(arr[i]) {
                primes.add(i);
                int temp = i*i;
                while(temp<=number){
                    arr[temp] = false;
                    temp +=i;
                }
            }
        }
        return primes.toArray(new Integer[0]);
    }
    
}
