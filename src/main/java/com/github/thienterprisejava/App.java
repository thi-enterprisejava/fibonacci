package com.github.thienterprisejava;

/**
 * Hello world!
 *
 */
public class App 
{
    // inspired by http://9gag.com/gag/aEzODLx

    public static void main( String[] args )
    {
        for (int i =0; i < 10; ++i)
            System.out.println(fibonacci(i));
    }

    public static int fibonacci(int number) {
        if (number<=0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number-2) + fibonacci(number-1);
        }
    }
}
