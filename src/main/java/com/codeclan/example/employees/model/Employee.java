package com.codeclan.example.employees.model;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long  id;

    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="employees_num")
    private int employeesNum;
    @Column(name="email")
    private String email;



    public Employee(){

    }

    public Employee( String name, int age, int employeesNum, String email) {

        this.name = name;
        this.age = age;
        this.employeesNum = employeesNum;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeenNum() {
        return employeesNum;
    }

    public void setEmployeenNum(int employeenNum) {
        this.employeesNum = employeenNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
