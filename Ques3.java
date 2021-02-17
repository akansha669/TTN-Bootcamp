//Write a program to find the number of occurrences of a character in a string without using loop?
import java.util.*;
public class Ques3 {

    static void countEachChar(String str,String s)
    {

        int count = str.length() - str.replace(s, "").length();
        System.out.println("Number of occurances of the character " + s + " in "+str+" = "+count);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string and the character's count you want");
        String string = sc.nextLine();
        String s=sc.nextLine();
        countEachChar(string,s);
    }
}
