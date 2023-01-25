package Seminar3.terminal;

import Seminar3.data.Student;
import Seminar3.data.User;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;
import Seminar3.terminal.executeble.DeleteStudentExecutable;

public class DeleteUserExecutableFactory implements CommandUserExecutableFactory{
    private StudentService studentService;

    public DeleteUserExecutableFactory(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable createCommandExecutable(User user) {
        if (user instanceof Student){
            return new DeleteStudentExecutable(studentService, (Student) user);
        } return new NoneCommandExecutable();
    }
}
