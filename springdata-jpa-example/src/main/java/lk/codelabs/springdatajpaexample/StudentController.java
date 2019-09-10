package lk.codelabs.springdatajpaexample;

import lk.codelabs.springdatajpaexample.modal.Address;
import lk.codelabs.springdatajpaexample.modal.Student;
import lk.codelabs.springdatajpaexample.modal.Telephone;
import lk.codelabs.springdatajpaexample.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController

@RequestMapping(value = "/sms")

public class StudentController {


    @Autowired
    StudentServiceImpl studentService;


        @RequestMapping(value = "/hello")
        public String greeting() {
            return "hello SpringBoot";
        }

        @RequestMapping(value = "/student",method = RequestMethod.POST)
        public  Student save(@RequestBody Student student){
            return studentService.save(student);
        }



//   @RequestMapping(value = "/student1",method = RequestMethod.GET)
//    public Student getStudent(){
//
//            Student student =new Student();
//            student.setName("Saman");
//
//
//            Address address =new Address();
//            address.setCity("Galle");
//            student.setAddress(address);
//
//    List<Telephone>  telephones =new ArrayList<>();
//    Telephone telephone= new Telephone();
//    telephone.setNo("086532354");
//    telephone.setStudent(student);
//    telephones.add(telephone);
//    return student;
//    }


    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public List<Student>fetchAll(){
        return studentService.findAll();

    }
    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public Optional<Student> fetchOne(@PathVariable Integer id){
        return studentService.findOne(id);

    }

    }