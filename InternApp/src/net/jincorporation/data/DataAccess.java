package net.jincorporation.data;

import net.jincorporation.model.Item;

public class DataAccess {
	private Item[] items = { new Item("001", "商品１", 100),
			new Item("002", "商品２", 120), new Item("003", "商品３", 150),
			new Item("004", "商品４", 200) };

	public Item getItem(String id) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].getId().equals(id)) {
				return items[i];
			}
		}
		return null;
	}

	public Item[] getItems() {
		return items;
	}
}
