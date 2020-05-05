<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
	<%
		String path = request.getContextPath();
	%>
<script type="text/javascript">

	function doF(){
		$.ajax({
			type:"POST",
			 dataType : "json",
			url:"<%=path%>/sample/doF",
			success: function(result) {
				console.log(result);
				$("#result").html("상품명 : "+result.productName+", 가격 :"+result.productPrice);
			}
		})
	}

</script>
</head>

<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<h2>컨트롤러 호출 연습 페이지</h2>
<a href="<%=path%>/sample/doA">: model</a><br>
<a href="<%=path%>/sample/doB">: 단순호출</a><br>
<a href="<%=path%>/sample/doC">: model And View</a><br>
<a href="<%=path%>/sample/doD">: redirect</a><br>

<!-- doF()함수호출 -->
<a href="javascript:doF()">: doF</a>:json<br>

<!-- 함수호출 결과물 출력 -->
<div id="result"></div>
</body>
</html>
