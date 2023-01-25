package Seminar3.repository;

import java.util.ArrayList;
import java.util.List;

import Seminar3.data.Student;
import Seminar3.data.User;
import Seminar3.service.DataUserService;
import Seminar3.util.ReadFromTxt;

public class StudentService implements DataUserService<Student> {
    private final StudentRepository studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository();
    }

    @Override
    public void deleteUser(Student user) {
        studentRepository.delete(user);
    }

    @Override
    public List<Student> read(String path) {
        List<Student> students = new ArrayList<>();
        List<User> users = ReadFromTxt.read(path);
        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    @Override
    public void saveUser(Student user) {
        studentRepository.save(user);
    }

    @Override
    public void write(Student user) {

    }

    public List<Student> getUsersList() {
        return studentRepository.getUsersList();
    }

    public boolean deletStudentNumberAge(int groupNumber, int age) {
        return studentRepository.equals(studentRepository);
    }

    public void deletStudentFirstName(String fio) {
    }

    public void deletStudent(Student student) {
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public void saveStudent(Student entity) {
        studentRepository.save(null);
    }

    public void findStudentById(int id) {
        studentRepository.getUsersList();
    }

    public void findStudentByFio(Student fio) {
        studentRepository.getUsersList();
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

}
