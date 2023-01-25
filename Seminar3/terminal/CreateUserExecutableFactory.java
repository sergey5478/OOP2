package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.data.User;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;
import Seminar3.terminal.executeble.CreateStudentExecutable;

public class CreateUserExecutableFactory implements CommandUserExecutableFactory{
    private final StudentService studentService;

    public CreateUserExecutableFactory(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new CreateStudentExecutable(studentService, (Student) user);
        } return new NoneCommandExecutable();
    }
}
