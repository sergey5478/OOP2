package Seminar3.terminal;

public class Menu {
    private final static String output = "Введите команды:\n" +
    "\t add stu Ivanov Ivan Ivanovich 1987 через пробел для добавления\n" +
    "\t del stu Ivanov Ivan Ivanovich 1987 через пробел для удаления";

    public static void display(){
        System.out.println(output);
    }
}
