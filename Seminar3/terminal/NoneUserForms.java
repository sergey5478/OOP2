package Seminar3.terminal;

import java.util.ArrayList;

import Seminar3.data.User;

public class NoneUserForms extends UserForms{
    public NoneUserForms(ArrayList<String> commands) {
        super(commands);
    }
    @Override
    public User createUser() {
        return null;
    }
}
