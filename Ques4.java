class Singleton{          //Singleton class
    private static Singleton singleInstance=null;        //static member-instane of this class
    String testString;
    private Singleton(){                                 //private constructor
        testString="I am Singleton class";
    }
    static Singleton getInstance(){                        //Lazy Instantiation
        if(singleInstance==null)
            singleInstance=new Singleton();
        return singleInstance;
    }
}
public class Ques4 {
    public static void main(String [] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println("From s1: " + s1.testString);
        System.out.println("From s2: " + s2.testString);
        s1.testString=s1.testString.toUpperCase();
        System.out.println("From s1: " + s1.testString);
        System.out.println("From s2: " + s2.testString);
    }
}
