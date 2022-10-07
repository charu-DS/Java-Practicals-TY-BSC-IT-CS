import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/** @author Charu Saraswat */

@WebServlet(urlPatterns = {"/prac1"})
public class prac1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
           int n=Integer.parseInt(request.getParameter("t1"));
           int m=Integer.parseInt(request.getParameter("t2"));
           if (request.getParameter("add")!=null){
               int add=n+m;
               out.println("Addition is "+add);
           }
            if (request.getParameter("subtract")!=null){
               int sub=n-m;
               out.println("Subtract is "+sub);
           }
             if (request.getParameter("multiply")!=null){
               int mul=n*m;
               out.println("Multiplication is "+mul);
           }
              if (request.getParameter("divide")!=null){
               int d=n/m;
               out.println("Division is "+d);
           }
        }
        catch(Exception e){
            out.println("Exception"+e);
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
