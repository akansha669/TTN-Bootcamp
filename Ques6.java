public class Ques6 {
    int raiseException;
    void setRaiseException(int s){
        raiseException=s;
    }
    public static void main(String [] args){
        int array[]={1,2,3,4,5};
        String str=null;
        Ques6 block=new Ques6();
        block.setRaiseException(3);
        int a;
        try {
            if (block.raiseException == 1)          //Arithmatic Exception
                a = 5 / 0;
            if (block.raiseException == 2)          //Exception Caught
                str.toLowerCase();
            if (block.raiseException == 3)          //ArrayIndexoutofBoundsException
                System.out.println(array[10]);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught: " + ae);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException caught: " + npe);
        } catch (ArrayIndexOutOfBoundsException aioob) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + aioob);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {                       //this will definetly print
            System.out.println("I'm in finally block");
        }
    }
}
