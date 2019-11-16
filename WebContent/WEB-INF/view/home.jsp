<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="bean.student"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>app quan ly hoc sinh</title>
	<style type="text/css">
	<%@include file="assets/css/style.css"%>
	<%@include file="assets/css/bootstrap.min.css" %>
	</style>
	
	<script type="text/javascript">
	<%@include file="assets/js/app.js" %>
	</script>


</head>
<body>
	<div class="logo">Ứng dụng quản lý học sinh</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">

				<h3>Thêm học sinh</h3>
				<h3><%=(request.getAttribute("masseger") != null) ? request.getAttribute("masseger") : " "%></h3>
				<form action="AddstudentController" name="form" method="post"  onsubmit="return validate()" >
					<p>Nhập tên :</p>
					<input type="text" name="name" placeholder="" onkeyup="validate()"><span class="ms" id="message1"></span>
					<br>					
					<p>Nhập điểm toán:</p>
					<input type="text" name="Point1" onkeyup="validate()"><span class="ms" id="message2"></span>
					<br>			
					<p>Nhập điểm lý :</p>
					<input type="text" name="Point2"onkeyup="validate()"><span class="ms" id="message3"></span>
					<br>
					<p>Nhập điểm hóa :</p>
					<input type="text" name="Point3"onkeyup="validate()"><span class="ms" id="message4"></span>
					<br> 
					Chọn lớp: <select
						name="dropdown_class">
						<c:forEach items="${listclass}" var="cl">
							<option value="${cl.classId}">${cl.className}</option>
						</c:forEach>
					</select> <input type="submit" name="submit" value="thêm học sinh" >
				</form>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<h3>Tìm kiếm học sinh</h3>

				<form  name="formsearch"  accept-charset="utf-8">
					<input type="text" name="name" placeholder="nhap ten hoc sinh...">
					<!--
					<select name="idclass">
						<c:forEach items="${listclass}" var="cl">
							<option value="${cl.classId}">${cl.className}</option>
						</c:forEach>
					</select> -->
					<input type="button" name="submit" value="tìm kiếm" onclick="ajax()" >
				</form>
				<br>
				<br>
				<div id ="result"></div>
				<div id="message"></div>
				
			</div>
	
	</div>
	</div>
</body>
</html>