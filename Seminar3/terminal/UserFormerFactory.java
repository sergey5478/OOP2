package Seminar3.terminal;

public class UserFormerFactory {
    public UserForms createUserFormer(Command command) {
        if (command.isStudentCommand()) {
            return new StudentForms(command.getArguments());
        } else return new NoneUserForms(command.getArguments());
    }
}
