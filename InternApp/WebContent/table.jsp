<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="net.jincorporation.model.Item" %>
<%
	request.setCharacterEncoding("UTF-8");
	Item[] itemList = (Item[])request.getAttribute("ItemList");
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Table JSP</title>
</head>
<body>
	<h2>Table JSP</h2>
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
			<% for(int i = 0; i < itemList.length; i++){ %>
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
					</td>
				</tr>
			<% } %>
		</tbody>
		<tfoot>

		</tfoot>
	</table>
</body>
</html>