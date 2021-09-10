package com.per.arraylisttest;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String toString() {
        return "Student_print[" + name + ", " + age + "]";
    }
    
    /* @Override - Not possible unless you change the argument Student to Object
     * which will alter the output by removing one entry from the list */
    //@Override
    public boolean equals(Student obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age)
                return true;
        }
        return false;
    }
    
}

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }
}
