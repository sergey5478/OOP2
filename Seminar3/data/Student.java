package Seminar3.data;

public class Student extends User implements Comparable<Student> {
    private final Integer namberGroup;

    public Student(String fio, int age, Integer passport, Integer namberGroup) {
        super(fio, age, passport);
        this.namberGroup = namberGroup;
    }

    @Override
    public int compareTo(Student student) {
        if (student.getYearOfBirth() < this.getYearOfBirth())return 1;
        if (student.getYearOfBirth() > this.getYearOfBirth())return -1;
        return 0;
    }

    public int getNamberGroup() {
        return namberGroup;
    }

    @Override
    public String toString() {
        return String.format("Student %s", fio);
    }
}
