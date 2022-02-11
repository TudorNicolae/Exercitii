/** Aceeaşi problemă dar bancherul doreşte să codifice cifrul inserând
 * între fiecare două cifre ale sale cifra 3.
 * Programul va afişa numărul obţinut.
 */


package chapter.first.two;

import java.util.Scanner;

public class theTenthProblem {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        // password
        System.out.println("Enter the password.");

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

            int codification = 3;

            System.out.println(String.format("The codification is %d %d", theLastDigit, codification));
        }
    }
}