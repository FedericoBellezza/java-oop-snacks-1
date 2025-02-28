package org.lessons.java.studentsRegister;

import java.io.Console;

import org.lessons.java.student.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");

        // Create a new student register
        StudentsRegister RegistroAlunni = new StudentsRegister(3);

        // Add a new student
        RegistroAlunni.addStudent(new Student("Federico", "Bellezza", 23));


        System.out.println(RegistroAlunni[0].name);
        System.out.println("------------------------------------");

    }
}
