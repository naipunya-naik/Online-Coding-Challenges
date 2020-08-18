import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
            while(in.hasNext())
            {
           long n = in.nextLong();
        long factofnum =factorial(n);
        System.out.println(factofnum);
        }    
    }
    
    public static long factorial(long n)
        {
        if(n==0 || n==1)
            {
            return 1;
        }
        else
            return n*factorial(n-1);
    }
}
