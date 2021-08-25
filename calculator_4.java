package com.company;
import java.util.Scanner;
public class calculator_4 {
    public static void main(String[] args) {
        System.out.println("Taking input from user ::");
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter Maths Marks ::");
        float a = cs.nextFloat();
        System.out.println("Enter English Marks ::");
        float b = cs.nextFloat();
        System.out.println("Enter Science Marks ::");
        float c = cs.nextFloat();
        System.out.println("Enter Social Science Marks ::");
        float d = cs.nextFloat();
       System.out.println("Enter Computer Marks ::");
        float e = cs.nextFloat();
        float sum = a + b + c + d + e ;
        System.out.println("The Total Marks :: ");
        System.out.println(sum);
        float percentage = (sum /500 ) * 100 ;
        System.out.println("Percentage % ::");
        System.out.println(percentage);



    }
}
