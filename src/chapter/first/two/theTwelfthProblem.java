package chapter.first.two;

import java.util.Scanner;

public class theTwelfthProblem {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the codificated password : ");

        int codificatedPassword = keyboard.nextInt();

        //unseenable variables

        int number = 1;
        int temporaryPassword = codificatedPassword;
        int secondTemporaryPassword = codificatedPassword;
        int theLastDigit = 0;


        while(temporaryPassword / 10 != 0){

            number = number * 10;

            temporaryPassword = temporaryPassword / 10;

        }

        number = number * 10;

        while(number != 1){
            number = number / 10;

            secondTemporaryPassword = codificatedPassword;
            secondTemporaryPassword = secondTemporaryPassword / number;

            theLastDigit = secondTemporaryPassword % 10;

            int Decodification = 9 - theLastDigit;

            System.out.println(String.format("The codificated digit from password is %d and the true digit is %d.",theLastDigit , Decodification));
        }
    }
}