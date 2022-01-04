package  chapter.first.two;

public class theSecondProblem {
    public static void main(String args[]){
        Problema1 problema1 = new Problema1();
        int deCateOriApareSapte = problema1.calculeaza(Problema1.numar);
        if(Problema1.numar % deCateOriApareSapte == 0){
            System.out.println("Numarul se divide");
        }else{
            System.out.println("Numarul nu se divide.");
        }
    }
}
