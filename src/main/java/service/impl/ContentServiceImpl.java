package service.impl;

import dao.ContentDao;
import dao.impl.ContentDaoImpl;
import model.Content;
import service.ContentService;

import java.util.List;

public class ContentServiceImpl implements ContentService {
    private ContentDao contentDao = new ContentDaoImpl();
    @Override
    public List<Content> findAll() {
        return contentDao.findAll();
    }

    @Override
    public boolean save(Content entity) {
        return contentDao.save(entity);
    }

    @Override
    public boolean update(Content entity) {
        return contentDao.update(entity);
    }

    @Override
    public boolean delete(Content entity) {
        return contentDao.delete(entity);
    }

    @Override
    public Content findById(int id) {
        return contentDao.findById(id);
    }

    @Override
    public List<Content> findByType(Object column, Object prams) {
        return contentDao.findByType(column, prams);
    }
}
