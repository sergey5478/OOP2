package Seminar3.repository2;

import Seminar3.data.Teacher;
import Seminar3.repository.UserRepository;

public class TeacherRepository implements UserRepository<Teacher, Integer> {

    @Override
    public void delete(Teacher entity) {        
    }

    @Override
    public Teacher findByFio(Teacher fio) {
        return null;
    }
    
    @Override
    public void save(Teacher entity) {
    }

}
