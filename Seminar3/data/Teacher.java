package Seminar3.data;

import java.util.List;

public class Teacher extends User {
    private int kafedra;
    private List<Integer> groups;

    public Teacher(String fio, int age, Integer passport, int kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }

    public int getKafedra() {
        return kafedra;
    }

    public void setKafedra(int kafedra) {
        this.kafedra = kafedra;
    }

    @Override
    public String toString() {
        return String.format("Teacher %s", fio);
    }
}
