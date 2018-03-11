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
        <%--<h1 style="color:white;font-size:40px;font-weight: 900;padding:5px;position: absolute;top: 30px;left:49%;background-color: rgba(0,0,0,0.5);" align="center">增加新商品</h1>--%>
        <div style="position: absolute;top:14%;left:30%;padding:50px;padding-top:50px;padding-bottom:20px;border-radius: 10px;">
            <form width="500" border="1" align="center" action="updategoods.action">
                <s:iterator value="goods">
                    <input type="hidden" name="goods_id" value="<s:property value='goods_id'/>">
                <table style="color: white;">
                    <tr>
                        <td>商品名称&nbsp;</td>
                        <td><input  style="border-radius: 3px" name="goods_name" type="text" id="goods_name" size="50" value="<s:property value='goods_name'/>"/></td>
                    </tr>
                    <tr style="height:10px;"></tr>
                    <tr>
                        <td>商品类型</td>
                        <td><input  style="border-radius: 3px" name="goods_type" type="text" id="goods_type" size="50" value="<s:property value='goods_type'/>"/></td>
                    </tr>
                    <tr style="height:10px;"></tr>
                    <tr>
                        <td>数量</td>
                        <td><input  style="border-radius: 3px" name="goods_amount" type="text" id="goods_amount" size="50" value="<s:property value='goods_amount'/>"/></td>
                    </tr>
                    <tr style="height:10px;"></tr>
                    <tr>
                        <td>店铺编号</td>
                        <td><input  style="border-radius: 3px" name="store_id" type="text" id="store_id" size="50" value="<s:property value='store_id'/>"/></td>
                    </tr>
                    <tr style="height:10px;"></tr>
                    <tr>
                        <td>商品单价</td>
                        <td><input  style="border-radius: 3px" name="goods_price" type="text" id="goods_price" size="50" value="<s:property value='goods_price'/>"/></td>
                    </tr>
                    <tr style="height:10px;"></tr>
                    <tr>
                        <td>商品折扣</td>
                        <td><input  style="border-radius: 3px" name="goods_discount" type="text" id="goods_discount" size="50" value="<s:property value='goods_discount'/>"/></td>
                    </tr>
                    <tr style="height:10px;"></tr>
                    <tr>
                        <td>商品描述</td>
                        <td><input  style="border-radius: 3px" name="goods_describe" type="text" id="goods_describe" size="50" value="<s:property value='goods_describe'/>"/></td>
                    </tr>
                </table>
                </s:iterator>

                <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:5px;position: relative;top:50px;left:-50px;padding-left:20px;padding-right:20px;"
                       type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;
                <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;ont-size:15px;padding:5px;position: relative;top:50px;left:59px;padding-left:20px;padding-right:20px;"
                       type="button" value="返回" onclick="javascript :history.back(1);"/>
            </form>
        </div>
        </br>
        <div style="background-color: #ffba00;display: inline-block;width: 19px;text-align: center; height: 20px;border-radius: 10px;position: absolute;top: 10%;left: 96%;font-weight: 900;color: white;"><a href="index.jsp" style="color: white;text-decoration: none;">×</a></div>
    </body>
</html>
