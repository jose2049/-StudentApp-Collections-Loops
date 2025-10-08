package ie.atu.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
    StudentClass s=new StudentClass();

    System.out.println("Please enter your name: ");
    s.setName(new Scanner(System.in).nextLine());
    System.out.println("Please enter your email: ");
    s.setEmail(new Scanner(System.in).nextLine());
    System.out.println("Please enter your course name: ");
    s.setCourse(new Scanner(System.in).nextLine());

    }
}
