import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ques1 {
    public static void main(String [] args){
        float sum=0.0f;
        List<Float> list=new ArrayList<>();  //making an arrayList
        list.add(3.21f);           //Adding values
        list.add(45.3f);
        list.add(32.7f);
        list.add(4.7f);
        list.add(5.3f);
        Iterator<Float> floatListIter= list.iterator();
        while(floatListIter.hasNext()){      //Finding sum
            sum=sum+(float)floatListIter.next();
        }
        System.out.println("Sum of the elements is: "+sum);
    }
}
