package Seminar3.terminal;

import Seminar3.data.User;
import Seminar3.terminal.executeble.CommandExecutable;

public interface CommandUserExecutableFactory  {
    CommandExecutable createCommandExecutable(User user);
}
