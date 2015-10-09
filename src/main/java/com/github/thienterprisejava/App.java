package com.github.thienterprisejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Fibonacci Calculation
 *
 */
public class App
{


    static Long computeFibonacci(long i)
    {
        if(i<=0) {
            return 0l;
        }else if(i==1){
            return 1l;
        }
    else
        return computeFibonacci(i - 2)+ computeFibonacci(i - 1);
    }



    public static void main( String[] args )throws IOException
    {
        System.out.println( "Fibonacci Calculation" );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number:");
        try{
            Long i = Long.parseLong(br.readLine());
            System.out.println("Calculation Fibonacci-Number for input "+i);
            System.out.println("Fibonacci-Number for "+i+": "+ computeFibonacci(i));

        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }


        System.out.println("Shutting Down");
    }




}
