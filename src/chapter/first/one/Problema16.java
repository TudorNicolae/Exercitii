package Capitolul1;

public class Problema16 {
    public static void main(String args []){
        double nrDeReviste = 30;
        double nrDePrietene = 15;
        double revisteCareVorRamane = nrDeReviste - nrDePrietene;
        if(nrDeReviste > nrDePrietene){
            System.out.println("Fiecare dintre prietenele Anei va primi cate o revista, ramanand " + revisteCareVorRamane +" reviste");
        }else{
            if(nrDeReviste == nrDePrietene){
                System.out.println("Fiecare dintre prietenele anei va primi cate o revista, nemairamanand nici una. ");
                if(nrDeReviste < nrDePrietene){
                    System.out.println("Din pacate nu sunt indeajuns de multe reviste ca sa le ajunga tuturor.");
                }
            }
        }
    }
}
