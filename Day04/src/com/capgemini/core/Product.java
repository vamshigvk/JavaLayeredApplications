package com.capgemini.core;

//Product Bean
public class Product implements Comparable
{
	private int id;
	private String name;
	private int quantity;
	private float price;
	
	public Product() {
	}

	public Product(int id, String name, int quantity, float price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Product p2 = (Product)obj;
		
		return id == p2.id;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Product p2 = (Product)o;
		
		return p2.id - id;
	}	
}

















