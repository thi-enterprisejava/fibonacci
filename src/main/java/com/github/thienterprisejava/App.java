package com.github.thienterprisejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{


    static int computeFib(int i)
    {
        if(i<=0) {
            return 0;
        }else if(i==1){
            return 1;
        }
    else
        return computeFib(i - 2)+ computeFib(i - 1);
    }



    public static void main( String[] args )throws IOException
    {
        System.out.println( "Fibunacci Calculation" );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number:");
        try{
            int i = Integer.parseInt(br.readLine());
            System.out.println("Fibunacci-Number for "+i+": "+computeFib(i));
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
    }




}
