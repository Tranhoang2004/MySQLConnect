package dao;

import java.util.List;


import Hoangdev.data.model.OrderDao;

public interface OrderItemDao {
    public boolean insert(OrderDao orderItem);
    public boolean update(OrderDao orderItem);
    public boolean delete(int id);
    public OrderDao find(int id);
    public List<OrderDao> findAll();
    public List<OrderDao> findByOder(int orderId);
    public List<OrderDao> findByProduct(int prodId);
}