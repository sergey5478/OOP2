package Seminar3.controller.groupStream;

import Seminar3.data.GroupStream;

public class GroupStreamService {
    private final GroupStreamControllerImpl groupStreamControllerImpl;

    public GroupStreamService(GroupStreamControllerImpl groupStreamControllerImpl) {
        this.groupStreamControllerImpl = groupStreamControllerImpl;
    }

    public GroupStream findGroupStreamById(int id) {
        return groupStreamControllerImpl.findById(id);
    }

    public void saveGroupStream(GroupStream entity) {
        groupStreamControllerImpl.save(null);
    }

    public GroupStreamControllerImpl getGroupStreamControllerImpl() {
        return groupStreamControllerImpl;
    }

}
