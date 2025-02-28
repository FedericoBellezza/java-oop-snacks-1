package org.lessons.java.studentsRegister;

import java.io.Console;

import org.lessons.java.student.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");

        // Create a new student register
        StudentsRegister register = new StudentsRegister();

        // add students to the register
        register.addStudent(new Student("Federico", "Bellezza", 23));
        register.addStudent(new Student("Luca", "Bianchi", 22));
        register.addStudent(new Student("Giuseppe", "Verdi", 20));

        // Print the register
        System.out.println(register.toString());

        
        System.out.println("------------------------------------");

    }
}
