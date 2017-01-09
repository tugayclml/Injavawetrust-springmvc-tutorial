package _08.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import _08.webstore.domain.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProductById(String productID);

	public List<Product> getProductsByCategory(String category);

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	public void addProduct(Product product);
}