package challenges;


public class NumberToWords {


    public static void main(String[] args) {

        // CHALLENGE TEST CASES:
            // getDigitCount(number) CHALLENGE TEST CASES:
        System.out.println(getDigitCount(0));       // should return 1
        System.out.println(getDigitCount(123));     // should return 3
        System.out.println(getDigitCount(-12));     // should return -1 (number < 0)
        System.out.println(getDigitCount(5200));    // should return 4

        System.out.println();    // Spacer

            // reverse(number) CHALLENGE TEST CASES:
        System.out.println(reverse(-121));    // should return -121
        System.out.println(reverse(1212));    // should return 2121
        System.out.println(reverse(1234));    // should return 4321
        System.out.println(reverse(100));     // should return 1

        System.out.println();    // Spacer

            // numberToWords(number) CHALLENGE TEST CASES:
        numberToWords(123);     // should print "One Two Three"
        numberToWords(1010);    // should print "One Zero One Zero"
        numberToWords(1000);    // should print "One Zero Zero Zero"
        numberToWords(-12);     // should print "Invalid Value" (number < 0)
    }


    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
        }

        int numberReversed = reverse(number);
        System.out.println("numberReversed = " + numberReversed);
        int digit;

        while(getDigitCount(numberReversed) < getDigitCount(number)){
            numberReversed *= 10;
        }

        while(numberReversed > 0){
            digit = numberReversed % 10;

            switch(digit){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                default:
                    System.out.print("Nine ");
                    break;
            }

            numberReversed /= 10;
        }

        System.out.print("\n");
    }


    public static int reverse(int number){

        int reversedNum = 0;
        int originalNum = number;

        if(number < 0){
            number *= -1;
        }

        while(number > 0){
            reversedNum *= 10;
            reversedNum += number % 10;
            number /= 10;
        }

        if(originalNum < 0){
            reversedNum *= -1;
        }

        return reversedNum;
    }


    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }else if(number == 0){
            return 1;
        }

        int digitCount = 0;

        while(number > 0){
            digitCount++;
            number /= 10;
        }

        return digitCount;
    }
}
