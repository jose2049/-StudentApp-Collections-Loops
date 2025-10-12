package ie.atu.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<StudentClass> studentClassList = new ArrayList<StudentClass>();

        //Asking the user how many users wants to add
        System.out.println("How many students do you want to enter?");
        int count = sc.nextInt();

        int i = 0;

        while (i < count) {
            StudentClass s = new StudentClass();            //creating an instance of a class called 's'

            //Here I ask the user to enter all the data which it's scanned and stored away in the instance
            System.out.println("Please enter your name: ");
            s.setName(new Scanner(System.in).nextLine());
            System.out.println("Please enter your email: ");
            s.setEmail(new Scanner(System.in).nextLine());
            System.out.println("Please enter your course name: ");
            s.setCourse(new Scanner(System.in).nextLine());         //Adding every instance to the List
            studentClassList.add(s);
            i++;
        }

        //Printing out all students with all the info gathered
        for (StudentClass s: studentClassList) {
            System.out.println(s);
        }

    }
}
