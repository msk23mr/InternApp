<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="net.jincorporation.model.Item" %>
<%
	request.setCharacterEncoding("UTF-8");
	Item[] itemList = (Item[])request.getAttribute("ItemList");
	int itemCount = itemList.length;
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Table JSP</title>
</head>
<body>
	<h2>Table JSP</h2>

	<form action="/InternApp/ResultServlet" method="post">
		<input type="hidden" name="itemCount" value="<%=itemCount %>" />
		<table>
			<thead>
				<tr>
					<th>品番</th>
					<th>商品名</th>
					<th>価格</th>
					<th>数量</th>
				</tr>
			</thead>
			<tbody>
				<% for(int i = 0; i < itemCount; i++){ %>
					<tr>
						<td>
							<%= itemList[i].getId() %>
						</td>
						<td>
							<%= itemList[i].getName() %>
						</td>
						<td>
							<%= itemList[i].getPrice() %>
						</td>
						<td>
							<select name="<%=itemList[i].getId() %>" id="<%=itemList[i].getId() %>">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</td>
					</tr>
				<% } %>
			</tbody>
			<tfoot>

			</tfoot>
		</table>

		<input type="submit" value="会計" />
	</form>
</body>
</html>