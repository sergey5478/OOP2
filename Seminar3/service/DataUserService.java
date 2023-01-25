package Seminar3.service;

import java.util.List;

import Seminar3.data.User;

public interface DataUserService<E extends User> {
    void write(E user);

    List<E> read(String path);

    void saveUser(E user);

    void deleteUser(E user);
}
