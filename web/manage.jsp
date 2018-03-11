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
    <body background="image/bg.png">
        <div align="center" style="position: relative;top: 30%;">
            <form action="userlist.action" style="display: inline-block;">
                <input type="hidden" value="0" name="flag">
                <input type="hidden" value="1" name="user_id"/>
                <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:20px;padding:60px;padding-top:70px;padding-bottom:70px;font-family: '微软雅黑';"
                       name="input" type="submit" value="管 理 用 户" />
            </form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <form action="managegoodslist.action" style="display: inline-block;">
                <input type="hidden" value="0" name="flag">
                <input type="hidden" value="1" name="user_id"/>
                <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;font-size:20px;padding:60px;padding-top:70px;padding-bottom:70px;font-family: '微软雅黑'"
                       name="input" type="submit" value="管 理 商 品"/>
            </form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <form action="manageorderlist.action" style="display: inline-block;">
                <input type="hidden" value="0" name="flag">
                <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:20px;padding:60px;padding-top:70px;padding-bottom:70px;font-family: '微软雅黑'"
                       name="input" type="submit" value="管 理 订 单" />
            </form>
        </div>
        <div style="background-color: #ffba00;display: inline-block;width: 19px;text-align: center; height: 20px;border-radius: 10px;position: absolute;top: 10%;left: 96%;font-weight: 900;color: white;"><a href="index.jsp" style="color: white;text-decoration: none;">×</a></div>    </body>
</html>
