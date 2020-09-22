package service;

import model.Content;

import java.util.List;

public interface ContentService {
    public List<Content> findAll();
    public boolean save(Content entity);
    public boolean update(Content entity);
    public boolean delete(Content entity);
    public Content findById(int id);
    public List<Content> findByType(Object column, Object prams);
}
