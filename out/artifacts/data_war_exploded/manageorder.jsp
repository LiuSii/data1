<%--
  Created by IntelliJ IDEA.
  User: jingyu
  Date: 2017/8/31
  Time: 21:02
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
    <body>>
        <table width="1050px" border="1"  align="center" style="color:white;background-color: rgba(0,0,0,0.5);border-color:white;position: relative;top: 50px;">
            <tbody align="center">
            <tr style="font-size:20px;font-weight:900;">
                <td>订单编号</td>
                <td>商品编号</td>
                <td>商品名称</td>
                <td>店铺编号</td>
                <td>店铺名称</td>
                <td>购买数量</td>
                <td>购买总价</td>
                <td>用户编号</td>
                <td>用户姓名</td>
                <td>用户地址</td>
                <td>用户联系方式</td>
                <td>支付剩余时间</td>
                <td>订单状态</td>
                <td></td>
            </tr>
            <s:iterator value="orders" status="li">
                <tr>
                    <td><s:property value="order_id"/> </td>
                    <td><s:property value="goods_id"/></td>
                    <td><s:property value="goods_name"/></td>
                    <td><s:property value="store_id"/></td>
                    <td><s:property value="store_name"/></td>
                    <td><s:property value="order_amount"/></td>
                    <td><s:property value="order_price"/></td>
                    <td><s:property value="user_id"/></td>
                    <td><s:property value="user_name"/></td>
                    <td><s:property value="user_address"/></td>
                    <td><s:property value="user_phone"/></td>
                    <td><s:property value="order_timeToPay"/></td>
                    <td>
                        <s:if test="order_status == 1 ">未支付</s:if>
                        <s:if test="order_status == 2 ">未发货</s:if>
                        <s:if test="order_status == 3 ">配送中</s:if>
                        <s:if test="order_status == 4 ">已签收</s:if>
                        <s:if test="order_status == 5 ">已确认收货</s:if>
                        <s:if test="order_status == 6 ">已取消</s:if>
                    </td>
                    <td>
                        <form action="cancle.action">
                            <input type="hidden" name="flag" value="1">
                            <input type="hidden" value="<s:property value='order_id'/>" name="order_id">
                            <button type="submit"  value="删除" style="margin-top: 10px;">删除</button>
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
            <input style=" color: white; background-color: rgb(255,186,0);border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑'"
                   name="input" type="submit" value="管理订单"/>
        </form>
    </div>
    <div style="background-color: #ffba00;display: inline-block;width: 19px;text-align: center; height: 20px;border-radius: 10px;position: absolute;top: 10%;left: 96%;font-weight: 900;color: white;"><a href="index.jsp" style="color: white;text-decoration: none;">×</a></div>

    </body>
</html>
