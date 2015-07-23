package net.jincorporation.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jincorporation.model.Item;

/**
 * Servlet implementation class InternServlet
 */
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Item[] items;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// 商品リストの生成
		createItemList();

		// 商品リストをリクエストにセット
		request.setAttribute("ItemList", getItemList());

		// エンコーディングの設定
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		// サーブレットコンテキストを取得
		ServletContext sc = getServletContext();

		// 結果表示JSPのファイルパス
		String resultPage = "/result.jsp";

		// 商品一覧JSPのファイルパス
		String tablePage = "/table.jsp";

		// 結果表示JSPに遷移
		sc.getRequestDispatcher(tablePage).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public Item[] getItemList() {
		return this.items;
	}

	public void setItemList(Item[] items) {
		this.items = items;
	}

	private void createItemList() {
		Item[] items = { new Item("001", "商品１", 100),
				new Item("002", "商品２", 120), new Item("003", "商品３", 150),
				new Item("004", "商品４", 200) };

		setItemList(items);
	}
}
