package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a difficulty 1-3");
        int computerDifficulty = input.nextInt();
        String playAgain = "yes";
        while(playAgain.equals("yes")){
            int randomNumber1 = random.nextInt(12);
            int randomNumber2 = random.nextInt(12);
            int randomTotalComputer = randomNumber1 + randomNumber2;

            int randomNumbers3 = random.nextInt(12);
            int randomNumbers4 = random.nextInt(12);
            int randomTotalUser = randomNumbers3 + randomNumbers4;
            int randomTotalUserHit = random.nextInt(12);
            int randomTotalComputerHit = random.nextInt(12);
            System.out.println("Your number is " + randomTotalUser);

                System.out.println("Hit or stand?");
                String userAnswer = (input.next());
                if(userAnswer.equals("stand")){
                     randomTotalUser = randomTotalUser;
                    randomTotalComputerHit = random.nextInt(12);
                    if(randomTotalComputer < (17 - computerDifficulty) ){
                        randomTotalComputer = randomTotalComputerHit + randomTotalComputer;
                    }
                }
                else if(userAnswer.equals("hit")) {
                    randomTotalUserHit = random.nextInt(12);
                    randomTotalComputerHit = random.nextInt(12);
                    if(randomTotalComputer < (17 - computerDifficulty) ){
                        randomTotalComputer = randomTotalComputerHit + randomTotalComputer;
                    }
                    randomTotalUser = randomTotalUserHit + randomTotalUser;
                    System.out.println("Your number is " + randomTotalUser + ", Your opponents number is " + randomTotalComputer);
                }

            if(randomTotalUser < 21){
            if(randomTotalComputer < 21)   {
                if(randomTotalUser > randomTotalComputer){
                    System.out.println("You win!, Your number was " + randomTotalUser + " Opponents number was " + randomTotalComputer);
                }
            }
            }
            if(randomTotalUser > 21){
            System.out.println("You lose, your number was " + randomTotalUser + " Opponents number was " + randomTotalComputer);
         }
            if(randomTotalUser < 21){
            if(randomTotalComputer < 21){
                if(randomTotalUser < randomTotalComputer){
                    System.out.println("You lose, your number was " + randomTotalUser + " Opponents number was " + randomTotalComputer);
                }
            }
            if(randomTotalUser == randomTotalComputer){
                System.out.println("draw, your number was " + randomTotalUser + " Opponents number was " + randomTotalComputer);
            }
            }
            else{
            System.out.println("You lose, your number was" + randomTotalUser + " Opponents number was " + randomTotalComputer);
         }
            System.out.println("Do you want to play again?");
            playAgain = input.next();
    }   }
}