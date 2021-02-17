/*.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String*/
public class Ques10 {
    int add(int numberOne, int numberTwo) {   //adding two integers
        return numberOne + numberTwo;
    }

    double add(double doubleOne, double doubleTwo) {   //adding two double values
        return doubleOne + doubleTwo;
    }

    int multiply(int numberOne, int numberTwo) {    //multiplying two integer values
        return numberOne * numberTwo;
    }

    double multiply(double numberOne, double numberTwo) {   //multiplying two double values
        return numberOne * numberTwo;
    }

    String concatStrings(String stringOne, String stringTwo) {  //Concating two strings
        return (stringOne + " " + stringTwo);
    }

    String concatStrings(String stringOne, String stringTwo, String stringThree) {  //concating three strings
        return (stringOne + " " + stringTwo + " " + stringThree);
    }

    public static void main(String[] args) {
        Ques10 example = new Ques10();
        System.out.println("Adding two integers: " + example.add(6, 2));
        System.out.println("Adding two doubles: " + example.add(6.6, 2.2));
        System.out.println("Multiplying two integers: " + example.multiply(6, 2));
        System.out.println("Multiplying two doubles: " + example.multiply(6.6, 2.2));
        System.out.println("Concatenating two strings: " + example.concatStrings("Hello", "world"));
        System.out.println("Concatenating three strings: " + example.concatStrings("Hello", "there", "world"));

    }
}
