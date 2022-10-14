<%-- 
    Document   : server
    Created on : 19 Sep, 2022, 7:47:51 PM
    Author     : Charu Saraswat
--%>

<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"  import="javax.persistence.*,p1.employee " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String no,name,age,des,sal;
            no=request.getParameter("t1");
           name= request.getParameter("name");
            age=request.getParameter("age");
            des=request.getParameter("des");
            sal=request.getParameter("salary");
            EntityManagerFactory ef = Persistence.createEntityManagerFactory("ex_jpa");
            EntityManager em = ef.createEntityManager();
           
            em.getTransaction().begin();
            employee e1=new employee();
            e1.setNo(no);
            e1.setName(name);
            e1.setAge(age);
            e1.setDes(des);
            e1.setSal(sal);
            em.persist(e1);
            em.getTransaction().commit();
            em.close();
            ef.close();
        
        %>
    </body>
</html>
