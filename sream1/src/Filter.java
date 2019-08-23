
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args){

        System.out.println("1) Print students with short names\n");
        printStudentWithShortNames();
        System.out.println("\n2)Filter with stream\n");
        filterWithStream();
        System.out.println("\n3)Process with 'Dr'\n");
        processWithStream();
        System.out.println("\n4)Student count-");
        countWithStream();
        System.out.println("\n5)Maximum Student's Id");
        maximumWithStream();
        System.out.println("\n6)Minimum Student's Id");
        minimumWithStream();
    }

//ok
        static void filterWithStream(){

        List<Student> students = Student.getStudents()
                .stream().filter(s -> s.getName().length() <= 6)
                .collect(Collectors.toList());
       System.out.println(students);
    }
//ok
         static void countWithStream(){
          long students= Student.getStudents().stream().count();
        System.out.println(students);
    }
//ok
    static  void maximumWithStream(){

  Student maxId= Student.getStudents().stream().max(Comparator.comparing(s ->s.getId())).get();
        System.out.println(maxId.getId());
    }

//ok
    static void minimumWithStream(){

       // System.out.println("Minimum Student id"+Student.getStudents().stream().min(Comparator.comparing(student -> student.getId())));
        Student minId= Student.getStudents().stream().min(Comparator.comparing(s->s.getId())).get();
        System.out.println(minId.getId());
    }


    static void processWithStream(){

        //without for each keyword

        List<Student> students = Student.getStudents()
                       .stream().map(s->new Student("Dr"+s.getName(),s.getId()))
                        .collect(Collectors.toList());
        System.out.println("\n"+students);


        //with for each keyword
//        Student.getStudents()
//                .stream().map(s -> new Student("Dr" +s.getName(),s.getId()))
//                .collect(Collectors.toList()).forEach(s -> System.out.println(s));


    }


    static void printStudentWithShortNames(){

        List<Student> students =Student.getStudents();
        for(Student student:students){
                if(student.getName().length()<=7){
                    System.out.println(student.getName());
                }
            }

    }
    }






