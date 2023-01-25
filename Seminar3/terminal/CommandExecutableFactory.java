package Seminar3.terminal;

import Seminar3.terminal.executeble.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
