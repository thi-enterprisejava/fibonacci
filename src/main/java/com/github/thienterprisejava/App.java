package com.github.thienterprisejava;

/**
 * Hello world!
 */
public class App {

    private static int fibonacci(int zahl) {
        if(zahl <= 2) {
            return 1;
        }
        return fibonacci(zahl - 1) + fibonacci(zahl - 2);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Fibonacci von 7 ist: " + fibonacci(7));
    }
}
