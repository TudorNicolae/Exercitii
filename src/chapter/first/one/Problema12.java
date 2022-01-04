package Capitolul1;

public class Problema12 {
    public static void main(String args []){
        //aici se introduce varsta lui Florin
        int zi1 = 10;
        int luna1 = 12;
        int an1 = 2020;

        //aici se introduce varsta lui Mihai
        int zi2 = 10;
        int luna2 = 11;
        int an2 = 2020;

        if(an1 < an2){
            System.out.println("Florin este mai mare.");
        }else{
            if(an2 < an1){
                System.out.println("Miahi este mai mare.");
            }else{
                if(an1 == an2){
                    if(luna1 < luna2){
                        System.out.println("Florin este mai mare.");
                    }else{
                        if(luna2 < luna1 ){
                            System.out.println("Mihai este mai mare.");
                        }else{
                            if(luna1 == luna2){
                                if(zi1 < zi2){
                                    System.out.println("Florin este mai mare.");
                                }else{
                                    if(zi2 < zi1){
                                        System.out.println("Mihai este mai mare.");
                                    }else{
                                        if(zi1 == zi2){
                                            System.out.println("Amandoi copii sunt la fel de mari.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
