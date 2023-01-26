package Seminar3.db;

import Seminar3.data.Student;

public class StudentTable extends Table<Student> {

    public boolean removeByName(String fio) {
        for (Student student : elements) {
            if (student.getFio().equals(fio)) {
                elements.remove(student);
                return true;
            }
        }
        return false;
    
    }
}
