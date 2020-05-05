package com.test.doubleS.vo;

public class SampleProVO {
	private String productName;
	private double productPrice;

	public SampleProVO(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
