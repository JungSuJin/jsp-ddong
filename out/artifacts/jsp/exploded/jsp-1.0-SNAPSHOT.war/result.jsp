<%--
  Created by IntelliJ IDEA.
  User: imcts
  Date: 2016. 10. 16.
  Time: PM 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="jsp.DataBean" %>
<%@ page import="jsp.Student" %>
<jsp:useBean id="databean" class="jsp.DataBean" scope="request" />

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        ${databean.testConvert(paramValues.name, paramValues.gender, paramValues.kor, paramValues.eng, paramValues.math)}

        <c:forEach items="${databean.getRankingOrder()}" var="student">
            name: ${student.name} <br>
            gender: ${student.gender} <br>
            kor: ${student.kor} <br>
            eng: ${student.eng} <br>
            math: ${student.math} <br>
            sum: ${student.sum} <br>
            avg: ${student.avg} <br>
            rank: ${student.rank} <br>

            <br>
        </c:forEach>
    </body>
</html>
