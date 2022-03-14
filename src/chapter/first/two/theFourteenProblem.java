 /**Determinaţi printr-un program şi afişaţi numerele naturale de 4 cifre de forma
  *  abcd ştiindcă produsul dintre numerele ab şi cd este 323.
  */
package chapter.first.two;

public class theFourteenProblem {
    public static void main(String args[]){

        int number = 1000;

        int theFirstPart = 1;
        int theSecondPart = 1;


        while (number > 999 && number < 9999){
            number = number + 1;
            theFirstPart = number / 100;
            theSecondPart = number % 100;

            if(theFirstPart * theSecondPart == 323 ){
                System.out.println("The number " + number + " respects all the conditions above.");
            }
        }
    }
}