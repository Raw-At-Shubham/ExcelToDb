package com.dump.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dump.helper.MyExcelHelper;
import com.dump.model.Product;
import com.dump.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {
	@Autowired
private ProductService productService;
@PostMapping("/product/upload")
public ResponseEntity<?>upload(@RequestParam("file")MultipartFile file)
{
if(MyExcelHelper.checkExcelFormat(file))
{
	this.productService.save(file);
	return ResponseEntity.ok(Map.of("message","File is successfully saved to Database"));
}
return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload a excel sheet");

}
@GetMapping("/product")
public List<Product> getAllProducts()
{
	
return this.productService.getAllProducts();
		}

}
