package com.nguyentran.models;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Oder")
public class Oder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nameCustomer")
	private String nameCustomer;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="note")
	private String note;
	
	@Column(name="totalPrice")
	private float totalPrice;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date create_at;
	
	@OneToMany(mappedBy = "oder",fetch = FetchType.EAGER)
	private Set<OderDetail> oderDetails;
	
	
	
	public Oder() {
	}

	public Oder(int id, String nameCustomer, String address, String phone, String email, String note, float totalPrice,
			String status, Date create_at) {
		super();
		this.id = id;
		this.nameCustomer = nameCustomer;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.note = note;
		this.totalPrice = totalPrice;
		this.status = status;
		this.create_at = create_at;
	}



	public Oder(String nameCustomer, String address, String phone, String email, String note, float totalPrice,
			String status, Date create_at) {
		super();
		this.nameCustomer = nameCustomer;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.note = note;
		this.totalPrice = totalPrice;
		this.status = status;
		this.create_at = create_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
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

	public Set<OderDetail> getOderDetails() {
		return oderDetails;
	}

	public void setOderDetails(Set<OderDetail> oderDetails) {
		this.oderDetails = oderDetails;
	}

	
	
	
}
