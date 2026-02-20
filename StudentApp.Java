//Class Student App

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        StudentRecord student = new StudentRecord(id, name, course);

        student.displayInfo();
        input.close();
    }
}
