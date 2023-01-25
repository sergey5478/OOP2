package Seminar3.terminal;

import Seminar3.data.User;
import Seminar3.terminal.executeble.CommandExecutable;

public class NoneCommandUserExecutableFactory implements CommandUserExecutableFactory{
    @Override
    public CommandExecutable createCommandExecutable(User user) {
        return new NoneCommandExecutable();
    }
}
