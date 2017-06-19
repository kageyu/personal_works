<%-- 
    Document   : Test400
    Created on : 2017/06/19, 15:26:20
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>

<%
    HttpSession hs = request.getSession();
    int x = (Integer)hs.getAttribute("x");
    int y = (Integer)hs.getAttribute("y");
    int xy = (Integer)hs.getAttribute("xy");
    boolean tf = (Boolean)hs.getAttribute("tf");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>400マス計算</title>
    </head>
    <body onLoad="document.ans_form.ans.focus()">
        <h1>
            <%
                if(xy == -1){
                   out.print("よろしくお願いします<br><br>"); 
                }else if(tf){
                    out.print("正解です<br><br>");
                }else{
                    out.print("不正解です<br>正解は "+xy+" です<br>");
                }
            %>
            <form action="Test400" method="POST" name="ans_form">
                <%= x+" × "+y+" ＝ "%>
                <input type="text" name="ans" value="" size="10" maxlength="3">
                <input type="submit" name="btnSubmit" value="次へ">
            </form>
        </h1>
    </body>
</html>
