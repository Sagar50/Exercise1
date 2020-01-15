// Sagar Patel, CSCI1660, Week1 Exercise 1, 1/15/2020
package com.company.Patel;
import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the name of your city?: ");
        String cityName = input.nextLine();
        System.out.println("What is the city's zip code?: ");
        int cityZip = input.nextInt();
        float[] temp = {0,0,0,0,0};
        for (int i = 0; i <= 4; i++) {
            System.out.println("What is the temp for day " + i + "?: ");
            temp[i] = input.nextInt();
        }
        float avgTemp = (temp[0]+temp[1]+temp[2]+temp[3]+temp[4])/5;
        System.out.println("City: " + cityName + " Zip Code: " + cityZip + " Average High Temperature: " + avgTemp );

    }
}



