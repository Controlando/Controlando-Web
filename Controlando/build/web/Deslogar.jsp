<%-- 
    Document   : Deslogar
    Created on : 21/07/2018, 20:02:13
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String senha = (String) session.getAttribute("password");
    System.err.println(senha);
    session.invalidate();
    out.println(senha);
    response.sendRedirect("telaInicial.html");
%>