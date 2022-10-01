package com.mango.order.domain;

public class Mango {

	private String name;
	private int id;
	
	public Mango(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Mango [name=" + name + ", id=" + id + "]";
	}

}
