package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by bobby on 12.03.2015.
 */
public interface UserService {

    public User save(User user);

    public void delete(int id) throws NotFoundException;

    public User get(int id) throws NotFoundException;

    public User getByEmail(String email) throws NotFoundException;

    public List<User> getAll();

    public void update(User user) throws NotFoundException;


}
