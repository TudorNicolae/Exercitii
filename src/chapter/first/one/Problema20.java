package Capitolul1;

public class Problema20 {
    public static void main(String args []){
        int  a = 1234;
        int primaSansa = 123;
        int aDouaSansa = 23;
        int aTreiaSansa = 3000;
        if(primaSansa == a){
            System.out.println("Baiatul a ghicit din prima, deci primeste 300 de puncte.");
        }else{
            if(aDouaSansa == a){
                System.out.println("Baiatul a ghicit din a doua sansa, deci primeste 200 de puncte.");
            }else{
                if(aTreiaSansa == a ){
                    System.out.println("Baiatul a ghicit din a treia sansa , deci primeste 100 de puncte.");
                }else{
                    System.out.println("Din pacate baiatul nu a ghicit numarul paginii, deci nu primeste nici un punct.");
                }
            }
        }
    }
}
