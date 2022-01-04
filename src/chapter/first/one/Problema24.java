package Capitolul1;

public class Problema24 {
    public static void main(String args []){
        int Anca = 53;
        int Claudia = 3;
        int Bunica = 24;
        double CeaMaiHarnica = Math.max(Anca , Math.max(Claudia , Bunica));
        double CeaMaiPutinHarnica = Math.min(Anca , Math.min(Claudia , Bunica));
        double CeaCareAMuncitMediu = (Anca + Claudia + Bunica) - (CeaMaiHarnica + CeaMaiPutinHarnica);

        //Situatia Anca pe locul unu

        if(CeaMaiHarnica == Anca && CeaCareAMuncitMediu == Claudia && CeaMaiPutinHarnica == Bunica){
            System.out.println("Anca a muncit cel mai mult, deci ea va primi trei caramele.");
            System.out.println("Claudia a fost pe locul doi la harnicie, deci va primi doua Caramele");
            System.out.println("Bunica a fost cea mai putin harnica, deci ea este cea care va primi o singura caramea.");
        }else{
            if(CeaMaiHarnica == Anca && CeaCareAMuncitMediu == Bunica && CeaMaiPutinHarnica == Claudia) {
                System.out.println("Anca a muncit cel mai mult, deci ea va primi trei caramele.");
                System.out.println("Bunica a fost pe locul doi la harnicie, deci va primi doua Caramele");
                System.out.println("Anca a fost cea mai putin harnica, deci ea este cea care va primi o singura caramea.");

                //Situatia Claudia pe locul unu

            }else{
                if(CeaMaiHarnica == Claudia && CeaCareAMuncitMediu == Anca && CeaMaiPutinHarnica == Bunica) {
                    System.out.println("Claudia a muncit cel mai mult, deci ea va primi trei caramele.");
                    System.out.println("Anca fost pe locul doi la harnicie, deci va primi doua Caramele");
                    System.out.println("Bunica a fost cea mai putin harnica, deci ea este cea care va primi o singura caramea.");
                }else{
                    if(CeaMaiHarnica == Claudia && CeaCareAMuncitMediu == Bunica && CeaMaiPutinHarnica == Anca) {
                        System.out.println("Claudia a muncit cel mai mult, deci ea va primi trei caramele.");
                        System.out.println("Bunica fost pe locul doi la harnicie, deci va primi doua Caramele");
                        System.out.println("Anca a fost cea mai putin harnica, deci ea este cea care va primi o singura caramea.");

                        //Situatia Bunica pe locul unu

                    }else{
                        if(CeaMaiHarnica == Bunica && CeaCareAMuncitMediu == Anca && CeaMaiPutinHarnica == Claudia) {
                            System.out.println("Bunica a muncit cel mai mult, deci ea va primi trei caramele.");
                            System.out.println("Anca fost pe locul doi la harnicie, deci va primi doua Caramele");
                            System.out.println("Claudia a fost cea mai putin harnica, deci ea este cea care va primi o singura caramea.");
                        }else{
                            if(CeaMaiHarnica == Bunica && CeaCareAMuncitMediu == Claudia && CeaMaiPutinHarnica == Anca) {
                                System.out.println("Claudia a muncit cel mai mult, deci ea va primi trei caramele.");
                                System.out.println("Anca fost pe locul doi la harnicie, deci va primi doua Caramele");
                                System.out.println("Bunica a fost cea mai putin harnica, deci ea este cea care va primi o singura caramea.");
                            }
                        }
                    }
                }
            }
        }
    }
}
