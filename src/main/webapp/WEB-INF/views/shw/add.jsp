<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>전자정부 프레임워크 프로젝트</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	#btn-group button{
		border: 2px solid #506EA5;
		background-color: rgba(0,0,0,0);
		color: #506EA5;
		padding: 5px;
	}
	#btn-group button:hover{
		color: white;
		background-color: #506EA5;
	}
</style>

    <script type="text/javascript">
        $(function() {
            $("#posterImage").on('change', function() {
                readURL(this);
            });
        });
        function readURL(input) {
            if(input.files && input.files[0]) {
               var reader = new FileReader();
               reader.onload = function (e) {
                  $('#preImage').attr('src', e.target.result);
               }
               reader.readAsDataURL(input.files[0]);
            }
        }
    </script>

</head>
<body>
   <section id="coming-soon">        
       <div class="container">
          <div class="row">
              <div class="col-sm-12">
                  <h1>전시회 등록화면</h1>
                  <div class="time-count">
                      <form style="border:1px solid #ccc; width:330px;">
                          <div class="container" style="padding-left:10px; padding-right:10px; padding-bottom:10px;">
                            <h1>전시회 등록</h1>
                            <p>전시회 정보를 입력해주세요.</p>
                            <hr>
                            
                            
							<div id="image-container">
	                            <label for="posterImage"><b>포스터</b></label>
	                        	<input type="file" accept="image/*" id="posterImage" required/><br/>
        						<img style="width:300px;" id="preImage" src="#" alt="이미지 미리보기" />
  
							</div>
								
                            <label for="title"><b>제목</b></label>
                            <input type="text" placeholder="전시회 제목" id="title" required><br/>
                        
                            <label for="period"><b>기간</b></label>
                            <input type="text" placeholder="2021.00.00 ~ 2021.00.00" id="period" required><br/>
                            
                            <label for="time"><b>시간</b></label>
                            <input type="text" placeholder="00:00 ~ 00:00" id="time" required><br/>
                        
                            <label for="venue"><b>장소</b></label>
                            <input type="text" placeholder="전시회 장소" id="venue" required><br/>
                        
                            <label for="admission"><b>입장연령</b></label>
                            <input type="text" placeholder="전체관람가" id="admission" required><br/>
                        
                            <label for="price"><b>가격</b></label>
                            <textarea style="width:240px; height:60px;" placeholder="일반(만 19세 이상) : 00,000원 &#13;&#10청소년(만 13세-18세) : 00,000원 &#13;&#10어린이(36개월-12세) : 00,000원 " 
                            		id="price" wrap="soft" required></textarea><br/>
                        
                            <label for="host"><b>주최</b></label>
                            <input type="text" placeholder="전시회 주최" id="host" required><br/>
                        
                            <label for="management"><b>주관</b></label>
                            <input type="text" placeholder="전시회 주관" id="management" required><br/>
                        
                            <label for="inquiry"><b>문의</b></label>
                            <input type="text" placeholder="00-000-0000" id="inquiry" required><br/>
              				<br>
                            <div id="btn-group" class="clearfix" style="text-align: center">
                              <button type="submit" id="add-btn" class="signupbtn">전시회 등록</button>
                              <button type="button" class="cancel-btn">취소</button>
                            </div>
                          </div>
                      </form>
                  </div>
              </div>
          </div>
      </div>       
  </section>


<script>
$('#add-btn').click(function() {shw.add(`${ctx}`)})
</script>  

</body>
</html>