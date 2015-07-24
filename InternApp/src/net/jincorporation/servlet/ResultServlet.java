package net.jincorporation.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jincorporation.data.DataAccess;

/**
 * Servlet implementation class CalServlet
 */
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResultServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// エンコーディングの設定
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		// データアクセスオブジェクトの生成
		DataAccess da = new DataAccess();
		// 総額
		int amount = 0;

		// table.jspのフォーム入力値を取得
		Map<String, String[]> itemMap = request.getParameterMap();
		// itemMapのkey値を基にIteratorを生成
		Iterator<String> it = itemMap.keySet().iterator();


		while (it.hasNext()) {
			// 商品IDの取得
			String id = (String) it.next();
			// 数量の取得
			String[] number = (String[]) itemMap.get(id);

			// 商品価格の取得
			int price = da.getItem(id).getPrice();
			// (商品価格)×(数量)の合計
			amount += price * Integer.parseInt(number[0]);

		}

		// 計算結果をresult.jspに渡す
		request.setAttribute("amount", amount);

		// サーブレットコンテキストを取得
		ServletContext sc = getServletContext();

		// result.jspへのパス
		String resultPage = "/result.jsp";

		// result.jspに遷移
		sc.getRequestDispatcher(resultPage).forward(request, response);
	}
}
