package Seminar3.terminal;

import java.util.ArrayList;

public class Command {
    private static final String ADD = "add";
    private static final String DEL = "del";
    private static final String STUDENT = "stu";
    private final ArrayList<String> comands;
    private final String mainFirstCommand;

    public Command(ArrayList<String> comands) {
        this.mainFirstCommand = comands.get(0);
        this.comands = comands;

    }

    public ArrayList<String> getArguments() {
        return comands;
    }

    public String getMainFirstCommand() {
        return mainFirstCommand;
    }

    public boolean isCreateCommand() {
        return comands.get(0).equals(ADD);
    }

    public boolean isDeleteCommand() {
        return comands.get(0).equals(DEL);
    }
    public boolean isStudentCommand() {
        return comands.size() > 1 && comands.get(1).equals(STUDENT);
    }
    public String getFirstArgument() {
        return comands.get(0);
    }

    public static String getAdd() {
        return ADD;
    }

    public static String getDel() {
        return DEL;
    }

    @Override
    public String toString() {
        return String.join(" ", comands);
    }
}