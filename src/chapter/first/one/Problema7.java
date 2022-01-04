package Capitolul1;

public class Problema7 {
    public static void main(String args []){
        int participant1 = 1;
        int participant2 = 2;
        int participant3 = 3;
        int thelargestnumber = Math.max(participant1 , Math.max(participant2 , participant3));
        int thesmallestnumber = Math.min(participant1 , Math.min(participant2 , participant3));
        //primul participant
        if(thesmallestnumber == participant1){
            System.out.println("participant 1");
        }
        if(thesmallestnumber == participant2){
            System.out.println("participajnt 2");
        }
        if(thesmallestnumber == participant3){
            System.out.println("participajnt 3");
        }
        //al doilea partcipant care intra la examen
        if(participant1 < thelargestnumber && participant1 > thesmallestnumber){
            System.out.println("participant 1");
        }
        if(participant2 < thelargestnumber && participant2 > thesmallestnumber){
            System.out.println("participant 2");
        }
        if(participant3 < thelargestnumber && participant3 > thesmallestnumber){
            System.out.println("participant 3");
        }
        //al treilea participant
        if(thelargestnumber == participant1){
            System.out.println("participant 1");
        }
        if(thelargestnumber == participant2){
            System.out.println("participajnt 2");
        }
        if(thelargestnumber == participant3){
            System.out.println("participajnt 3");
        }
    }
}