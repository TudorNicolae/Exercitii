/**
 *Se citesc de la tastatură numere naturale până la întâlnirea numărului zero.
 * Să se afişeze după citirea fiecărei perechi de numere dacă sunt prime între ele.
 */
package chapter.first.two;

import java.util.Scanner;

public class theEighthProblem {
    public static boolean arePrimeBetween(int firstNumber, int secondNumber){
      for (int i = 1; i <= firstNumber && i <= secondNumber; i++){
          if(firstNumber % i == 0 && secondNumber % i == 0){
              if(i > 1){
                  return false;
              }
          }
      }
        return true;
    }

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int numbers = 1;
        int numbers2 = 1;

        while(numbers != 0){

            //the first number
            System.out.println("Enter the first number;");
            numbers = keyboard.nextInt();

            System.out.println(numbers);

            if(numbers == 0){
                break;
            }

            //the second number
            System.out.println("Enter the second number;");
            numbers2 = keyboard.nextInt();

            System.out.println(numbers2);

            if(numbers2 == 0){
                break;
            }

            if(arePrimeBetween(numbers, numbers2)){
                System.out.println(String.format("The following numbers %d, %d are prime between",numbers, numbers2));
            }
        }
    }
}