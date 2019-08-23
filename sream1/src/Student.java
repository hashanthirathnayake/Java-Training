import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
   private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String Name, int id){
        this.name = Name;
        this.id=id;
    }
    public static List<Student> getStudents(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Krish",1));
        students.add(new Student("Hasini",2));
        students.add(new Student("Bhagya",11));
        students.add(new Student("Suranga",12));
        students.add(new Student("Nuwan",21));
        students.add(new Student("Praveen",22));
        students.add(new Student("Shehanza",31));
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
