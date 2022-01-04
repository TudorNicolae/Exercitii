package Capitolul1;

public class Problema2 {
    public static void main(String args []){
        int ora = 12;
        int minutul = 32;
        if(ora >= 24 &&  ora < 12 ){
            System.out.println("Ora introdusa se incadreaza in gruparea orelor antemeridiane.");
        }
        if(ora >= 12 && ora < 24){
            System.out.println("Ora introdusa se incadreaza in gruparea orelor postmeridiane. ");
        }
    }
}
