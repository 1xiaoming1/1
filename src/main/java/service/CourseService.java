package service;

import model.Course;

import java.util.List;

public interface CourseService {
    public List<Course> findAll();
    public boolean save(Course entity);
    public boolean update(Course entity);
    public boolean delete(Course entity);
    public Course findById(int id);
    public List<Course> findByType(Object column, Object prams);
}
