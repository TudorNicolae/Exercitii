package chapter.first.two;
/**
 * Se citesc numere naturale până la introducerea numărului O. Să se scrie un program care să numere câte
 * dintre ele sunt formate din exact două cifre şi aceste cifre sunt identice. Să se afişeze această valoare.
 */
import java.util.Scanner;

public class TheThirdProblem {
        public static void main(String args []){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduceti orice numar pentru a incepe.");
            int contor = 0;
            int numarul = keyboard.nextInt();
            while (numarul != 0){
                numarul = keyboard.nextInt();
                int ultimaCifra = numarul % 10;
                int NFaraUltimaCifra= numarul / 10;
                if(numarul >= 10 && numarul < 100){
                    if(ultimaCifra == NFaraUltimaCifra){
                        contor = contor + 1;
                    }
                }
            }
        System.out.println("Aveti " + contor + " numere de doua cifre care au cifrele egale.");
    }

    public boolean checkIdenticDigits(int number) {
            return true;
    }
}
