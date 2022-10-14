<html>
    <head>
        <title>Redirect</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <h3>Page Redirected Successfully! </h3>
        Name <% out.println(request.getParameter("uname")+"<br>"); %>
        Age  <% out.println(request.getParameter("age")+"<br>"); %>
        Hobbies:  
         <% 
        if(request.getParameter("football")!=null){
        out.println(request.getParameter("football")+"<br>");
        }
         if(request.getParameter("Coding")!=null){
        out.println(request.getParameter("Coding")+"<br>");
        }       
          if(request.getParameter("gender")!=null){
              out.println("Gender: ");
                 out.println(request.getParameter("gender")+"<br>");
              } 
         
        %>
                 Email: 
                 <%  
                  out.println(request.getParameter("email")+"<br>"); 
                 %>
     
    </body>
</html>
