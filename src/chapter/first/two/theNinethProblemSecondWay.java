/** Un bancher are un seif cu cifru. Pentru a nu uita cifrul, vrea să-I scrie pe
 * o foaie, dar codificat: fiecare cifră să fie înlocuită cu diferenţa dintre cifra
 * 9 şi cifra respectivă. Bancherul şi-a ales un cifru; ajutaţi-l să-I codifice după
 * metoda lui ştiind că cifrul începe cu o cifră diferită de cifra 9
 * (exemplu: pentru cifrul 386821 codificarea va fi 613178). Scrieţi un program care preia cifrul
 * de la tastatură şi afişează cifrul codificat.
 */

package chapter.first.two;

import java.util.Scanner;

public class theNinethProblemSecondWay {
    public static void main(String args[]){
        System.out.println("Enter the password.");

        Scanner keyboard = new Scanner(System.in);

        // password

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