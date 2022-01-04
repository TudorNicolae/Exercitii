package Capitolul1;

public class Problema14 {
    public static void main(String args[]){
        //datele primei persoane
        double varsta1 = 20;
        double timpulpConferintei1 = 13;

        //datele celei de a doua persoana
        double varsta2 = 34;
        double timpulpConferintei2 = 52;

        //datele celei de a treia persoana
        double varsta3 = 32;
        double timpulpConferintei3 = 21;

        double ceaMaiBatranaPersoana = Math.max(varsta1 , Math.max(varsta2 , varsta3 ));

        if(ceaMaiBatranaPersoana == varsta1){
            System.out.println("cele mai tinere persoane sunt a doua si a treia");
        }else {
            if (ceaMaiBatranaPersoana == varsta2) {
                System.out.println("cele mai tinere persoane sunt prima si a treia");
            }else{
                if(ceaMaiBatranaPersoana == varsta3){
                    System.out.println("cele mai tinere persoane sunt prima si a doua");
                }
            }
        }
        double ceaMaiMareDurataAUnuiDiscurs = Math.max(timpulpConferintei1 , Math.max( timpulpConferintei2, timpulpConferintei3 ));

        if( ceaMaiMareDurataAUnuiDiscurs == timpulpConferintei1){
            System.out.println("cele mai scurte discursuri apartin celei de a doua si celei de a treia persoana ");
        }else {
            if ( ceaMaiMareDurataAUnuiDiscurs == timpulpConferintei2) {
                System.out.println("cele mai scurte discursuri apartin primei si celei de a treia persoana ");
            }else{
                if(ceaMaiMareDurataAUnuiDiscurs == timpulpConferintei3){
                    System.out.println("cele mai scurte discursuri apartin primei si celei de a doua persoana ");
                }
            }
        }
    }
}
