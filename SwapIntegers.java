package com.jap.integerswap;

import java.util.Scanner;

public class SwapIntegers {

    public static void main(String[] args) {

        SwapIntegers swapIntegers = new SwapIntegers();
            // Declare a scanner object here

            // Get the number value as integer from the console and store in variable 'number'
            int number = 0;
            long swappedNumber = swapIntegers.swapNumbers(number);
            System.out.println("Swapped Number is  : "+swappedNumber);
        }

    // Function accepts number and returns result with each pair of digits swapped.
    public long swapNumbers(long number) {

	    Scanner sc=new Scanner(System.in);

        long swap=0;
        long place=1;

        if(number>0)
        {
            while(number > 9)
            {

                swap += place*10*(number%10);
                number /= 10;
                swap += place * (number%10);
                number /= 10;
                place *=100;

            }
			return swap + place *number;
        }
		else
		{
		return 0;
	    }
	}
}