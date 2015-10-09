package com.github.thienterprisejava;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public long fib(int n) {
        if(n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String... args) {
        AppTest fibonacci = new AppTest();
        for(int n = 1; n < Integer.parseInt(args[0]); n++)
            System.out.printf("fib(%d) = %d%n", n, fibonacci.fib(n));
    }
}


