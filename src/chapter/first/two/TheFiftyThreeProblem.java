/**
 Ajutaţi un elev să înveţe tabla înmulţirii, afişând tabla
 pentru înmulţirea/pânăla 10) cu orice cifră dorită de el.
 Exemplu: pentru tabla înmulţirii cu 7 se va afişa:
 Ox7=0 1x7=7
 1Ox7 = 70
 */


package chapter.first.two;

import java.util.Scanner;

public class TheFiftyThreeProblem {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the digit.");

        int number = keyboard.nextInt();

        for(int i = 0; i < 11; i++){
            if (number == i){
                for (int n = 0; n < 11; n ++){
                    System.out.println(number * n);
                }
            }
        }
    }
}