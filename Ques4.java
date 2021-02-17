//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
import java.text.DecimalFormat;
import java.util.*;
public class Ques4 {
    static void Percentage(String str) {
        int size = str.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < str.length(); i++) {//total count for uppercase letters
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {//total count for lower case letters
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {//total count for digits
                digits++;
            }
            else {
                others++;//total count for other symbols
            }
        }

        double upper = (upperCase * 100) / size;
        double lower = (lowerCase * 100) / size;
        double digitsper = (digits * 100) / size;
        double otherper = (others * 100) / size;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In '" + str + "' : ");
        System.out.println("Uppercase letters are: " + upperCase + " with percentage: " + format.format(upper) + "% ");
        System.out.println("Lowercase letters are: " + lowerCase+" with percentage: "+  format.format(lower) + "%");
        System.out.println("Digits are: " + digits+" with percentage: " +format.format(digitsper) + "%");
        System.out.println("Other Characters Are: " + others + "with percentage: " + format.format(otherper) + "%");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String string = sc.nextLine();
        Percentage(string);
    }
}
