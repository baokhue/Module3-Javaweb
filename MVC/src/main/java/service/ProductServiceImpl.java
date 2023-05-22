package service;

import bean.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean create(Product product) {
        return repository.create(product);
    }

    @Override
    public boolean update(Product product) {
        return repository.update(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public Product search(String name) {
        return repository.search(name);
    }
}
