package net.jincorporation.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jincorporation.data.DataAccess;

/**
 * Servlet implementation class InternServlet
 */
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

		DataAccess da = new DataAccess();

		// 商品リストをリクエストにセット
		request.setAttribute("ItemList", da.getItems());

		// エンコーディングの設定
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		// サーブレットコンテキストを取得
		ServletContext sc = getServletContext();

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

}
