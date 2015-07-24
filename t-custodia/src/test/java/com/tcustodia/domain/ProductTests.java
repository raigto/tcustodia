package com.tcustodia.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tcustodia.domain.Product;

public class ProductTests {
	private Product product; 
	
	@Before
	public void setUp() throws Exception{
		product = new Product();
	}

	@Test
	public void testSetAndGetterDescription() {
		String testDescription = "descripcion";
		assertNull(product.getDescription());
		product.setDescription(testDescription);
		assertEquals(testDescription, product.getDescription());
	}
	
	@Test
	public void testSetAndGetterPrice(){
		Double testprice = 100.99;
		assertNull(product.getPrice());
		product.setPrice(testprice);
		assertEquals(testprice, product.getPrice());
	}

}
