<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
				<table >
					<tr>
						<td>Tên</td>
						<td>Lớp</td>
						<td>Điểm toán</td>
						<td>Điểm lý </td>
						<td>Điểm hóa</td>
					</tr>
					
						<c:forEach items="${listResult}" var="st">
							<tr>
								<td>${st.getStudentName()}</td>
								<td>${st.getClassName()}</td>
								<td>${st.getMathPoint() }</td>
								<td>${st.getPhysicPoint() }</td>
								<td>${st.getChemPoint() }</td>
								
							</tr>
						</c:forEach>

					

				</table>
</body>
</html>