package Capitolul1;

public class Problema11 {
    public static void main(String args []){
        //daca unghiul dumneavoastra este in grade scrieti mai jos numarul de grade, dar daca este in radiani scrieti o
        //si  daca este in radiani completati unde vedeti ca scrie "double radiani "
        double grade = 0;
        if (grade >= 1){
            if (grade > 0 && grade <=  90) {
                System.out.println("masura unghiului se incadreaza in primul cadran ");
            }
            if (grade > 90 && grade <= 180 ){
                System.out.println("masura unghiului se incadreaza in al doilea cadran ");
            }
            if (grade > 180 && grade <= 270 ){
                System.out.println("masura unghiului se incadreaza in al treilea cadran ");
            }
            if (grade > 270 && grade <= 360 ){
                System.out.println("masura unghiului se incadreaza in al patrulea cadran ");
            }
        }
        if (grade == 0 ){
            double radiani = 500;
            grade = radiani / 57.2958;
            if (grade > 0 && grade <=  90) {
                System.out.println("masura unghiului se incadreaza in primul cadran ");
            }
            if (grade > 90 && grade <= 180 ){
                System.out.println("masura unghiului se incadreaza in al doilea cadran ");
            }
            if (grade > 180 && grade <= 270 ){
                System.out.println("masura unghiului se incadreaza in al treilea cadran ");
            }
            if (grade > 270 && grade <= 360 ){
                System.out.println("masura unghiului se incadreaza in al patrulea cadran ");
            }
        }
    }
}
