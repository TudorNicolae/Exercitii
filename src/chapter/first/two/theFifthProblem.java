package  chapter.first.two;
/**
 * Se citesc printr-un program numere de la tastatură până la citirea valorii O.
 * Se cere calcularea şi afişarea mediei aritmetice a pătratelor numerelor pozitive citite.
 */
import java.util.Scanner;

public class theFifthProblem {


        public static void main(String args[]){

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter any number or digit to begin.");

            double number = keyboard.nextDouble();

            System.out.println("You started.");

            double arithmeticMean = 0;
            int contor = 0;
            while(number != 0){
                number = keyboard.nextDouble();

                if(number > 0) {
                    contor = contor + 1;
                    number = number * number;
                    arithmeticMean = (arithmeticMean + number) / contor;

                }
            }
        System.out.println(arithmeticMean);
    }
}
