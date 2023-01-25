package Seminar3.controller;

import Seminar3.data.StudentGroup;

public class GroupControllerService {
    private final GroupControllerImpl groupControllerImpl;

    public GroupControllerService(GroupControllerImpl groupControllerImpl) {
        this.groupControllerImpl = groupControllerImpl;
    }

    public StudentGroup findByIdStudentGroup(int id) {
        return groupControllerImpl.findById(id);
    }

    public void saveStudentGroup(StudentGroup entity) {
        groupControllerImpl.save(null);
    }

    public GroupControllerImpl getGroupControllerImpl() {
        return groupControllerImpl;
    }
}
