package Seminar3.db;

import java.util.ArrayList;

public abstract class Table<E> {

    protected ArrayList<E> elements;

    protected Table() {
        elements = new ArrayList<>();
    }

    public E save(E entity) {
        this.elements.add(entity);
        return entity;
    }

    public ArrayList<E> getElements() {
        return elements;
    }

}
