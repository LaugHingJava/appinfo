<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/16 0016
  Time: 0:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body class="login">
  <div>

    <div class="login_wrapper">
      <div class="animate form login_form">
        <section class="login_content">
          <form>
            <h1>APP信息管理系统</h1>
            <div>
              <a class="btn btn-default submit" href="index.html">后台管理入口</a>
              <a class="reset_pass" href="${path}/devUser/devLogin">开发者平台入口</a>
            </div>
          </form>
        </section>
      </div>
    </div>
  </div>
  </body>
</html>
