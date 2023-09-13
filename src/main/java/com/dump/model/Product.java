package com.dump.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	
private Integer productId;
private String productName;
private String productDescription;
private Double productPrice;
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public Double getProductPrice() {
	return productPrice;
}
public void setProductPrice(Double productPrice) {
	this.productPrice = productPrice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(Integer productId, String productName, String productDescription, Double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
}

}
