package  chapter.first.two;

public class Problema1 {
    public static final int numar = 123456789;
    public int calculeaza (int numar) {
        int contor = 0;
        while (numar != 0){
            System.out.println("numarul este " + numar);
            int ultimaCifra = numar % 10;
            numar = numar / 10;
            if (ultimaCifra == 7 ){
                contor = contor + 1;
            }
        }
        return contor;
    }

    public static void main (String args []) {

        Problema1 problema1 = new Problema1();
        int deCateOriApareNumarul7 = problema1.calculeaza(numar);
        System.out.println("Cifra sapte apare de " + problema1.calculeaza(numar) + " ori");
    }
}
