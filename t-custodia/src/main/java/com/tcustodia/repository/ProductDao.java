package com.tcustodia.repository;

import java.util.List;

import com.tcustodia.domain.Product;

public interface  ProductDao {
	
	public List<Product> getProductList();

    public void saveProduct(Product prod);

}
