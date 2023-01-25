package Seminar3.controller.student;

import Seminar3.data.Student;

public interface StudentController<E extends Student> {
    E save(E entity);

    E findById(int id);
}
