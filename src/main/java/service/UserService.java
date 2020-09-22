package service;

import model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public boolean save(User entity);
    public boolean update(User entity);
    public boolean delete(User entity);
    public User findById(int id);
    public List<User> findByType(Object column, Object prams);
}
