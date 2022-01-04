/**
 *Cu ocazia zilei de 1 Iunie doamna profesoară de informatică doreşte să dăruiască bomboane
 *  elevilor din clasa a IX-a (în care învaţă m elevi) sau celor din clasa a X-a
 *  (în care învaţă n elevi). Pentru că încă nu s-a hotărât căror elevi să le ducă bomboanele
 *  calculaţi şi afişaţi printr-un program care este numărul minim de bomboane pe care trebuie
 *  să le cumpere pentru ca să le poată împărţi exact elevilor din oricare din cele două clase.
 *  Programul va citi de la tastatură pentru fiecare clasă numărul de elevi.
 */

package chapter.first.two;

import java.util.Scanner;

public class theSeventhProblem {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        //the number of childrens from the 9th grade
        System.out.println("Enter the number of childrens from the 9th grade");
        int ninethGrade = keyboard.nextInt();

        //the number of childrens from the 10th grade
        System.out.println("Enter the number of childrens from the 10th grade");
        int teenthGrade = keyboard.nextInt();

        System.out.println("The teacher should buy at least " + Math.max(ninethGrade , teenthGrade) + " candy.");
    }
}