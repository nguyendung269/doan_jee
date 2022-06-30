package com.nguyentran.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "OderDetail")
@IdClass(OderDetailId.class)
public class OderDetail {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="id")
//	private int id;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "p_id", referencedColumnName = "id")
	private Product product;

	@Id
	@ManyToOne
	@JoinColumn(name = "c_id", referencedColumnName = "id")
	private Oder oder;

//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private float price;

	public OderDetail() {
		// TODO Auto-generated constructor stub
	}
	
	
	public OderDetail(int quantity, float price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}



	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Oder getOder() {
		return oder;
	}

	public void setOder(Oder oder) {
		this.oder = oder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
