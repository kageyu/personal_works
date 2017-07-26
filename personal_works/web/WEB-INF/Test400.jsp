<%-- 
    Document   : Test400
    Created on : 2017/07/22, 13:27:24
    Author     : kageyu
--%>

<%@page import="Test400.Test400Beans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>

<%
    HttpSession hs = request.getSession();
    Test400Beans T400B = (Test400Beans)hs.getAttribute("Test400Beans");
    
    int x = (Integer)hs.getAttribute("x");
    int y = (Integer)hs.getAttribute("y");
    int xy = (Integer)hs.getAttribute("xy");
    boolean tf = (Boolean)hs.getAttribute("tf");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2桁の掛け算練習</title>
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
                <input type="text" name="ans" value="" size="10" maxlength="3" pattern="[0-9０-９]+$" title="整数を入力してください">
                <input type="submit" name="btnSubmit" value="次へ">
            </form>
        </h1>
    </body>
</html>
