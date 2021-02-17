//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class Ques7 {
    static String firstName;  //static variable
    static String lastName;  //static variable
    static int age;     //static variable

    static {                  //static block
        System.out.println("Static block");
        firstName = "John";
        lastName = "Doe";
        age = 43;
    }

    static void getMyDetails() {         //static method
        System.out.println("Hi, I am " + firstName + " " + lastName + ". I am " + age + " years old.");
    }

    public static void main(String[] args) {
        new Ques7();
        Ques7.getMyDetails();
    }
}
