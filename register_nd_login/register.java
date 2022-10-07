
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Charu Saraswat
 */
@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
          if(request.getParameter("Submit")!=null){
              String un=request.getParameter("t1");
              String pwd=request.getParameter("t2");
              String mail = request.getParameter("mail");
              String country=request.getParameter("country");
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
             PreparedStatement ps=c.prepareStatement("insert into register values(?,?,?,?)");
             ps.setString(1,un);
             ps.setString(2,pwd);
             ps.setString(3,mail);
             ps.setString(4,country);
             int i=ps.executeUpdate();
           
             if(i>0){
                 out.println("data saved");
             }
             else{
                 out.println("nothing to save");
             }
           
              
          }
        }
        catch(Exception e){
            out.println("Exception "+e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
