package CSDL;

import java.util.List;
import dao.data.model.Category;
public interface Category {
    public boolean insert(Category category);
    public boolean update(Category category);
    public boolean delete(int id);
    public Category find(int id);
    public List<Category> findAll();
    public List<Category> hotCategory();
}