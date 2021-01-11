package com.tts;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello!");


        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your name. Accepted characters are listed above. Thanks.");
        String name = input.nextLine();
        System.out.printf("Hello, %s. Would like to select your special numbers? (yes(y) or no(n))\n", name);
        String proceed = input.nextLine();

        if (proceed.equals("yes") || proceed.equals("y")) {
            System.out.println("Let's begin with a few questions.");
        } else if (proceed.equals("no") || proceed.equals("n")) {
            System.out.println("Thank you. Goodbye.");
            } else {
            System.out.println("Please enter yes or no, y or n.");
            input.nextLine();
        }

        do {
            System.out.printf("%s, what's your favorite pet's name?\n", name);
            String petName = input.nextLine();
            System.out.printf("And how old is %s?", petName);

            int petAge;
            if (!input.hasNextInt()) {
                System.out.println("Please enter a number using 0-9 to enter your pet's age.");
                }
            petAge = Integer.parseInt(input.nextLine());
            System.out.printf("Ok, so %s is %s year(s) old. I'm sure it's been a wonderful %s years with %s.\nNow, what is your lucky number?\n", petName, petAge, petAge, petName);
            if (!input.hasNextInt()) {
                System.out.println("Please enter a number using 0-9 to enter your lucky number.");
                }
            int luckyNumber = Integer.parseInt(input.nextLine());
            System.out.println("Thanks, who is your favorite NFL athlete?");
            String athlete = input.nextLine();
            System .out.printf("Now enter %s's jersey number.\n", athlete);
            int athleteNumber = Integer.parseInt(input.nextLine());
            System.out.print("Nice pick. Next question What's your vehicles model year?\n");
            int vehicleYear = Integer.parseInt(input.nextLine());
            System.out.println("Who is your favorite actor/actress?");
            String faveActor = input.nextLine();

            System.out.printf("""

                            So %s we have your pet's name: %s\s
                            %s's age: %s\s
                            lucky number: %s\s
                            favorite athlete: %s\s
                            favorite athletes jersey #: %s\s
                            two-digit vehicle model year: %s\s
                            favorite actor/actress: %s""",
                    name, petName, petName, petAge, luckyNumber, athlete, athleteNumber, vehicleYear, faveActor );
            int mBall = 100 - athleteNumber;
              if (mBall > 75) {mBall /= luckyNumber;}
            int num1 = luckyNumber + vehicleYear;
                if (num1 > 60) {num1 -= 60;}


           int num2 = petAge * faveActor.length();
                if (num2 > 60) {num2 -= 60;}
           int num3 = (int)(Math.random() * 60 );
           int num4 = (int)(Math.random() * 60 );
           int num5 = (int)(Math.random() * 60);


            System.out.printf("\n %s's lottery numbers: %s, %s, %s, %s, %s Magic ball: %s ", name, num1, num2, num3, num4, num5, mBall);
            System.out.println("\nDo you want to calculate a new set of numbers? Yes or no");
            proceed = input.nextLine();
        } while (proceed.equalsIgnoreCase("yes" ) ||
            proceed.equalsIgnoreCase("y"));

    }
}
