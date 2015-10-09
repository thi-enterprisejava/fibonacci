package com.github.thienterprisejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Fibonacci
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Eingabe der Zahl" );
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            long value = Long.parseLong(input);
            long result = fibonacci(value);
            System.out.println("Ergebnis von Fib(" +value+ ") = " +result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static long fibonacci(long number)
    {
        if(number <= 0)
        {
            return 0;
        } else if(number == 1)
        {
            return 1;
        } else {
            return fibonacci(number-2)+fibonacci(number-1);
        }
    }
}
