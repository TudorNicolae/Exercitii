package Capitolul1;

public class Problema3 {
    public static void main(String args []){
        int zi = 23;
        //luna 1 = ianuarie, luna 2 = Februarie, etc
        int luna = 6;
        //de aici incepe sectiunea de iarna
        if(luna == 12 && zi < 22){
            System.out.println("este iarna.");
        }
        if(luna == 1){
            System.out.println("este iarna.");
        }
        if(luna == 2 ){
            System.out.println("este iarna.");
        }
        if(luna == 3 && zi < 20) {
            System.out.println("este iarna.");
        }
        //de aici incepe sectiunea de primavara
        if(luna == 3 && zi > 20){
            System.out.println("este primavara.");
        }
        if(luna == 4){
            System.out.println("este primavara.");
        }
        if(luna == 5 ){
            System.out.println("este primavara.");
        }
        if(luna == 6 && zi < 20){
            System.out.println("este primavara.");
        }
        //de aici incepe sectiunea de vara
        if(luna == 6 && zi > 20){
            System.out.println("este vara.");
        }
        if(luna == 7){
            System.out.println("este vara.");
        }
        if(luna == 8){
            System.out.println("este vara.");
        }
        if(luna == 9 && zi < 23){
            System.out.println("este vara.");
        }
        //de aici incepe sectiunea de toamna
        if(luna == 9 && zi > 23){
            System.out.println("este toamna.");
        }
        if(luna == 10){
            System.out.println("este toamna.");
        }
        if(luna == 11){
            System.out.println("este toamna.");
        }
        if(luna == 12 && zi < 22){
            System.out.println("este toamna.");
        }
    }
}
