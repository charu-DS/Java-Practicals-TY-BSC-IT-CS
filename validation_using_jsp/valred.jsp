<html>
    <head>
        <title>JSP Validations</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <%
            String error="";
            
        if(request.getParameter("redirect")!=null){
            if(request.getParameter("uname").equals("")){
                error+="Name is Blank Yet!<br>";
            }
             if(request.getParameter("age").equals("")){
                error+="Age is Blank Yet!<br>";
            }
            
              if(request.getParameter("football")==null && request.getParameter("Coding")==null){
                error+="Select atleast one hobby!<br>";
            }
               if(request.getParameter("email").equals("")){
                error+="Email is Blank Yet!<br>";
            }
                if(error.length()>0){
                    out.println(error);
                }
                else{
                    response.sendRedirect("redirect.jsp?"+request.getQueryString());
                }
        }
               
        
        %>
        <form>
        <h3>JSP Validations & Send Redirect</h3>
        Name <input type="text" name="uname"><br><br>
        Age <input type="text" name="age"><br><br>
        Hobbies<br>
        Football <input type="checkbox" value="football" name="football">
        Coding <input type="checkbox" value="Coding" name="Coding">
        Chanting <input type="checkbox" value="Chanting" name="Chanting"><br><br>
        E-mail <input type="email" name="email"><br><br>
        Gender<br>
        Female<input type="radio" name="gender" value="female" checked> 
        Male <input type="radio" name="gender" value="male"><br> <br>
        <input type="submit" name="redirect" value="Redirect">
        </form>
    </body>
</html>
