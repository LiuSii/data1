<%--
  Created by IntelliJ IDEA.
  User: xuebastar
  Date: 2017/8/30
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title></title>
        <link rel="icon" type="image/x-icon" href="image/logo.png"/>
    </head>
    <body background="image/51.png">
        <h1 style="position: absolute;top:150px;left:29%;font-family:微软雅黑;font-size:45px;color:rgb(255, 186, 0);">管理页面</h1>
        <s:form action="userlist">
            <s:submit value="submit"></s:submit>
        </s:form>
        <s:form action="managegoodslist">
            <s:submit value="submit"></s:submit>
        </s:form>
        <%--<s:form action="showmyinfo">--%>
            <%--<input type="hidden" name="user_id" value="1">--%>
            <%--<s:submit value="编辑个人信息"></s:submit>--%>
        <%--</s:form>--%>
    </body>
</html>