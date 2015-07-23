package net.jincorporation.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jincorporation.data.DataAccess;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
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

		DataAccess da = new DataAccess();
		int itemCount;
		int amount = 0;

		Map itemMap = request.getParameterMap();
		Iterator it = itemMap.keySet().iterator();

		while (it.hasNext()) {
			String name = (String) it.next();
			String[] values = (String[]) itemMap.get(name);

			if (name.equals("itemCount")) {
				itemCount = Integer.parseInt(values[0]);
			} else {
				int price = da.getItem(name).getPrice();
				amount += price * Integer.parseInt(values[0]);
			}
		}

		request.setAttribute("amount", amount);

		// サーブレットコンテキストを取得
		ServletContext sc = getServletContext();

		// 結果表示JSPのファイルパス
		String resultPage = "/result.jsp";

		// 結果表示JSPに遷移
		sc.getRequestDispatcher(resultPage).forward(request, response);
	}
}
