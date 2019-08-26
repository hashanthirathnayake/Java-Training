import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.List;

public class SortByComparator {

    public static void main(String[] args){
    List<Student> students = Student.getStudents();

    Collections.sort(students,new StudentRanker());

    System.out.println(students);
    }

}
