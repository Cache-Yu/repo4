<%--
  Created by IntelliJ IDEA.
  User: 85700
  Date: 2018/11/19
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>执行成功啦</h3>

<br/>
<c:forEach items="${list}" var="account">
  ${account.name}<br/>
    ${account.money}<br/>

</c:forEach>
</body>
</html>
