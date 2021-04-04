package com.example.labone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class LabOne {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        flipNHeads(5);

        while(true){
            try {
                clock();
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

     static String pluralize(String s1, int num){
        if(num == 0 || num > 1){
            return s1+"s";
        }else{
            return s1;
        }

    }

    static void flipNHeads(int n){
      int headcount = 0;
      int flips = 0;
      while(headcount < n){
          double rand = Math.random();
          if(rand < 0.5){
              System.out.println("tails");
              flips++;
              headcount = 0;
          }else{
              System.out.println("heads");
              flips++;
              headcount++;

          }

      }
      System.out.println("It took "+flips +" flips to flip "+ headcount +" heads in a row.");
    }


    static void clock(){
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);

    }
}
