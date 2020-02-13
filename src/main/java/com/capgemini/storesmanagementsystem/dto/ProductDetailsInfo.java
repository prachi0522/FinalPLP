package com.capgemini.storesmanagementsystem.dto;

public class ProductDetailsInfo {

	private Integer productId;

	private String productName;

	private Double price;

	private int warranty;

	private String productBrand;

	

	public ProductDetailsInfo() {
		super();
	}

	public ProductDetailsInfo(Integer productId, String productName, Double price, Integer warranty,String productBrand) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.warranty = warranty;
		this.productBrand=productBrand;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	
	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + price + ", warranty="
				+ warranty + ",productBrand=" + productBrand + "]";
	}

}
