<%@ taglib prefix="s" uri="/struts-tags" %>

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
        <style type="text/css">
            body {background-image: url(image/bg.png);}<!--添加背景图片-->
        </style>
    </head>
    <body>>
        <table width="1050px" border="1"  align="center" style="color:white;background-color: rgba(0,0,0,0.5);border-color:white;position: relative;top: 50px;">
            <tbody align="center">
            <tr style="font-size:20px;font-weight:900;">
                <td>商品编号</td>
                <td>商品名称</td>
                <td>商品类型</td>
                <td>数量</td>
                <td>店铺编号</td>
                <td>商品单价</td>
                <td>商品折扣</td>
                <td>商品描述</td>
                <td>上架时间</td>
                <td>销售量</td>
                <td>
                    <div style="color: white;font-family: '微软雅黑'"><a href="managenewgoods.jsp" style="color:white;">新增</a></div>
                </td>
            </tr>
            <s:iterator value="goods" status="li">
                <tr>
                    <td><s:property value="goods_id"/> </td>
                    <td><s:property value="goods_name"/></td>
                    <td><s:property value="goods_type"/></td>
                    <td><s:property value="goods_amount"/></td>
                    <td><s:property value="store_id"/></td>
                    <td><s:property value="goods_price"/></td>
                    <td><s:property value="goods_discount"/></td>
                    <td><s:property value="goods_describe"/></td>
                    <td><s:property value="goods_upTime"/></td>
                    <td><s:property value="goods_saleAmount"/></td>
                    <td>
                        <br>
                        <form action="showsinglegoods">
                            <div style="font-family:微软雅黑;font-size:20px">
                                <input type="hidden" value="<s:property value='goods_id'/>" name="goods_id">
                                <button type="submit" value="修改">修改</button>
                            </div>
                        </form>

                        <form action="deletegoods">
                            <input type="hidden" value="<s:property value='goods_id'/>" name="goods_id">
                            <button type="submit"  value="删除" >删除</button>
                        </form>
                    </td>
                </tr>
            </s:iterator>

            <%--<s: value="增加" href="managenewuser.jsp"/>--%>
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
