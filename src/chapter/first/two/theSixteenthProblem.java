/**Scrieţi un program prin care să determinaţi şi să afişaţi numerele
 * de forma abac cu a-o-b-e-c
 * ştiind că suma cifrelor este un număr de două cifre identice.
 */
package chapter.first.two;

public class theSixteenthProblem {
    public static void main (String args []){
        int number = 1000;
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int fourthNumber = 1;
        int numberSSum = 1;
        int firstSum = 1;
        int secondSum = 1;


        while(number > 999 && number < 10000){
            number = number + 1;
            firstNumber = number / 1000;
            secondNumber = (number / 100) % 10;
            thirdNumber = (number / 10) % 10;
            fourthNumber = number % 10;
            numberSSum = firstNumber + secondNumber + thirdNumber + fourthNumber;
            firstSum = numberSSum / 10;
            secondSum = numberSSum % 10;
            if(firstSum == secondSum){
                System.out.println(number);
            }
        }
    }
}