public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int a) {
        if (a>=90) {
            return 'A';
        }
        else if (80<=a) {
            return 'B';
        }
        else if (70<=a) {
            return 'C';
        }
        else if (60<=a) {
            return 'D';
        }
        else if (50<=a) {
            return 'E';
        }
        else {
            return 'F';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int a) {
        int mod3 = a%3;
        int mod5 = a%5;
        if ((mod3==0) && (mod5==0)) {
            return "fizzbuzz";
        }
        else if (mod3==0) {
            return "fizz";
        }
        else if (mod5==0) {
            return "buzz";
        }
        else {
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String input) {
        if (input.length()<2) {
            return input;
        }
        else {
            return input.substring(0,2) + input + input.substring(0,2);
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        if ((a + b) == c) {
            return true;
        }
        else if ((a+c) == b) {
            return true;
        }
        else if ((b+c)==a) {
            return true;
        }
        else {
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp(String input) {
        if (input.length()<3) {
            return input.toUpperCase();
        }
        else {
            String end = input.substring(input.length()-3);
            String front = input.substring(0,input.length()-3);
            return front+end.toUpperCase();
        }
    }

}