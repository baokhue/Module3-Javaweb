package repository;

import bean.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    boolean create(Product product);
    boolean update(Product product);
    Product findById(int id);
    boolean delete(int id);
    boolean search(Product product);
}
