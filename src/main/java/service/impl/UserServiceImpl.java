package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean save(User entity) {
        return userDao.save(entity);
    }

    @Override
    public boolean update(User entity) {
        return userDao.update(entity);
    }

    @Override
    public boolean delete(User entity) {
        return userDao.delete(entity);
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findByType(Object column, Object prams) {
        return userDao.findByType(column, prams);
    }
}
