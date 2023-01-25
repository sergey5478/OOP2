package Seminar3.terminal;

import java.util.ArrayList;
import java.util.Arrays;

public class ComandParser {
    public Command parseCommand(String inputCommand) {
        return new Command(new ArrayList<String>
        (Arrays.asList(inputCommand.split(" "))));
    }

}