package Seminar3.controller.teacher;

import Seminar3.data.Teacher;

public interface TeacherController<E extends Teacher> {

    E save(E entity);

    E findById(int id);
}
