package Seminar3.controller;

import Seminar3.data.StudentGroup;

public interface GroupController<E extends StudentGroup> {

    E save(E entity);

    E findById(int id);

}
