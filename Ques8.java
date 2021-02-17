//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
public class Ques8 {
    public static void main(String[] args) {
        String myString = "Strings are fun"; //Entered string
        System.out.println("Original String: " + myString);
        char[] charFromString = myString.toCharArray(); //converting string to character array
        StringBuffer myStringBuffer = new StringBuffer();  //object of stringbuffer
        for (int i = charFromString.length - 1; i >= 0; i--) {
            myStringBuffer.append(charFromString[i]);
        }
        System.out.println("Reversed StringBuffer object: " + myStringBuffer);
        myStringBuffer.delete(4, 10);
        System.out.println("Modified StringBuffer object: " + myStringBuffer);
    }
}
