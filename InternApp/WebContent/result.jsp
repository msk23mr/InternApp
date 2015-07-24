<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//  エンコーディング
	request.setCharacterEncoding("UTF-8");
%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>結果</title>
</head>
<body>
	<!-- ページタイトル -->
	<h2>計算結果</h2>

	<!-- 	計算結果の表示 -->
	<p>
		総額 :
		<%=request.getAttribute("amount")%>
		円
	</p>

	<!-- TableServletへのリンク -->
	<p>
		<a href="/InternApp/TableServlet">商品一覧へ</a>
	</p>
	<!-- 	indexへのリンク -->
	<p>
		<a href="/InternApp/index.jsp">INDEXへ</a>
	</p>
</body>
</html>