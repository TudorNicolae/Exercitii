package Capitolul1;

public class Problema22 {
    public static void main(String args []){
        //Aveti de ales intre 120 de cm si 140 de cm
        int latimeaSacoului = 140;
        int lungimeaSacoului = 130;
        int cantitateaDeMaterial = 5111;
        if(latimeaSacoului == 120){
            double cantiateaDeMaterial2 = lungimeaSacoului * 2;
            System.out.println("Cantitatea necesara de material pentru a confectiona un sacou este de " + cantiateaDeMaterial2+ " cm." );
            if(cantitateaDeMaterial / cantiateaDeMaterial2 == Math.floor(cantitateaDeMaterial / cantiateaDeMaterial2)){
                System.out.println("Din materialul pus la dispozitie se pot confectiona "+ cantitateaDeMaterial / cantiateaDeMaterial2 +" sacouri.");
            }else{
                if(cantitateaDeMaterial / cantiateaDeMaterial2 != Math.floor(cantitateaDeMaterial / cantiateaDeMaterial2)){
                    double a = cantitateaDeMaterial / cantiateaDeMaterial2 - Math.floor(cantitateaDeMaterial / cantiateaDeMaterial2);
                    System.out.println("Din materialul pus la dispozitie se pot confectiona "+ Math.floor(cantitateaDeMaterial / cantiateaDeMaterial2) + " sacouri, ramanand inca "+ a + " cm de material.");
                }
            }
        }
        if(latimeaSacoului == 140){
            double cantiateaDeMaterial3 = lungimeaSacoului + 80;
            System.out.println("Cantitatea necesara de material pentru a confectiona un sacou este de " + cantiateaDeMaterial3+ " cm." );
            if(cantitateaDeMaterial / cantiateaDeMaterial3 == Math.floor(cantitateaDeMaterial / cantiateaDeMaterial3)){
                System.out.println("Din materialul pus la dispozitie se pot confectiona "+ cantitateaDeMaterial / cantiateaDeMaterial3 +" sacouri.");
            }else{
                if(cantitateaDeMaterial / cantiateaDeMaterial3 != Math.floor(cantitateaDeMaterial / cantiateaDeMaterial3)){
                    double a = cantitateaDeMaterial / cantiateaDeMaterial3 - Math.floor(cantitateaDeMaterial / cantiateaDeMaterial3);
                    System.out.println("Din materialul pus la dispozitie se pot confectiona "+ Math.floor(cantitateaDeMaterial / cantiateaDeMaterial3) + " sacouri, ramanand inca "+ a + " cm de material.");
                }
            }
        }
    }
}
