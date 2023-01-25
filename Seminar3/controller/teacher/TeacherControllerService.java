package Seminar3.controller.teacher;

import Seminar3.data.Teacher;

public class TeacherControllerService {
    private final TeacherControllerImpl tControllerImpl;

    public TeacherControllerService(TeacherControllerImpl tControllerImpl) {
        this.tControllerImpl = tControllerImpl;
    }

    public Teacher findByIdTeacher(int id) {
        return tControllerImpl.findById(id);
    }

    public void saveTeacher(Teacher entity) {
        tControllerImpl.save(null);
    }

    public TeacherControllerImpl gettControllerImpl() {
        return tControllerImpl;
    }

}
