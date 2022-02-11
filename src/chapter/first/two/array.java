package chapter.first.two;

public class array {
    public static void main(String args[]){
        int i[] = new int[5];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        i[4] = 5;


        for (int j = 0; j < i.length; j++ ){
            System.out.println(i[j]);
        }
    }
}