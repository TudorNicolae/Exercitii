package Capitolul1;

public class Problema8 {
        public static void main(String args []){
        int a = 10;
        int b = 23;
        int c = 24;
        int d = 13;
        int celMaiMareNumar = Math.max(a, Math.max(b, Math.max(c, d)));
        int celMaiMicNumar = Math.min(a, Math.min(b, Math.min(c, d)));
        System.out.println(String.format("Cea mai mare fractie care se poate forma este %d/%d",celMaiMareNumar, celMaiMicNumar));
    }
}
