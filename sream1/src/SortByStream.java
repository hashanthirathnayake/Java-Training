import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStream {


    public static void  main(String[] args){

        byStream_comparator();
        byStream_decending();
        byComparing();

    }

    static void byStream_comparator(){
        List<Student> students= Student.getStudents().stream().
                sorted((s1,s2)->new Integer(s1.getId()).compareTo(s2.getId())).collect(Collectors.toList()) ;
        System.out.println(students);
    }
    static void byStream_decending(){
        List<Student> students= Student.getStudents().stream().
                sorted((s1,s2)->new Integer(-s1.getId()).compareTo(-s2.getId())).collect(Collectors.toList()) ;
        System.out.println(students);
    }
    static void byComparing(){

        List<Student> students = Student.getStudents().stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println(students);
    }
}
