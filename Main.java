package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputnum;
    int noOfGusses = 0;


    Game(){
        Random num = new Random();
         this.number =  num.nextInt(100);
    }
    void takeUserInput(){
        System.out.print(" Guess the number : ");
        Scanner sc = new Scanner(System.in);
         this.inputnum = sc.nextInt();

    }
    boolean isNumberCorrect(){
        noOfGusses++;
        if (inputnum == number){
            System.out.format("Yes you are right 👍🫶, The correct number is %d in %d gusses \n" , number , noOfGusses);
            return true;
        }

        else if (inputnum>number) {
            System.out.println("Too high😒");

        } else if (inputnum<number) {
            System.out.println("Too low😒");
        }
        else {
            System.out.println("Guess Again");

        }
        return false;

    }
    }



public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        boolean n = false;
        while (!n){
            g.takeUserInput();
           n = g.isNumberCorrect();
            System.out.println(n);
        }








        }



    }





