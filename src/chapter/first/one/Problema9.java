package Capitolul1;

public class Problema9 {
    public static void main(String args[]){
        double greutatea1 = 10;
        double greutatea2 = 10;
        double greutatea3 = 20;
        double celMaiGreuCopil = (Math.max(greutatea1 , Math.max(greutatea2,greutatea3 )));
        double sumaGreutatilorCelorlaltiDoiCopii = (greutatea1 + greutatea2 + greutatea3) - celMaiGreuCopil;
        if(sumaGreutatilorCelorlaltiDoiCopii == celMaiGreuCopil){
            System.out.println("Daca cel mai greu dintre copii se pune pe o parte si ceilalti pe cealalta, se poate egala.");
        }else{
            System.out.println("Nu se poate egala leaganul.");
        }
    }
}
