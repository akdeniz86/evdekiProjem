package com.akdeniz.evdekiProjemPackage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity veritabanı oldugunu gösterir. Table name yazmazsan class isminde oluşturur
//Entity oluştur. Daha sonra Repository
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@Column(name="id")
	Long id;
	@Column(name="name")
	String name;
	@Column(name="manufacturer")
	String manufacturer;
	public Product() {
		super();
	}
	public Product(Long id, String name, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	
	
}
