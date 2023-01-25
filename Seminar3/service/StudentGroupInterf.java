package Seminar3.service;

import java.util.List;

import Seminar3.data.Student;
import Seminar3.data.StudentGroup;

public interface StudentGroupInterf {
    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void remove(String fio);
    void sort(List<Student> studentList);   

}
