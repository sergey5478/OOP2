package Seminar3.controller;

import java.util.List;

import Seminar3.data.GroupStream;
import Seminar3.data.Student;
import Seminar3.data.StudentGroup;
import Seminar3.repository2.TeacherRepository;
import Seminar3.service.StudentGroupInterf;
import Seminar3.service.StudentServiceImpl;
import Seminar3.service.StudentStreamInterf;

public class Controller {
    private StudentServiceImpl studentServiceImpl;
    private StudentGroupInterf studentGroupInterf;
    private StudentStreamInterf studentStreamInterf;
    private TeacherRepository teacherRepository;
   

    public Controller(StudentServiceImpl studentServiceImpl, StudentGroupInterf studentGroupInterf,
            StudentStreamInterf studentStreamInterf, TeacherRepository teacherRepository) {
        this.studentServiceImpl = studentServiceImpl;
        this.studentGroupInterf = studentGroupInterf;
        this.studentStreamInterf = studentStreamInterf;
        this.teacherRepository = teacherRepository;
    }

    public Student createStudent(Student student) {
        studentServiceImpl.create(student);
        return (Student) studentServiceImpl.read(student);
    }

    public StudentGroup createGroup(int groupNumber) {
        return studentGroupInterf.getGroup(groupNumber);
    }

    public void studentStreamSort(List<GroupStream> groupStream) {
        studentStreamInterf.groupStreamSort(groupStream);
    }

    public StudentServiceImpl getStudentServiceImpl() {
        return studentServiceImpl;
    }

    public void setStudentServiceImpl(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    public StudentGroupInterf getStudentGroupInterf() {
        return studentGroupInterf;
    }

    public void setStudentGroupInterf(StudentGroupInterf studentGroupInterf) {
        this.studentGroupInterf = studentGroupInterf;
    }

    public StudentStreamInterf getStudentStreamInterf() {
        return studentStreamInterf;
    }

    public void setStudentStreamInterf(StudentStreamInterf studentStreamInterf) {
        this.studentStreamInterf = studentStreamInterf;
    }

    public TeacherRepository getTeacherRepository() {
        return teacherRepository;
    }

    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    
}
