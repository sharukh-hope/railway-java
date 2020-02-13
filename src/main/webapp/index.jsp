<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <form action="${pageContext.request.contextPath}/PassengerController" method="POST"> --%>
<!--   <div class="container"> -->
<!--     <h1>Sign Up</h1> -->
<!--     <p>Please fill in this form to create an account.</p> -->
<!--     <hr> -->
<!--     <label for="Fname"><b>First Name</b></label> -->
<!--     <input type="text"  name="Fname" ><br> -->
    
<!--     <label for="Lname"><b>Last Name</b></label> -->
<!--     <input type="text" name="Lname" ><br> -->

<!--     <label for="age"><b>Age</b></label> -->
<!--     <input type="text"  name="dob" ><br> -->
    
<!--     <label for="PhNum"><b>Phone Number</b></label> -->
<!--     <input type="text"  name="PhNum" ><br> -->
    
<!--     <label for="AlNum"><b>Alternate Number</b></label> -->
<!--     <input type="text"  name="AlNum"><br> -->

<!--     <label for="email"><b>Email</b></label> -->
<!--     <input type="text"  name="email" ><br> -->

<!--     <label for="psw"><b>Password</b></label> -->
<!--     <input type="password"  name="psw" ><br> -->

<!--     <label for="psw-repeat"><b>Confirm Password</b></label> -->
<!--     <input type="password"  name="psw-repeat" ><br> -->

<!--     <label> -->
<!--       <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me -->
<!--     </label> -->

    
<!--       <button type="submit" class="signupbtn">Sign Up</button> -->
<!--   </div> -->
<!-- </form> -->

	<table border=2>
	<tr>
	<th>Passenger ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
	<th>EMAIL</th>
	<th>Password</th>
	<th>Phone Number</th>
	<th>Alternate Number</th>
	</tr>
	<c:forEach items = "${list }" var="PassengerTable">
	<tr>
	<td>${PassengerTable.id }</td>
	<td>${PassengerTable.fname }</td>
	<td>${PassengerTable.lname }</td>
	<td>${PassengerTable.dob }</td>
	<td>${PassengerTable.email }</td>
	<td>${PassengerTable.password }</td>
	<td>${PassengerTable.phoneNumber }</td>
	<td>${PassengerTable.alternateNumber }</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>