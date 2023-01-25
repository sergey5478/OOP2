package Seminar3.data.comparator;

import java.util.Comparator;

import Seminar3.data.User;

public class UserComparator implements Comparator<User>{

    @Override
    public int compare(User student1, User student2) {
        return student1.getFio().compareTo(student2.getFio());
    }    
}
