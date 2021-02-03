<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>전시회 정보 사이트</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    
</head>
<body>
	<h1>전시회 정보</h1>
	<a href="#" id="add">등록하기</a>
	<a href="#" id="list">목록보기</a>
<script src="<%=application.getContextPath() %>/resources/cmm/js/cmm.js"></script>
<script>
	cmm.init(`<%=application.getContextPath() %>`)
</script>
</body>
</html>