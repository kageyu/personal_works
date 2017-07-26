<%-- 
    Document   : prime_numbers
    Created on : 2017/07/18, 9:59:12
    Author     : kageyu
--%>

<%@page import="PrimeNumbers.PrimeNumbersBeans"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession hs = request.getSession();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PrimeNumbers</title>
    </head>
    <body onLoad="document.ans_form.ans.focus()">
        <form action="PrimeNumbers" method="POST" name="ans_form">
            <input type="text" name="ans" value="" size="10" maxlength="10" placeholder="X" pattern="[0-9０-９]+$" title="自然数（正の整数）を入力してください">
            
            <input type="submit" name="btnSubmit" value="番目の素数は？">
        </form>
        
        
        <% if (hs.getAttribute("PNB") != null) {
            PrimeNumbersBeans PNB = (PrimeNumbersBeans)hs.getAttribute("PNB");%>
            <%= PNB.getAns()%>番目の素数は
            <%if(PNB.getAns()==0){%>
                ありません
            <%}else{%>
                <%= PNB.getLastPN()%>
            <%}%>
            <br><br>

            チェック項目数(仮)：<%= PNB.getRoops().size() %><br>
            演算回数：<%= PNB.getRoopsSum() %><br>
            各整数ごとに素数かチェックするためにループした回数：<br>
            <%for (int roop : PNB.getRoops()) {%>
                <%= roop + " "%>
            <% }%><br>
        <% } %>
    </body>
</html>
