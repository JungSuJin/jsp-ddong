<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
      <title>껜세이 색끼들 !! </title>
      <style type="text/css">
          .input-name {
              width: 50px;
          }

          .input-default {
              width: 100px;
          }
      </style>
  </head>
  <body>
      <form method="get" action="./result.jsp">
          <ul>
              <c:forEach begin="0" end="2" var="i">
                  <li>
                      <input class="input-name" type="text" name="name" value="name${i}">
                      <input class="input-default" type="text" name="gender" value="${i % 2 == 0 ? '여자' : '남자'}">
                      <input class="input-default" type="text" name="kor" value="${40 + i}">
                      <input class="input-default" type="text" name="eng" value="${50 + i}">
                      <input class="input-default" type="text" name="math" value="${60 + i}">
                      <br>
                  </li>
              </c:forEach>
          </ul>

          <button type="submit">전송</button>
      </form>
  </body>
</html>

