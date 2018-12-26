import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// Find the largest palindrome made from the product of 
	// two 3-digit numbers which is less than N.
	// 
	// Our main solution to this problem is to brute force it by testing different 
	// 3 digit numbers starting at 999 and going down.
	// However we can make a few optimizations.
	// 1. Doing some algebra we find that all palindromes are divisble by 11 only once
	// So if we decide that the first number p is going to always be divisible by 11
	// then we set p = the greates 3 digit factor of 11 which is 990 and decrement p
	// by 11 every iteration.
	// 2. If we find a palindrome that is greater than the current result palindrome
	// then we can stop decrementing the second 3 digit number q and directly decrement 
	// the 3 digit number p.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int p = 990;
            int q = 999;
            int result = 0;
            while(p > 99)
            {
                while(q > 99)
                {
                    int curr = p * q;
                    if(curr <= n)
                    {
                        if(curr < result)
                        {
                            break;
                        }
                        if(isPalindrome(curr) && curr > result)
                        {
                            result = curr;
                            break;
                        }
                    }
                    q--;
                }
                p -= 11;
                q = 999;
            }
            System.out.println(result);
        }
    }
    
    private static boolean isPalindrome(int possible)
    {
        int original = possible;
        int reconstructed = 0;
        while(original > 0)
        {
            reconstructed = reconstructed * 10 + original % 10;
            original /= 10;
        }
        return reconstructed == possible;
    }
}
