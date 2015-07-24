package net.jincorporation.model;

/**
 * 商品モデルクラス
 *
 * @author Administrator
 *
 */
public class Item {
	/**************************************************
	 * 商品モデルの属性定義
	 **************************************************/
	// 商品ID
	private String id;
	// 商品名
	private String name;
	// 商品価格
	private int price;

	/**
	 * コンストラクタ（引数なし）
	 */
	public Item() {
		id = null;
		name = null;
		price = 0;
	}

	/**
	 * コンストラクタ（引数あり）
	 *
	 * @param id
	 *            String 商品ID
	 * @param name
	 *            String 商品名
	 * @param price
	 *            int 商品価格
	 */
	public Item(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/**********************************************************
	 * 各属性のgetterとsetter
	 **********************************************************/

	/**
	 * 商品IDのgetter
	 * @return String 商品ID
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * 商品IDのsetter
	 * @param id String 商品ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 商品名のgetter
	 * @return String 商品名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 商品名のsetter
	 * @param name String 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 商品価格のgetter
	 * @return int 商品価格(円)
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * 商品価格のsetter
	 * @param price int 商品価格(円)
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}
