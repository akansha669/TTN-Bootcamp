import java.util.HashSet;
import java.util.Set;

public class Ques2 {
    int UniqueChar(String str){    //Function to find unique characters
        int UniqueCharNum;
        char [] array=str.toLowerCase().toCharArray();   //converting the string to lower case then in character array
        Set<Character> setOfUniqueChar=new HashSet<>();  //defining hashset as it stores only unique characters
        for(char c:array){
            setOfUniqueChar.add(c);
        }
        UniqueCharNum=setOfUniqueChar.size();          //returning the size of the set
        return UniqueCharNum;
    }
    public static void main(String []args){
        Ques2 obj=new Ques2();
        String [] mystring={"Akansha","Singh","At","ToTheNew","From","Bvicam"};
        for(String s:mystring){
            System.out.println("Number of unique characters in " + s + ": "
                    + obj.UniqueChar(s));
        }
    }
}
