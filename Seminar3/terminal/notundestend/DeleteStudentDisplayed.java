package Seminar3.terminal.notundestend;

import Seminar3.terminal.NoneCommandExecutable;
import Seminar3.terminal.executeble.CommandExecutable;

public class DeleteStudentDisplayed implements ResultDisplayed{
    private final CommandExecutable commandExecutable;
    public DeleteStudentDisplayed(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }
    @Override
    public void display() {
        if (commandExecutable instanceof NoneCommandExecutable) {
            System.out.println("неправильно ввели, введите по образцу\n");
        } else {
            System.out.println("Студент удален\n");
        }
    }
    
}