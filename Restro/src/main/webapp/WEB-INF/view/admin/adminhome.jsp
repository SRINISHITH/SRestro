<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<a href = "manageadmincategory"> manage category</a>

<a href = "manageadminsupplier"> manage category</a>
<a href = "manageadminproduct"> manage category</a>

<jsp:include page="admincategory.jsp"></jsp:include>
<jsp:include page="adminsupplier.jsp"></jsp:include>
<jsp:include page="adminproduct.jsp"></jsp:include>
<c:if test= "${is admin clicked managecategory== true}">
<jsp:include page="admincategory.jsp"></jsp:include>
</c:if>
<c:if test= "${is admin clicked managesupplier== true}">
<jsp:include page="adminsupplier.jsp"></jsp:include>
</c:if>
<c:if test= "${is admin clicked manageproduct-menu== true}">
<jsp:include page="adminproduct.jsp"></jsp:include>
</c:if>

</body>
</html>