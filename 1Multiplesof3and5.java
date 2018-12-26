import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// Find the sum of all the multiples of 3 or 5 below N
	// We know the sum of a series of consecutive integers is n * (n+1) /2
	// So if we multiply n * (n+1) /2 by a constant k, then we get the sum
	// of the multiples of k up to k * n.
	// In order to find the sum of all multiples of 3 and 5
	// We use the k * n * (n+1) / 2 where k =  3 and k = 5 to get the sum of 
	// multiples of 3 and 5 up to n. However, we double count integers that are
	// both multiples of 3 and 5 like 15, 30, etc. 
	// So we subtract k * n * (n+1) / 2 to remove double added multiples of 3 and 5
    private static long magic(long n, int k)
    {
        long temp  = n / k;
        return (long) (temp * (temp + 1) / 2) * k;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong() - 1;
            long sum = magic(n, 3) + magic(n, 5) - magic(n, 15);
            System.out.println(sum);
        }
    }
}
