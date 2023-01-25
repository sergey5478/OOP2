package Seminar3.service;

import Seminar3.data.User;
import Seminar3.repository.Repository;

public interface DataService<E extends User, I> extends Repository<E> {
    E create(E user);

    E read(E user);

}
