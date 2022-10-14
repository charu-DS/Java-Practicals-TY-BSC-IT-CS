<%-- 
    Document   : register
    Created on : 19 Sep, 2022, 6:28:08 AM
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
            try{
                String n=request.getParameter("t1");
                String un=request.getParameter("t2");
                String pass=request.getParameter("pass");
                String rp=request.getParameter("re-enter");
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                PreparedStatement ps=c.prepareStatement("insert into login values (?,?,?)");
                ps.setString(1, n);
                 ps.setString(2, un);
                  ps.setString(3, pass);
               int i=   ps.executeUpdate();
               if(i>0){
                   out.println("Data Saved");
               }
               else{
                   out.println("Nothing to save");
               }
                  
                
            }
            catch(Exception e){
                out.println("Exception "+e);
            }
            %>
    </body>
</html>
