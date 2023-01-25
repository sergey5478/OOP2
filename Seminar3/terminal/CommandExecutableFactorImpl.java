package Seminar3.terminal;

import Seminar3.data.User;
import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;

public class CommandExecutableFactorImpl implements CommandExecutableFactory {
    protected final StudentService studentService;
    private final CommandsFactory commandsFactory;
    private final UserFormerFactory userFormerFactory;

    public CommandExecutableFactorImpl(StudentService studentService) {
        this.studentService = studentService;
        this.commandsFactory = new CommandsFactory(studentService);
        this.userFormerFactory = new UserFormerFactory();
    }

    @Override
    public CommandExecutable create(Command command) {
        UserForms userForms = userFormerFactory.createUserFormer(command);
        User user = userForms.createUser();

        if (user != null) {
            CommandUserExecutableFactory commandUserExecutableFactory = commandsFactory.createCommandFactory(command);
            return commandUserExecutableFactory.createCommandExecutable(user);
        } else
            return new NoneCommandExecutable();
    }

}
