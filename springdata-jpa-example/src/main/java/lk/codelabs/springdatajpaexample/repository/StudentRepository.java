package lk.codelabs.springdatajpaexample.repository;

import lk.codelabs.springdatajpaexample.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
