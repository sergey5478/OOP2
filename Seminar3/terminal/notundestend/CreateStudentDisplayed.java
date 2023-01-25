package Seminar3.terminal.notundestend;

import Seminar3.terminal.NoneCommandExecutable;
import Seminar3.terminal.executeble.CommandExecutable;

public class CreateStudentDisplayed implements ResultDisplayed {
    private final CommandExecutable commandExecutable;
    public CreateStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }
    @Override
    public void display() {
        if (commandExecutable instanceof NoneCommandExecutable) {
            System.out.println("неправильно ввели, введите по образцу\n");
        } else {
            System.out.println("Студент создан\n");
        }
    }
}
