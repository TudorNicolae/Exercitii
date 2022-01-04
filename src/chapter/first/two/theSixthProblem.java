/**
 * Marius are b bomboane şi c caramele pe care doreşte să le împartă cu Simona, sora lui mai mică.
 * El îi va da surorii lui un număr de bomboane (şi acelaşi număr de caramele) egal cu numărul care
 * divide atât numărul b cât şi pe c. Sora lui Marius ar dori să mănânce cât mai multe dulciuri.
 * Scrieţi un program care preia de la tastatură numerele b şi c şi afişează câte bomboane
 * (şi câte caramele) primeşte Simona.
 */

package chapter.first.two;
import java.util.Scanner;

public class theSixthProblem {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of candy");
        double candy = keyboard.nextDouble();

        // toffee
        System.out.println("Now enter the number of toffe.");
        double toffee = keyboard.nextDouble();

        //variables used only in the program creation

        int counting = 0;
        int counting2 = 0;


        while (counting < Math.max( candy, toffee)){
            counting = counting + 1;
            counting2 = counting2 + 1;

          //  System.out.println(counting);
            if(candy / counting == Math.floor(candy / counting) && toffee / counting2 == Math.floor(toffee / counting2)){
             System.out.println(Math.max(counting, counting2));
            }
        }
    }
}