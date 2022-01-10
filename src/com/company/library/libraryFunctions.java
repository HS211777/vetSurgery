package com.company.library;

import java.util.Scanner;

public class libraryFunctions {
    public static int intInput(){
        Scanner input = new Scanner(System.in);
        int out = -1;
        boolean valid = false;
        while (!valid){
            try{
                out = input.nextInt();
                valid = true;
            }
            catch (Exception e){
                System.out.println("Error "+e);
                input.next();
            }
        }
        return out;
    }
    public static double doubleInput(){
        Scanner input = new Scanner(System.in);
        double out = -1.0;
        boolean valid = false;
        while (!valid){
            try{
                out = input.nextDouble();
                valid = true;
            }
            catch (Exception e){
                System.out.println("Error "+e);
                input.next();
            }
        }
        return out;
    }
    public static String stringInput(){
        Scanner input = new Scanner(System.in);
        String out = "";
        boolean valid = false;
        while (!valid){
            try{
                out = input.next();
                valid = true;
            }
            catch (Exception e){
                System.out.println("Error "+e);
                input.next();
            }
        }
        return out;
    }
}
