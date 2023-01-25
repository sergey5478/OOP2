package Seminar3.controller.student;

import Seminar3.data.Student;

public class StudentControllerService {
    private final StudentControllerImpl studentControllerImpl;

    public StudentControllerService(StudentControllerImpl studentControllerImpl) {
        this.studentControllerImpl = studentControllerImpl;
    }

    public Student findByIdStudent(int id) {
        return studentControllerImpl.findById(id);
    }

    public void saveStudent(Student entity) {
        studentControllerImpl.save(null);
    }

    public StudentControllerImpl getStudentControllerImpl() {
        return studentControllerImpl;
    }

}
