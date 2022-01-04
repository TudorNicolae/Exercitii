package Capitolul1;

public class Problema15 {
    public static void main(String args[]){
        double mere = 9;
        double frati = 3;
        if(Math.floor(mere / frati) == mere / frati){
            System.out.println("Merele se pot imparti in mod egal fratilor Anei, revenindu-i fiecaruia cate " + mere / frati + " mere.");
        }else{
            System.out.println("Din pacate, merele nu se pot imparti in mod egal copiilor.");
        }
    }
}
