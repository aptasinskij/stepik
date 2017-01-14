package javabasecource.module1;

import java.math.BigInteger;

/**
 * Created by andrew on 23.12.16.
 */
public class Quiz {

    public int checkLoopYears(int year){
        return (year / 4) - (year / 100) + (year / 400);
    }

    public boolean isPolindrom(String string){
        String cleanedString = string.replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return reversedString.equalsIgnoreCase(cleanedString);
    }

    public BigInteger factorial(int number){
        if (number <= 1){
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(number).multiply(factorial(number - 1));
    }

}
