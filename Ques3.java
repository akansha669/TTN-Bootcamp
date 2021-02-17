import java.util.*;

public class Ques3 {
    void characterOccurence(String mystring){
        char [] strArray=mystring.toLowerCase().toCharArray();//converting the string to character array
         List<Character> charList=new ArrayList<>();
         for(char c:strArray)   //Adding the aray elements to list
             charList.add(c);
        Map<Character,Integer> NumberOfChar=new LinkedHashMap<>();
        //this will be used to make key-value pair so that we can keep count of each char respect to their value
        for(Character c:charList){
            NumberOfChar.put(c,Collections.frequency(charList,c));
            //'c' objects frequency will be determined in 'charList'
        }
        for(Map.Entry m:NumberOfChar.entrySet()){
            //getKey() will get the character and getValue will get its count
            System.out.println(m.getKey()+" Occurs "+m.getValue() +" times ");
        }
    }
    public static void main(String []args){
        Ques3 obj=new Ques3();
        String mystring="Collections Framework Session";
        obj.characterOccurence(mystring);
    }
}
