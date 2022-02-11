package chapter.first.two;

import java.util.Scanner;

public class smth {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);

        // password
        System.out.println("Enter the codificated password.");

        int password = keyboard.nextInt();

        //unseenable variables

        int number = 1;
        int temporaryPassword = password;
        int secondTemporaryPassword = password;
        int theLastDigit = 0;


        while(temporaryPassword / 10 != 0){

            number = number * 10;

            temporaryPassword = temporaryPassword / 10;

        }

        number = number * 10;

        while(number != 1){
            number = number / 10;

            secondTemporaryPassword = password;
            secondTemporaryPassword = secondTemporaryPassword / number;

            theLastDigit = secondTemporaryPassword % 10;

            int codification = 9 - theLastDigit;

            System.out.println(String.format("The true digit from password is %d and the codification digit is %d.",theLastDigit , codification));
        }
    }
}