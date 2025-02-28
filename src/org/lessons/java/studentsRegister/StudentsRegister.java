package org.lessons.java.studentsRegister;

import org.lessons.java.student.Student;

public class StudentsRegister {    
    private Student[] registro;

    // Constructor
    public StudentsRegister() {
        this.registro = new Student[0];
    }

    //  Getter
    public Student[] getRegistro() {
        return this.registro;
    }

    // Setter
    public void setRegistro(Student[] registro) {
        this.registro = registro;
    }

    // Add a new student
    public void addStudent(Student student) {
        // Create a new array
        Student[] newRegistro = new Student[this.registro.length + 1];

        // Copy the old array into the new array
        for(int i = 0; i < this.registro.length; i++) {
            newRegistro[i] = this.registro[i];
        }

        // Add the new student
        newRegistro[this.registro.length] = student;

        // Set the new array as the registro
        this.registro = newRegistro;
        
    }

    public String toString(){

        // Create the result string
        String result = "Registro: \n";

        // Add the students to the string
        for (Student student : this.registro){
            result += "- " + student.getStudent() + "; \n";
        }

        // Return the result
        return result;
    
    }
}


