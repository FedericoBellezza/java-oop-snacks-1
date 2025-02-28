package org.lessons.java.studentsRegister;

import org.lessons.java.student.Student;

public class StudentsRegister {    

    // Constructor
    public StudentsRegister(int capacity) {
        Student[] students = new Student[capacity];
    }

    // Add a new student
    public void addStudent(Student student) {
        this.students[0] = student;
    }
}


