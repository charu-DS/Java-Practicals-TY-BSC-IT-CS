<%-- Document   : intrinsicobj Created on : 14 Aug, 2022, 9:04:27 PM Author : Charu Saraswat --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Intrinsic Objs</title>
    <h2> Intrinsic Objects In JSP </h2>
    
        <% out.println("Today is:"+java.util.Calendar.getInstance().getTime()); 
        out.println(" "); %>
        <br>
       <%
        String name=request.getParameter("t1");
        int age=Integer.parseInt(request.getParameter("age"));
        out.println("Welcome   "+name+ "!");
        out.println(" ");
        out.println(" ");
        out.println("        Your age is "+age);
        
        %>  
    </head>
    <body>
</html>