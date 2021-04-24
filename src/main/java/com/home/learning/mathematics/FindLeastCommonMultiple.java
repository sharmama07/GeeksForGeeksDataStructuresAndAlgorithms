package com.home.learning.mathematics;

public class FindLeastCommonMultiple {
    
    public static void main(String[] args) {
        FindLeastCommonMultiple problem = new FindLeastCommonMultiple();
        Integer number1 =100, number2 = 15;
        Integer lcm = problem.findLCM(number1, number2);
        System.out.println("LCM of two numbers, " + number1 + " and " + 
        number2 + "  is " + lcm);
    }

    private Integer findLCM(Integer number1, Integer number2) {
        Integer hcf = getHCF(number1, number2);
        return (number1*number2)/hcf;
    }

    private Integer getHCF(Integer number1, Integer number2) {
        if(number2 == 0)
            return number1;
        return getHCF(number2, number1%number2);
    }
}
