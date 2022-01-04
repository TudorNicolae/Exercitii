package Capitolul1;

public class Problema4 {
    public static void main(String args[]) {
        int number = 36;
        //ultima cifra din numar
        int lastDigitFromNumber = number % 10;
        //a doua cifra din numar
        int c = number / 10;
        int secondDigitFromNumber = c % 10;
        //prima cifra din numar
        int firstDigitFromNumber = number / 100;

        if (number < 100){
            int theSmallestNumber = Math.min(lastDigitFromNumber , c);
            int theLargestestnumber = Math.max(lastDigitFromNumber , c );
            System.out.println(theSmallestNumber);
            System.out.println(theLargestestnumber);
        }

        if(number > 99 && number < 1000 ) {

            int theLargestestnumber = Math.max(lastDigitFromNumber, Math.max(secondDigitFromNumber, firstDigitFromNumber));
            //cel mai mic numar
            int theSmallestNumber = Math.min(lastDigitFromNumber, Math.min(secondDigitFromNumber,firstDigitFromNumber));

            System.out.println(theSmallestNumber);
            if (lastDigitFromNumber < theLargestestnumber && lastDigitFromNumber > theSmallestNumber) {
                System.out.println(lastDigitFromNumber);
            }
            if (secondDigitFromNumber < theLargestestnumber && secondDigitFromNumber > theSmallestNumber) {
                System.out.println(secondDigitFromNumber);
            }
            if (firstDigitFromNumber < theLargestestnumber && firstDigitFromNumber > theSmallestNumber) {
                System.out.println(firstDigitFromNumber);
            }
            System.out.println(theLargestestnumber);
        }
    }
}
