import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {       //Student class
    String firstName;
    double score;
    double age;

    public Student(String firstName, double score, double age) {
        this.firstName = firstName;
        this.score = score;
        this.age = age;
    }
}
class FirstNameComparator implements Comparator<Student>{
    //invoking compare method of Comparator interface to compare names,which will invoke if scores are same
    @Override
    public int compare(Student s1, Student s2) {
        return s1.firstName.compareTo(s2.firstName);
    }
}
class ScoreComparator implements Comparator<Student>{
    //comparing scores
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.score==s2.score)
            return new FirstNameComparator().compare(s1,s2);
        else
            return (int)(s1.score-s2.score);
    }
}

public class Ques5 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sherlock", 89.9, 42));
        studentList.add(new Student("John", 78.8, 44));
        studentList.add(new Student("Mary", 86.5, 39));
        studentList.add(new Student("Molly", 89.9, 40));
        Collections.sort(studentList, new ScoreComparator());

        for (Student s : studentList)
            System.out.println(s.firstName + " is " + s.age + " and has scored " + s.score);
    }
}
