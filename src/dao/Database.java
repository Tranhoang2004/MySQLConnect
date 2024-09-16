package dao;

import Hoang.dev.data.impl.OrderImpl;
import Hoang.dev.data.impl.OrderItemImpl;
import Hoang.dev.data.impl.ProductImpl;
import Hoang.dev.data.impl.UserImpl;
import Hoangdev.CategoryImpl;

public class Database extends DatabaseDao {

    
    @Override
    public Category getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductImpl();
	}

}