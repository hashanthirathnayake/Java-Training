package lk.codelabs.springdatajpaexample.modal;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer sid;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List <Telephone> telephoneList;

    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address= address;
    }

    public Integer getSid(){
        return sid;
    }

    public void getSid(Integer sid){
        this.sid=  sid;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this .name=name;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public List<Telephone> getTelephoneList() {
        return telephoneList;
    }

    public void setTelephoneList(List<Telephone> telephoneList) {
        this.telephoneList = telephoneList;
    }
}
