package com.dump.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dump.helper.MyExcelHelper;
import com.dump.model.Product;
import com.dump.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
public void save(MultipartFile file) 
{
try {
	List<Product> products = MyExcelHelper.convertsExcelToListOfProduct(file.getInputStream());
	this.productRepo.saveAll(products);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

}
public List<Product>getAllProducts(){
	return this.productRepo.findAll();
	
}
}
