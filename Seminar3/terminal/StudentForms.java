package Seminar3.terminal;

import java.util.ArrayList;

import Seminar3.data.Student;

public class StudentForms extends UserForms{
    public StudentForms(ArrayList<String> commands) {
        super(commands);
    }
    private Integer formGroupNumber() {
        Integer groupNumber = null;
        for (String i : commands) {
            if (isInt(i)) {
                groupNumber = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return groupNumber;
    }

    public Student createUser() {
        int lengthBefore = commands.size();
        String name = formName();
        Integer yearOfBirth = formYearOfBirth();
        Integer passport = formPassNumber();
        Integer groupNumber = formGroupNumber();
        if (lengthBefore > commands.size())
            return new Student(name, yearOfBirth, passport, groupNumber);
        else return null;
    }
}
