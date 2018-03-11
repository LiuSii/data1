<%--
  Created by IntelliJ IDEA.
  User: jingyu
  Date: 2017/8/31
  Time: 15:43
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
        <div style="position: absolute;top:25%;left:35%;">
            <form width="500" border="1" align="center" action="login.action">
                <table width="500" border="0" align="center" style="color: white;position: relative;top:70px;">
                    <tr>
                        <td>昵 称 &nbsp;&nbsp;</td>
                        <td><input style="border-radius: 3px" name="username" type="text" id="username" size="40" /></td>
                    </tr>
                    <tr style="height: 30px;"></tr>
                    <tr>
                        <td>密 码 &nbsp;&nbsp;</td>
                        <td><input style="border-radius: 3px" name="password" type="text" id="password" size="40" /></td>
                    </tr>
                </table>
                </br>
                <div align="center">
                    <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:5px;position: relative;top:134px;left:-50px;padding-left:20px;padding-right:20px;"
                           name="input" type="submit" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;
                    <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;font-size:15px;padding:5px;position: relative;top:134px;left:12px;padding-left:20px;padding-right:20px;"
                           name="input" type="button" value="返回"  onclick="javascript :history.back(1);"/>
                </div>
            </form>
        </div>
    </body>
</html>

