package lk.codelabs.springdatajpaexample.service;


import lk.codelabs.springdatajpaexample.modal.Student;
import lk.codelabs.springdatajpaexample.modal.Telephone;
import lk.codelabs.springdatajpaexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {


    @Autowired
    StudentRepository studentRepository;
    public Student save(Student student){

        for (Telephone tel: student.getTelephoneList()){
            tel.setStudent(student);
        }
        return studentRepository.save(student);
    }

    public List<Student> findAll(){

        return  studentRepository.findAll();
    }

    public Optional<Student> findOne(Integer id){
        return  studentRepository.findById(id);
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
