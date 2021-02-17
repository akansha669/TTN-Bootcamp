public class Ques7 {
    int inputSeconds;
    int days;
    int hours;
    int minutes;
    int seconds;
    Ques7(int sec){     //constructor to initialize value
        this.inputSeconds=sec;
    }
    void convert(){
        days=inputSeconds/86400;       //converting to days
        int remainingSeconds=inputSeconds % 86400;
        hours = remainingSeconds / 3600;      //converting to hours
        remainingSeconds = remainingSeconds % 3600;
        minutes = remainingSeconds / 60;     //converting to minutes
        remainingSeconds = remainingSeconds % 60;
        seconds = remainingSeconds;        //seconds
    }
    public static void main(String [] args){
        Ques7 obj=new Ques7(123456);
        obj.convert();
        System.out.println(obj.inputSeconds+ " has "+obj.days+" Days "+obj.hours+" hours "+obj.minutes+" minutes "+obj.seconds+" Seconds ");

    }
}
