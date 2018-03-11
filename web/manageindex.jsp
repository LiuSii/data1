<%--<%@ taglib prefix="s" uri="/struts-tags" %>--%>

<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: jingyu--%>
  <%--Date: 2017/8/31--%>
  <%--Time: 21:02--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>李老师零食乌托邦</title>--%>
    <%--<style type="text/css">--%>
        <%--body {background-image: url(image/diamond.jpg);}<!--添加背景图片-->--%>
    <%--</style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table width="1000" border="1"  align="center" style="color:white;background-color: rgba(0,0,0,0.5);border-color:white;position: absolute;top: 5%; left:12%;">--%>
    <%--<tr style="font-size:20px;font-weight:900;">--%>
        <%--<td>用户编号</td>--%>
        <%--<td>用户昵称</td>--%>
        <%--<td>真实姓名</td>--%>
        <%--<td>性别</td>--%>
        <%--<td>地址</td>--%>
        <%--<td>联系方式</td>--%>
    <%--</tr>--%>
    <%--<s:iterator value="users" status="li">--%>
        <%--<tr>--%>
            <%--<td><s:property value="user_id"/> </td>--%>
            <%--<td><s:property value="user_nickname"/></td>--%>
            <%--<td><s:property value="user_name"/></td>--%>
            <%--<td><s:property value="user_gender"/></td>--%>
            <%--<td><s:property value="user_address"/></td>--%>
            <%--<td><s:property value="user_phone"/></td>--%>
            <%--<td>--%>
                <%--<form action="showsingleuser">--%>
                    <%--<input type="hidden" value="<s:property value='user_id'/>" name="user_id">--%>
                    <%--<s:submit value="修改" />--%>
                <%--</form>--%>
                <%--<form action="deleteuser">--%>
                    <%--<input type="hidden" value="<s:property value='user_id'/>" name="user_id">--%>
                    <%--<s:submit value="删除" />--%>
                <%--</form>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</s:iterator>--%>
    <%--<a href="managenewuser.jsp">新增</a>--%>
    <%--&lt;%&ndash;<s: value="增加" href="managenewuser.jsp"/>&ndash;%&gt;--%>

<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="button" uri="/struts-tags" %>

<%--
  Created by IntelliJ IDEA.
  User: jingyu
  Date: 2017/8/31
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>李老师零食乌托邦</title>
        <link rel="icon" type="image/x-icon" href="image/logo.png"/>
        <style type="text/css">
            body {background-image: url(image/bg.png);}<!--添加背景图片-->
        </style>
    </head>
    <table width="1000px" border="1"  align="center" style="color:white;background-color: rgba(0,0,0,0.5);border-color:white;position: relative;top:50px">
        <tbody align="center">
        <tr style="font-size:20px;font-weight:900;white-space: nowrap;">
            <%--<!--<td><s:property value="user_nickname"></s:property></td>-->--%>
            <td>用户编号</td>
            <td>用户昵称</td>
            <td>真实姓名</td>
            <td>性别</td>
            <td>地址</td>
            <td>联系方式</td>
            <td>
                <div style="font-family:微软雅黑;color:rgb(255, 186, 0);">
                    <a href="managenewuser.jsp" style="color:white; ">新增</a>
                </div>
            </td>
        </tr>
        <s:iterator value="users" status="li">
            <tr>
                <td> <s:property value="user_id"/> </td>
                <td> <s:property value="user_nickname"/> </td>
                <td> <s:property value="user_name"/> </td>
                <td> <s:if test="user_gender == 0" >男</s:if> <s:if test="user_gender == 1" >女</s:if> <s:if test="user_gender == 2" >其他</s:if></td>
                <td> <s:property value="user_address"/> </td>
                <td> <s:property value="user_phone"/> </td>
                <td>
                    <br>
                    <form action="showsingleuser">
                        <div style="font-family:微软雅黑;font-size:20px">
                            <input type="hidden" value="<s:property value='user_id'/>" name="user_id" >
                            <button type="submit" value="修改">修改</button>
                        </div>
                    </form>
                    <form action="deleteuser">
                        <div style="font-family:微软雅黑;font-size:20px"><input type="hidden" value="<s:property value='user_id'/>" name="user_id">
                            <button type="submit" value="删除">删除</button>
                        </div>
                    </form>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>

    <div align="center" style="position: fixed;top: 11%;left:2%;">
        <form action="userlist.action">
            <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑'"
                   name="input" type="submit" value="管理用户" />
        </form>
        <form action="managegoodslist.action">
            <input type="hidden" value="1" name="user_id"/>
            <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑';"
                   name="input" type="submit" value="管理商品" />
        </form>
        <form action="manageorderlist.action">
            <input type="hidden" value="1" name="user_id"/>
            <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑'"
                   name="input" type="submit" value="管理订单"/>
        </form>
    </div>
    <div style="background-color: #ffba00;display: inline-block;width: 19px;text-align: center; height: 20px;border-radius: 10px;position: absolute;top: 10%;left: 96%;font-weight: 900;color: white;"><a href="index.jsp" style="color: white;text-decoration: none;">×</a></div>

    </body>
</html>
