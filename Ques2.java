import java.util.*;
public class Ques2 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        str=str.toLowerCase();       //converting string to lower case
        char temp=0;
        char[] chars=str.toCharArray();   //converting string to character arrray
        for(int i=0;i<chars.length;i++)
        {
            for(int j=0;j<chars.length;j++){
                if(chars[j]>chars[i])   //applying sort
                {
                    temp=chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                }
            }
        }
        for(int i=0;i<chars.length;i++)
            System.out.println(chars[i]);
    }
}
