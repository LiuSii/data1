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
        <link rel="icon" type="image/x-icon" href="image/logo.png"/>
        <style type="text/css">
            body {background-image: url(image/bg.png);}<!--添加背景图片-->
        </style>
    </head>
    <body>
        <table width="800" border="1"  style="background-color: rgba(0,0,0,0.5);border-color:white;position: absolute;top: 10%; left:20%;font-size: 15px;">
            <% int i = 0;%>
            <s:iterator value="orders" status="li">
                <% i = i + 1;%>
                <tr style="background-color:rgb(255,186,0);">
                    <td width="125" height="40" style="color:black;font-weight: 900;" align="center">【订单编号】 <s:property value="order_id"/></td>
                    <td style="color:black;font-weight: 900;" width="350px" align="center"> 请用【支付宝】扫一扫支付</td>
                    <td style="color:black" width="100px">&nbsp;</td>
                </tr>
                <tr>
                    <td width="300" height="200" style="color:white;padding-left:50px;">
                        <br>
                        【商品名称】 <s:property value="goods_name"/><br>
                        【店铺名称】 <s:property value="store_name"/><br>
                        【商品数量】 <s:property value="order_amount"/><br>
                        【商品总价】 <s:property value="order_price"/><br><br>
                        【买家姓名】 <s:property value="user_name"/><br>
                        【买家地址】 <s:property value="user_address"/><br>
                        【联系方式】 <s:property value="user_phone"/><br><br>
                        <span style="color:red;">【订单状态】
                              <s:if test="order_status == 1 ">未支付</s:if>
                                <s:if test="order_status == 2 ">未发货</s:if>
                                <s:if test="order_status == 3 ">配送中</s:if>
                                <s:if test="order_status == 4 ">已签收</s:if>
                                <s:if test="order_status == 5 ">已确认收货</s:if>
                                <s:if test="order_status == 6 ">已取消</s:if>
                        </span>
                        <br><br>
                    </td>
                    <td style="color:white" width="349" align="center"><img src="image/alipay.jpg" width="150" height="150" /></td>
                    <td style="color:white" width="400" align="center">
                        【剩余支付时间】<s:property value="order_timeToPay"/><br>
                        【剩余到达时间】<s:property value="order_timeToGet"/><br><br>
                        <form action="<s:if test='order_status == 1 '>pay<s:else>get</s:else></s:if>">
                            <input type="hidden" name="order_id" value="<s:property value='order_id'/>">
                            <input type="submit" value="<s:if test='order_status == 1 '>确认付款</s:if><s:if test='order_status == 2 '>确认收货</s:if><s:if test='order_status == 6 || order_status == 5'>已完成</s:if>"><br>
                        </form>
                       <form action="cancle">
                           <input type="hidden" name="order_id" value="<s:property value='order_id'/>">
                           <input type="button" value="取消订单" id="yes<%=i%>"/>
                       </form>
                    </td>
                </tr>
                <tr style="height:20px;"></tr>
            </s:iterator>
        </table>
        <div align="center" style="position: fixed;top: 11%;left:2%;">
            <form action="showmyinfo.action">
                <input type="hidden" value="1" name="user_id"/>
                <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑';"
                       name="input" type="submit" value="我的信息" />
            </form>
            <form action="orderlist.action">
                <input type="hidden" value="1" name="user_id"/>
                <input style="color: rgb(255,186,0); background-color: #ffffff; border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑'"
                       name="input" type="submit" value="我的订单"/>
            </form>
            <form action="goodslist.action">
                <input style="color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:10px;font-family: '微软雅黑'"
                       name="input" type="submit" value="进入商城" />
            </form>
        </div>
        <div style="background-color: #ffba00;display: inline-block;width: 19px;text-align: center; height: 20px;border-radius: 10px;position: absolute;top: 10%;left: 96%;font-weight: 900;color: white;"><a href="index.jsp" style="color: white;text-decoration: none;">×</a></div>
    <script>
        function confirm(i) {
            if(window.confirm('确定要取消订单吗？')){
                document.getElementById("yes"+i).setAttribute(type,"submit");
                return true;
            }
            else
                return false;
        }
    </script>
    </body>
</html>
