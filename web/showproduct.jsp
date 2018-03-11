<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jingyu
  Date: 2017/8/30
  Time: 15:52
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
    <table width="auto" border="1" align="center" style="color:white;font-size:15px;background-color: rgba(0,0,0,0.5);position:absolute;top:10%;left:27%">
        <%int i = 0;%>
        <s:iterator value="goods" status="li" id="goods">
            <%
                i = i + 1;
            %>
            <tr style="font-size: 20px;text-align: center;">
                <td width="auto">【商品信息】</td>
                <td width="100px">【商品图片】</td>
                <td></td>
            </tr>
            <tr>
                <td width="auto" height="auto">
                     &nbsp;【商品ID】<s:property value="goods_id"/><br>
                    &nbsp;【商品名称】<s:property value="goods_name"/><br>
                    &nbsp;【商品类型】<s:property value="goods_type"/><br><br>

                    &nbsp;【商店ID】<s:property value="store_id"/><br>
                    &nbsp;【商品总数】<s:property value="goods_amount"/><br>
                    &nbsp;【商品价格】<s:property value="goods_price"/><br>
                    &nbsp;【商品折扣】<s:property value="goods_discount"/><br><br>

                    &nbsp;【商品上架时间】<s:property value="goods_describe"/><br>
                    &nbsp;【商品销售总数】<s:property value="goods_saleAmount"/><br><br>
                </td>
                <td width="auto" align="center"><img src="image/<%=i%>.png"/></td>
                <td width="150px" style="text-align: center;">&nbsp;

                    <form action="readybuy">
                        <button style="display:inline-block;color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:5px;padding-left:20px;padding-right:20px;" type="button" onclick="firm(<%=i%>)" id="readybuy<%=i%>">购买</button>
                        <button style="display:none;color: white; background-color: rgb(255,186,0); border-radius: 5px;font-size:15px;padding:5px;padding-left:20px;padding-right:20px;" type="submit"  id="buy<%=i%>">购买</button>
                        <input type="hidden" name="goods_id" value="<s:property value='goods_id'/>">
                        <input type="text" name="buy_amount" id="buy_amount<%=i%>"  placeholder="请输入购买数量" style="display: none;margin-top: 25px;width: 120px;padding: 5px;border-radius: 3px;"/>
                    </form>
                </td>
            </tr>
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

    <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0" width="160" height="70" id="honehoneclock" align="middle" style="
    position: fixed;
    bottom: 2%;
    border-radius: 5px;
    left: 2%;
"><param name="allowScriptAccess" value="always"><param name="movie" value="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf"><param name="quality" value="high"><param name="bgcolor" value="#ffffff"><param name="wmode" value="transparent"><embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf" quality="high" bgcolor="#ffffff" width="160" height="70" name="honehoneclock" align="middle" allowscriptaccess="always" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer"></object>
    <script>
        function firm(i) {
            document.getElementById("buy_amount"+i).style.display= "inline-block";
            document.getElementById("readybuy"+i).style.display = "none";
            document.getElementById("buy"+i).style.display = "inline-block";
        }
    </script>
    </body>
</html>
