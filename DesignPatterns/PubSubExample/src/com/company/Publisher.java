package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Publisher {

    private ArrayList<Student> students;

    private HashMap<Integer, String> grades;

    private String name;
    private String className;

    public String getName() {
        return name;
    }

    public Publisher(String name, String className){
        students = new ArrayList<>();
        grades = new HashMap<>();
        this.name = name;
        this.className = className;

    }

    public void NotifyGrades(){

        for (Student student: students) {
            student.getGrades(this, this.className, grades.get(student.getStudentID()));
        }
    }

    public void addGrade(Integer studentID, String grade){
        grades.put(studentID, grade);
    }

    public void addSubscribe(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public void removeSubscribe(Student student){
        if(students.contains(student)){
            students.remove(student);
        }
    }
}
