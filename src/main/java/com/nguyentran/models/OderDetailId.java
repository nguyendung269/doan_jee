package com.nguyentran.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



public class OderDetailId implements Serializable{
	
	
	private int product;
	
	
	private int oder;
	
	public OderDetailId() {
	}

	public OderDetailId(int product, int oder) {
		super();
		this.product = product;
		this.oder = oder;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getOder() {
		return oder;
	}

	public void setOder(int oder) {
		this.oder = oder;
	}
	
	
}
