package org.lessons.java.student;

public class Student {
    
    private String name;
    private String surname;
    private int age;

    // Constructor 
    public Student(String name, String surname, int age) {    
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getStudent(){
        return name + " " + surname + ", " + age + " anni";
    }
    
    
}
