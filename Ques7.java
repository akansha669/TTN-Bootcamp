import java.util.*;

public class Ques7 {
    int getMin(List<Integer> integers) {     //getMin() method to return minimum element
        Collections.sort(integers);
        return (integers.get(0));
    }
    public static void main(String []args){
        Ques7 obj=new Ques7();
        List<Integer> list=new LinkedList<>();
        ((LinkedList<Integer>) list).push(27);   //pushing elements
        ((LinkedList<Integer>) list).push(12);
        ((LinkedList<Integer>) list).push(54);
        ((LinkedList<Integer>) list).push(78);
        ((LinkedList<Integer>) list).push(90);
        ListIterator listIter=list.listIterator();
        System.out.println("Elements are: ");
        while(listIter.hasNext())       //printing all elements
            System.out.println(listIter.next() + " ");
        System.out.println("\nPopping elements from stack:");
        System.out.println(((LinkedList<Integer>) list).pop());
        System.out.println(((LinkedList<Integer>) list).pop());
        System.out.println("Is stack empty? " + list.isEmpty());  //checking if stack is empty
        System.out.println("Minimum element: " + obj.getMin(list));
        System.out.println("Final stack:");          //printing remaining stack
        listIter = list.listIterator(0);
        while (listIter.hasNext())
            System.out.print(listIter.next() + " ");
    }
}
