package Seminar3.terminal.notundestend;

import Seminar3.terminal.Command;
import Seminar3.terminal.executeble.CommandExecutable;

public class ResultDisplayedFactory {
    public ResultDisplayed create(Command command, CommandExecutable commandExecutable) {
        if (command.isCreateCommand() && command.isStudentCommand()) {
            return new CreateStudentDisplayed(commandExecutable);
        } else if (command.isDeleteCommand() && command.isStudentCommand()) {
            return new DeleteStudentDisplayed(commandExecutable);
        } else return new NoneResultDisplayed();
    }
}
