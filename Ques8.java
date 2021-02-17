import java.util.Scanner;
public class Ques8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Reading using while");
        System.out.println("Enter a word");
        String word = sc.next();
        while (!word.equals("done")) {   //using while to check
            if (word.charAt(0) == word.charAt(word.length() - 1)) {//checking for first and last character
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            System.out.println("\nEnter a word");
            word = sc.next();
        }
        System.out.println("\ndone is encountered\n");
        System.out.println("reading using do-while\n");
        System.out.println("Enter a word");
        word = sc.next();
        do {                 //using do while
            if (word.equals("done")) {   //if the word is done then will come out of loop
                continue;
            }

            if (word.charAt(0) == word.charAt(word.length() - 1)) {    //checking for first and last character
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            System.out.println("\nEnter a word");
            word = sc.next();
        } while (!word.equals("done"));

        System.out.println("\ndone is encountered\n");

    }
}
