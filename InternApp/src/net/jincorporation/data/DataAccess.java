package net.jincorporation.data;

import net.jincorporation.model.Item;

/**
 * 商品データへのアクセスクラス
 * @author Administrator
 *
 */
public class DataAccess {
	// 商品リストの生成
	private Item[] items = { new Item("001", "商品１", 100),
			new Item("002", "商品２", 120), new Item("003", "商品３", 150),
			new Item("004", "商品４", 200) };

	/**
	 * 商品データの取得
	 *
	 * @param id
	 *            String 商品ID
	 * @return Item 商品オブジェクト
	 */
	public Item getItem(String id) {
		// 引数で指定されたIDを持つ商品データを返す
		for (int i = 0; i < items.length; i++) {
			if (items[i].getId().equals(id)) {
				return items[i];
			}
		}
		// 見つからない場合は、nullを返す
		return null;
	}

	/**
	 * 商品データのリストを返す
	 *
	 * @return Item[] 商品オブジェクトの配列
	 */
	public Item[] getItems() {
		return items;
	}
}
