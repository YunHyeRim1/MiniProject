<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<<<<<<< HEAD
    <title>게시판</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<<<<<<< HEAD
<style>
* {
  box-sizing: border-box;
=======
    <title>전시회</title>
    <style>
body {
  font-family: Roboto, Arial, sans-serif;
  ont-size: 15px;
  color: #525252;
  padding: 8px;
  line-height: 160%;
}
a {
  color: #598585;
>>>>>>> refs/heads/develop-keb
}
<<<<<<< HEAD
input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
=======

a:link {
  text-decoration: none;
}

a:visited {
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
  color: #2f4f4f;
}

a:active {
  text-decoration: underline;
}
button {
    width:50px;
    background-color: #467575;
    border: none;
    color:#fff;
    padding: 2px 0;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 13px;
    margin: 4px;
    cursor: pointer;
    border-radius:10px;
}
button:hover {
  background-color: #2b4d4d;
}
input[type=text] {
  width: 13%;
  margin-bottom: 20px;
  padding: 7px;
>>>>>>> refs/heads/develop-keb
  border: 1px solid #ccc;
  border-radius: 3px;
}
<<<<<<< HEAD
label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}
.container {
  border-radius: 5px;
  background-color: #f7f7f7;
  padding: 20px;
}
.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}
.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}
/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
.goHome-btn {
  background-color: #506EA5;
  border: none;
  color: white;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer;
}
.goHome-btn:hover {
  background-color: #506EA5;
}
	#menu-group button{
		border: 2px solid #506EA5;
		background-color: rgba(0,0,0,0);
		color: #506EA5;
		padding: 10px 20px;
  		font-size: 15px;
  		cursor: pointer;
  		border-radius: 8px;
	}
	#menu-group button:hover{
		color: white;
		background-color: #506EA5;
	}
}
</style>
=======
>>>>>>> refs/heads/develop-pwy
=======
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
>>>>>>> refs/heads/develop-keb
</head>
<body>
<<<<<<< HEAD
<<<<<<< HEAD

				<h1>전시회 정보</h1>
	<div class="container">
=======
    <h1> 게시판1 </h1>
    <div class="container">
>>>>>>> refs/heads/develop-pwy
	<form>
		<div class="row">
        	<div class="col-20">
				<div id="menu-group">
<<<<<<< HEAD
					<a href="#" id="add">등록하기</a>
					<a href="#" id="list">목록보기</a>
=======
        <a id="write" href="#">글 쓰기</a>
        <a id="list" href="#">글 목록</a>
        <a id="detail" href="#">글 상세</a>
>>>>>>> refs/heads/develop-pwy
				</div>
			</div>
		</div>
	</form>
	</div>
<<<<<<< HEAD
	
<script src="<%=application.getContextPath() %>/resources/shw/js/shw.js"></script>
=======
    <h2>예약 페이지</h2>
    <a href="#" id="user-page">유저페이지</a><br>
    <a href="#" id="exhbn-page">전시페이지</a><br>
    <a href="#" id="booking-page">예약페이지</a><br>
    <a href="#" id="review-page">리뷰페이지</a><br>
>>>>>>> refs/heads/develop-keb
<script src="<%=application.getContextPath() %>/resources/cmm/js/cmm.js"></script>
<script>
<<<<<<< HEAD
	cmm.init(`${ctx}`)
=======
	cmm.init(`<%=application.getContextPath() %>`)
>>>>>>> refs/heads/develop-keb
</script>
=======

        
<script src="${brd}/js/brd.js"></script>
    <script src="<%=application.getContextPath() %>/resources/cmm/js/cmm.js"></script>
    <script>
    	cmm.init(`<%=application.getContextPath() %>`)
    </script>
>>>>>>> refs/heads/develop-pwy
</body>
</html>