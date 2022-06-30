package com.nguyentran.models;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "Product")
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id",nullable=false)
	private Category category; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private float price;
	
	@Column(name="quantity")
	private float quantity;
	
	@Column(name="discount")
	private int discount;
	
	@Column(name="image")
	private String image;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date create_at;
	
	@OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
	private Set<OderDetail> oderDetails;
	
	public Product() {
	}

	public Product(int id, String name, float price,float quan, int discount, String image,
			String description, String status, Date create_at) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quan;
		this.discount = discount;
		this.image = image;
		this.description = description;
		this.status = status;
		this.create_at = create_at;
	}



	public Product( String name, float price,float quan, int discount, String image, String description,
			String status, Date create_at) {
		super();
		
		this.name = name;
		this.price = price;
		this.quantity = quan;
		this.discount = discount;
		this.image = image;
		this.description = description;
		this.status = status;
		this.create_at = create_at;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}



	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}



	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



//	public Set<OderDetail> getOderDetails() {
//		return oderDetails;
//	}
//
//
//
//	public void setOderDetails(Set<OderDetail> oderDetails) {
//		this.oderDetails = oderDetails;
//	}


	

}
