<%--
  Created by IntelliJ IDEA.
  User: jingyu
  Date: 2017/8/31
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>李老师零食乌托邦</title>
        <style type="text/css">
            body {background-image: url(image/bg.png);}<!--添加背景图片-->
        </style>
    </head>
    <body>
        <form width="500" border="1" align="center" action="newuser.action">
            <table style="color: white;font-size: 18px;position:relative;top:167px;left:35%;">
                <tr>
                    <td>昵称</td>
                    <td><input style="border-radius: 3px" name="nickname" type="text" id="nickname" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>真实姓名&nbsp;</td>
                    <td><input style="border-radius: 3px" name="realname" type="text" id="realname" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>性 别 &nbsp;&nbsp;</td>
                    <td>
                        <label><input name="gender" type="radio" value="0" />男 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <label><input name="gender" type="radio" value="1" />女 </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <label><input name="gender" type="radio" value="2" />其他 </label>
                    </td>
                </tr>

                <tr style="height:10px;"></tr>
                <tr>
                    <td>联系方式</td>
                    <td><input style="border-radius: 3px" name="phone" type="text" id="phone" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>地址</td>
                    <td><input style="border-radius: 3px" name="address" type="text" id="address" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>密码</td>
                    <td><input style="border-radius: 3px" name="password" type="password" id="password" size="40" /></td>
                </tr>
                <tr style="height:10px;"></tr>
                <tr>
                    <td>确 认 密 码</td>
                    <td><input style="border-radius: 3px" name="confirmpassword" type="password" id="confirmpassword" size="40" /></td>
                </tr>
            </table>

            <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:5px;position: relative;top:220px;left:-50px;padding-left:20px;padding-right:20px;"
                   type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
            <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;ont-size:15px;padding:5px;position: relative;top:220px;left:59px;padding-left:20px;padding-right:20px;"
                   type="button" value="返回" onclick="javascript :history.back(1);"/>
        </form>
        </div>
        </br>
        <div style="background-color: #ffba00;display: inline-block;width: 19px;text-align: center; height: 20px;border-radius: 10px;position: absolute;top: 10%;left: 96%;font-weight: 900;color: white;"><a href="index.jsp" style="color: white;text-decoration: none;">×</a></div>

    </body>
</html>
