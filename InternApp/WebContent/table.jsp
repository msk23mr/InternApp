<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="net.jincorporation.model.Item"%>
<%
	// 	エンコーディング
	request.setCharacterEncoding("UTF-8");
	// 商品リストの取得
	Item[] itemList = (Item[]) request.getAttribute("ItemList");
	// 商品点数の取得
	int itemCount = itemList.length;
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>商品一覧表</title>
</head>
<body>
	<!-- ページタイトル -->
	<h2>商品一覧表</h2>

	<!-- ResultServletへのフォーム -->
	<form action="/InternApp/ResultServlet" method="post">
		<!-- 	商品一覧表 -->
		<table>
			<!-- 	商品一覧表のヘッダ -->
			<thead>
				<tr>
					<th>品番</th>
					<th>商品名</th>
					<th>価格</th>
					<th>数量</th>
				</tr>
			</thead>
			<!-- 商品一覧表のボディ -->
			<tbody>
				<%
					for (int i = 0; i < itemCount; i++) {
				%>
				<!-- 各商品のデータ -->
				<tr>
					<!-- 商品ID -->
					<td><%=itemList[i].getId()%></td>
					<!-- 商品名 -->
					<td><%=itemList[i].getName()%></td>
					<!-- 商品価格 -->
					<td><%=itemList[i].getPrice()%></td>
					<!-- 数量（セレクトボックス） -->
					<td><select name="<%=itemList[i].getId()%>"
						id="<%=itemList[i].getId()%>">
							<option value="0">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
					</select></td>
				</tr>
				<%
					}
				%>
			</tbody>
			<tfoot>

			</tfoot>
		</table>
		<!-- 送信ボタン -->
		<input type="submit" value="会計" />
	</form>
</body>
</html>