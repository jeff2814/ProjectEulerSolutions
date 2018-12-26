import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

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