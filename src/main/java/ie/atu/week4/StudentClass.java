package ie.atu.week4;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Here I create the class
public class StudentClass {
    private String name;
    private String email;
    private String course;

    //Default Constructor
    public StudentClass(){
        System.out.println("StudentClass()");
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public String getName() {
        return name;
    }       //Here I get the name and return it when call it

    public void setName(String name) {
        this.name = name;
    } //Here I update name with a new value

    public String getEmail() {
        return email;
    }   //Here I get the email and return it when call it

    public void setEmail(String email) {
        this.email = email;
    }   //Here I update the email with a new value

    public String getCourse() {
        return course;
    }   //Here I get the course name and return it when call it

    public void setCourse(String course) { this.course = course; }  //Here I update the course name with a new value

    @Override       //This line builds and returns a string containing the values of name, email and course
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}