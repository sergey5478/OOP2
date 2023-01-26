package Seminar3.terminal;

import java.util.Scanner;

import Seminar3.db.StudentTable;
import Seminar3.terminal.executeble.CommandExecutable;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private final ComandParser comandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstans(CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandExecutableFactory commandExecutableFactory) {
        this.comandParser = new ComandParser();
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void getI() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Ввод: ");
            String comand = in.nextLine();
            Command cool = comandParser.parseCommand(comand);

            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);

            commandExecutable.execute();

        }

    }

    public static void getInstans(StudentTable studentTable) {
    }

}
