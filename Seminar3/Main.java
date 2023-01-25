package Seminar3;

import Seminar3.repository.StudentService;
import Seminar3.terminal.LogingCommandExecutableFactory;
import Seminar3.terminal.Menu;
import Seminar3.terminal.TerminalReader;

public class Main {
    public static void main(String[] args) {
        Menu.display();
        TerminalReader.getInstans(new LogingCommandExecutableFactory(new StudentService())).getI();
    
        }
    
}