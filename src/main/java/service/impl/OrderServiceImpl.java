package service.impl;

import dao.OrderDao;
import dao.impl.OrderDaoImpl;
import model.Order;
import service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao = new OrderDaoImpl();
    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public boolean save(Order entity) {
        return orderDao.save(entity);
    }

    @Override
    public boolean update(Order entity) {
        return orderDao.update(entity);
    }

    @Override
    public boolean delete(Order entity) {
        return orderDao.delete(entity);
    }

    @Override
    public Order findById(int id) {
        return orderDao.findById(id);
    }

    @Override
    public List<Order> findByType(Object column, Object prams) {
        return orderDao.findByType(column, prams);
    }
}
