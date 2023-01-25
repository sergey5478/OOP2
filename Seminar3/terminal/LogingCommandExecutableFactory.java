package Seminar3.terminal;

import Seminar3.repository.StudentService;
import Seminar3.terminal.executeble.CommandExecutable;
import Seminar3.terminal.notundestend.ResultDisplayedFactory;

public class LogingCommandExecutableFactory extends CommandExecutableFactorImpl {
    private final ResultDisplayedFactory resultDisplayedFactory;
    public LogingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
        this.resultDisplayedFactory = new ResultDisplayedFactory();
    }

    @Override
    public CommandExecutable create(Command command) {
        System.out.printf("Вы ввели: %s\n", command);

        CommandExecutable commandExecutable = super.create(command);
        resultDisplayedFactory.create(command, commandExecutable).display();
        return commandExecutable;
    }

}
