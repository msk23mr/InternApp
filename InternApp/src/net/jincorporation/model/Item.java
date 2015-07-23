package net.jincorporation.model;

public class Item {
	private String id;
	private String name;
	private int price;

	public Item() {
		id = null;
		name = null;
		price = 0;
	}

	public Item(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
