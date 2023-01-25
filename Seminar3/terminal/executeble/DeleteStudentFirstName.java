package Seminar3.terminal.executeble;

import Seminar3.data.Student;
import Seminar3.repository.StudentService;

public class DeleteStudentFirstName implements CommandExecutable {

    private StudentService studentService;

    private Student student;

    public DeleteStudentFirstName(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deletStudentFirstName(student.getFio());
    }
}
