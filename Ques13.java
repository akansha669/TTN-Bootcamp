class CustomException extends Exception{   //Custom Exception class
    String message;
    CustomException(String message){
        super(message);
    }
    public synchronized Throwable fillInStackTrace(){
        return this;
    }
}
public class Ques13 {
    public static void main(String [] args){
        try{
            throw new CustomException("This is Custom Exception");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Finally Block:It will be executed anyway");
        }
    }

}
