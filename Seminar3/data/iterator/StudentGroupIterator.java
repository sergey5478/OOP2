package Seminar3.data.iterator;

import java.util.Iterator;
import java.util.List;

import Seminar3.data.Student;
import Seminar3.data.StudentGroup;

public class StudentGroupIterator implements Iterator<Student>, Iterable<Student>{
    private StudentGroup studentGroup;
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudentList();
    }
    
    @Override
    public Iterator<Student> iterator() {
         return new StudentGroupIterator(studentGroup);
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();
    }

    @Override
    public Student next() {
        return students.get(cursor++);
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

}