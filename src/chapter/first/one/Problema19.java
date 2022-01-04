package Capitolul1;

public class Problema19 {
    public static void main(String args []){
        double nrDeRanduri = 2;
        int nrDePungute = 10;
        int grame = nrDePungute * 20;
        double lungimeaRandurilor = 10;
        double nrDeGramenecesarepentruFiecareMetru = 20;
        if(lungimeaRandurilor * nrDeRanduri == nrDeGramenecesarepentruFiecareMetru * grame ){
            System.out.println("Anei ii ajung semintele pentru a isi amenaja gradina. ");
        }else{
            if(lungimeaRandurilor * nrDeRanduri < nrDeGramenecesarepentruFiecareMetru * grame){
                System.out.println("Anei ii ajung semintele pentru a isi amenaja gradina. ");
            }else{
                System.out.println("Din pacate, Anei nu ii ajung semintele.");
            }
        }
    }
}
