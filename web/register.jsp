<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jingyu
  Date: 2017/8/31
  Time: 20:28
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
    <body>
        <form width="500" border="1" align="center" action="register.action">
            <table style="color: white;font-size: 18px;position:relative;top:167px;left:35%;">
                <tr>
                    <td>昵 称 &nbsp;&nbsp;</td>
                    <td><input style="border-radius: 3px" name="nickname" type="text" id="nickname" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>真 实 姓 名 &nbsp;&nbsp;</td>
                    <td><input style="border-radius: 3px" name="realname" type="text" id="realname" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>性 别 &nbsp;&nbsp;</td>
                    <td>
                        <label><input name="gender" type="radio" value="0" />男 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <label><input name="gender" type="radio" value="1" />女 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <label><input name="gender" type="radio" value="2" />其他 </label>
                    </td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>联 系 方 式 &nbsp;&nbsp;</td>
                    <td><input style="border-radius: 3px" name="phone" type="text" id="phone" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>地 址</td>
                    <td><input style="border-radius: 3px" name="address" type="text" id="address" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>密 码</td>
                    <td><input style="border-radius: 3px" name="password" type="text" id="password" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>确 认 密 码</td>
                    <td><input style="border-radius: 3px" name="confirmpassword" type="text" id="confirmpassword" size="40" /></td>
                </tr>
            </table>
            <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:5px;position: relative;top:220px;left:-50px;padding-left:20px;padding-right:20px;"
                   type="submit" value="注册" />&nbsp;&nbsp;&nbsp;&nbsp;
            <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;ont-size:15px;padding:5px;position: relative;top:220px;left:59px;padding-left:20px;padding-right:20px;"
                   type="button" value="返回"  onclick="javascript :history.back(1);"/>
        </form>
    </body>
</html>
