package com.custodia.repository;

import java.util.List;

import com.tcustodia.domain.Product;
import com.tcustodia.repository.ProductDao;

public class InMemoryProductDao implements ProductDao {
	
	private List<Product> productList; 

    public InMemoryProductDao(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void saveProduct(Product prod) {
    }

}
