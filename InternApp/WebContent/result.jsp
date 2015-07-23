<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("UTF-8");
    %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Result JSP</title>
</head>
<body>
	<h2>Result JSP</h2>
	<p>結果を表示します。</p>
	<p>総額 : <%=request.getAttribute("amount") %> 円</p>

	<p><a href="/InternApp/TableServlet">商品一覧へ</a></p>
	<p><a href="/InternApp/index.jsp">INDEXへ</a></p>
</body>
</html>