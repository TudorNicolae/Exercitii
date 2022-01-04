package Capitolul1;

public class Problema17 {
    static void main(String args[]){
        double pretulUneiReviste = 5;
        double pretulUnuiKgDeBiscuiti = 20;
        double baniiAnei = 20 ;
        if(2 * pretulUneiReviste + pretulUnuiKgDeBiscuiti == baniiAnei ){
            System.out.println("Ana are destui bani pentru a cumpara biscuitii si cele doua reviste ");
        }else{
            if(2 * pretulUneiReviste + pretulUnuiKgDeBiscuiti < baniiAnei){
                System.out.println("Ana are destui bani pentru a cumpara biscuitii si cele doua reviste ");
            }else{
                System.out.println("Din pacate Ana nu are destui bani pentru a cumpara cele doua reviste si un kg de biscuiti ");
            }
        }
    }
}
