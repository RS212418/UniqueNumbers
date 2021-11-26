package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Array();
        RandomNumber();
        randomNumIntoArray();
    }

    private static void Array() {
        String[] list = new String[11];
    }

    private static void RandomNumber() {
            while (true){
                try {
                    Scanner input = new Scanner(System.in);
                    Random random = new Random();
                    System.out.println(" Please enter a random number between 0 and 10");
                    int ran = input.nextInt();
                    if (ran <= 10){
                        break;
                    }
                } catch (Exception e){
                    System.out.println("Error, your number is not between 0 and 10");
                }
            }
        }
    private static void randomNumIntoArray() {
        }
    }



