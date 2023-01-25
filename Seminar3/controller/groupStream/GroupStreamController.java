package Seminar3.controller.groupStream;

import Seminar3.data.GroupStream;

public interface GroupStreamController<E extends GroupStream> {
    E save(E entity);

    E findById(int id);
}
