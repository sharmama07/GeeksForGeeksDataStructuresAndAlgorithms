package com.home.learning.mathematics;

public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumber problem = new PowerOfNumber();
        Integer number = 2;
        Integer power = 10;
        Integer result = problem.findPowerOfNumber(number, power);
        System.out.println("Power of N: "+ number + " raise to the power " + power + " is "+ result);
        result = problem.findPowerOfNumberIteratively(number, power);
        System.out.println("Power of N: "+ number + " raise to the power " + power + " is "+ result);
    }

    private Integer findPowerOfNumber(Integer number, Integer power) {
        if(power == 0) return 1;
        
        int temp = findPowerOfNumber(number, power/2);

        if(power%2 ==0)
            return temp*temp;
        else 
            return number * temp*temp;

    }

    private Integer findPowerOfNumberIteratively(Integer number, Integer power) {
        Integer result = 1;

        while(power > 0) {
            if((power&1) == 1) { // last digit is 1
                result = result * number;
            }
            number = number * number;
            power = power/2;
        }

        return result;
    }
    
}
