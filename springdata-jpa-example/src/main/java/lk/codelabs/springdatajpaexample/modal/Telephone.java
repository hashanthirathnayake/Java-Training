package lk.codelabs.springdatajpaexample.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Telephone {

     @Id //@Column(name="telephoneId")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tid;
     //@Column(name="telephoneNo")

    String tNo;

    @ManyToOne  //@Column(name="studentId")
    @JsonIgnore
    Student student;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getNo() {
        return tNo;
    }

    public void setNo(String tNo) {
        this.tNo = tNo;
    }

//    public Student getStudent() {
//        return student;
//    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
