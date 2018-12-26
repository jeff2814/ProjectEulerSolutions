import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// What is the largest prime factor of a given number N?
	//
	// We know that the prime factors of N are going to be less than or equal to  
	// the square root of N because anything greater than the square root of N would
	// have to be multiplied by a non-integer number in order to get N.
	// We also know that as we divide by its other smaller factors we get closer to 
	// the largest prime factor of N.
	// Every time N is divisble by a number count where count is an integer from 2 to 
	// square root of N, we divide N by that count until it's no 
	// longer divisible or the number = N.
	// Then we should be left with the largest prime factor of N
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long count = 1;
            while(count < Math.sqrt(n))
            {
                count++;
                while(n % count == 0 && count < n)
                {
                    n = n / count;
                }
            }
            System.out.println(n);
        }
    }
}
