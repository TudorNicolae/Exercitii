package Capitolul1;

public class Problema23 {
    public static void main(String args []){
        //Aici se introduce suma de bani
        double sumaDeBani = 30;
        //Aici se introduc preturile caietelor de romana si de matematica
        double caietulDeMate = 1;
        double caietulDeRomana = 1.3;
        if(caietulDeMate > caietulDeRomana){
            double caiete1 =  (sumaDeBani / caietulDeMate);
            double parteaIntreaga = Math.floor(caiete1);
            double rest = sumaDeBani - parteaIntreaga * caietulDeMate;
            System.out.println("Pentru a ramane cu un rest cat mai mic, va trebui sa se cumpere caiete de matematica, putandu-se cumpara un numar de "+ parteaIntreaga + " caiete, ramanandu-i " + rest + " lei.");
        }else{
            if(caietulDeRomana > caietulDeMate){
                double caiete =  (sumaDeBani / caietulDeRomana);
                double parteaIntreaga = Math.floor(caiete);
                double rest = sumaDeBani - parteaIntreaga * caietulDeRomana;
                System.out.println("Pentru a ramane cu un rest cat mai mic, va trebui sa se cumpere caiete de Romana, putandu-se cumpara un numar de "+ parteaIntreaga + " caiete, ramanandu-i " + rest + " lei.");
            }
        }
    }
}
