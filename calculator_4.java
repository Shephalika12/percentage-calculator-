package com.company;
import java.util.Scanner;
public class calculator_4 {
    public static void main(String[] args) {
        System.out.println("Taking input from user ::");
        Scanner maths = new Scanner(System.in);
        System.out.println("Enter Maths Marks ::");
        float a = maths.nextFloat();
        Scanner english = new Scanner(System.in);
        System.out.println("Enter English Marks ::");
        float b = english.nextFloat();
        Scanner science = new Scanner(System.in);
        System.out.println("Enter Science Marks ::");
        float c = science.nextFloat();
        Scanner social = new Scanner(System.in);
        System.out.println("Enter Social Science Marks ::");
        float d = social.nextFloat();
        Scanner computer = new Scanner(System.in);
        System.out.println("Enter Computer Marks ::");
        float e = computer.nextFloat();
        float sum = a + b + c + d + e ;
        System.out.println("The Total Marks :: ");
        System.out.println(sum);
        float percentage = (sum /500 ) * 100 ;
        System.out.println("Percentage % ::");
        System.out.println(percentage);



    }
}
