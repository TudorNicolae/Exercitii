package Capitolul1;

public class Problema1 {

        public static void main(String args []){
            int a = 98;
            int b = 21;
            int c = 99;
            if(a > b && a > c && c < b){
                int d = a - c;
                System.out.println(String.format("Cea mai mare diferenta dintre numerele date este de %d ", d ));
            }
            if(a > b && a > c && b < c ){
                int d = a - c;
                System.out.println(String.format("Cea mai mare diferenta dintre numerele date este de %d ", d ));
            }
            if(b > a && b >c && c < a){
                int d = b - c;
                System.out.println(String.format("Cea mai mare diferenta dintre numerele date este de %d ", d ));
            }
            if(b > a && b > c && a < c){
                int d = b - a;
                System.out.println(String.format("Cea mai mare diferenta dintre numerele date este de %d ", d ));
            }
            if (c > a && c > b && a < b ) {
                int d = c - a;
                System.out.println(String.format("Cea mai mare diferenta dintre numerele date este de %d ", d ));
            }
            if (c > a && c > b && b < a){
                int d = c - b;
                System.out.println(String.format("Cea mai mare diferenta dintre numerele date este de %d ", d ));
        }
    }
}
