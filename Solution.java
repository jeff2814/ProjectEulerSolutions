import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// By considering the terms in the Fibonacci sequence whose 
	// values do not exceed N, find the sum of the even-valued terms.
	// 
	// Our sequence of fibonnaci numbers follows the patterns
	// 1, 2, 3, 5, 8, 13...
	// We know that an odd number + an even number = odd number 
	// even number + even number = even number
	// odd number + odd number = even number
	// So every 3rd number starting with the second number is even 
	// Doing some algebra we find that the next even fibonacci number is 
	// 4 * current even fibonnaci number + previous even fibonnaci number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long fibL = 2;
            long fibS = 0;
            long bigFib = fibL;
            long sum = 0;
            while(bigFib < n)
            {
                sum += bigFib;
                bigFib = 4 * fibL + fibS;
                fibS = fibL;
                fibL = bigFib;
            }
            System.out.println(sum);
        }
    }
}