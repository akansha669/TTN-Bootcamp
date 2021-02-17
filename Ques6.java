import java.util.*;

class ElementFrequency{
    //using maps to store count of each element
    Map<Integer,Integer> elementFreq=new LinkedHashMap<>();
    void elementFrequency(List<Integer> integers){
        for(Integer i:integers)
            elementFreq.put(i, Collections.frequency(integers,i));
        Set<Map.Entry<Integer,Integer>> set=elementFreq.entrySet();
        //using entrySet() to get the entry's of the map
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        //making anonymous function to define compare method from Comparator interface and sorting the map
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for(Map.Entry entry: list){
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}
public class Ques6 {
    public static void main(String []args) {
        ElementFrequency eleF = new ElementFrequency();
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(5);
        integerList.add(9);
        integerList.add(7);
        integerList.add(8);
        integerList.add(10);
        integerList.add(9);
        eleF.elementFrequency(integerList);
    }
}
