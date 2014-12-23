package com.example.messging_json;

public class Model_class {
	public int id;
	public String name;
	public int quantity;
	boolean tickstate;
	boolean wrongsate;
	int imagenew;
	int imagenew1;
	public boolean isTickstate() {
		return tickstate;
	}
	public void setTickstate(boolean tickstate) {
		this.tickstate = tickstate;
	}
	public boolean isWrongsate() {
		return wrongsate;
	}
	public void setWrongsate(boolean wrongsate) {
		this.wrongsate = wrongsate;
	}
	

	public void setImagenew(int imagenew) {
		this.imagenew = imagenew;
	}
	public void setImagenew1(int imagenew1) {
		this.imagenew1 = imagenew1;
	}
	public int getImagenew() {
		return imagenew;
	}
	public int getImagenew1() {
		return imagenew1;
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
	
	
}
