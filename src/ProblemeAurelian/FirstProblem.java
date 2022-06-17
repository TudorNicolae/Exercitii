package ProblemeAurelian;

import java.util.Scanner;

public class FirstProblem {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        //Snail's speed;
        System.out.println("Enter the speed of the snail (km/week)");
        double snailsSpeed = keyboard.nextDouble();
        //road's lenght;
        System.out.println("Enter the lenght of the road (meters)");
        double roadsLenght = keyboard.nextDouble();

        double fromMToKm = roadsLenght / 1000;

        System.out.println((fromMToKm / snailsSpeed)* 168 );

    }
}