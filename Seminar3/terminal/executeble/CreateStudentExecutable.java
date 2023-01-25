package Seminar3.terminal.executeble;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;

public class CreateStudentExecutable implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.createStudent(student);

    }

}
