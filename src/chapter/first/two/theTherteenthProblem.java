/**Se dă un număr natural p. Să se determine dacă numărul conţine
 * în scrierea lui secvenţa 15, folosind un program PASCAL sau C.
 * Exemplu: p=141510 - conţine p=141051 - nu conţine
 */

package chapter.first.two;


import java.util.Scanner;

public class theTherteenthProblem {
    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = keyboard.nextInt();

        int TemporaryNumber = number;


        while(TemporaryNumber != 0){

            TemporaryNumber = number  % 10;
            number = number / 10;

        }
    }
}