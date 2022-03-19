/**Găsiţi printr-un program numerele naturale de forma abac care se divid
 * cu 11 şi 13 şi afişaţi-le.
 */

package chapter.first.two;

public class theFifteenthProblem {
    public static void main(String args[]){
       double number = 1000;

        while (number > 999 && number < 10000){
            number = number + 1;

             if(number / 11  == Math.floor(number / 11 )){
                 if(number / 13 == Math.floor(number / 13)){

                     System.out.println(number);
                 }
             }
       }
    }
}