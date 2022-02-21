<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Welcome page</h1>

<%--<h1> title: ${products[0].title}</h1>--%>
<%--<h1> title: ${products[1].title}</h1>--%>


<ul>
    <c:forEach var="item" items="${products.products}">
        <li>title: ${item.title}</li>
        <li>cost:  ${item.cost}</li>
    </c:forEach>
</ul>

</body>
</html>