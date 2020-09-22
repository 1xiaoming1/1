package service.impl;

import dao.CourseDao;
import dao.impl.CourseDaoImpl;
import model.Course;
import service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseDao courseDao = new CourseDaoImpl();
    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public boolean save(Course entity) {
        return courseDao.save(entity);
    }

    @Override
    public boolean update(Course entity) {
        return courseDao.update(entity);
    }

    @Override
    public boolean delete(Course entity) {
        return courseDao.delete(entity);
    }

    @Override
    public Course findById(int id) {
        return courseDao.findById(id);
    }

    @Override
    public List<Course> findByType(Object column, Object prams) {
        return courseDao.findByType(column, prams);
    }
}
