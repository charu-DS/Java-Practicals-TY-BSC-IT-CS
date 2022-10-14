<%-- 
    Document   : login
    Created on : 19 Sep, 2022, 6:34:38 AM
    Author     : Charu Saraswat
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             String n=request.getParameter("t1");
             String pass=request.getParameter("pass");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            PreparedStatement ps=c.prepareStatement("select * from login where name=? and  pwd=? ");
            ps.setString(1, n);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
           if(rs.next()){
               RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
               rd.include(request,response);
           }
           else{
               out.println("wrong credentials");
           }
            %>
    </body>
</html>
