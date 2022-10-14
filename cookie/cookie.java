import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** @author Charu Saraswat */
@WebServlet(urlPatterns = {"/cookie"})
public class cookie extends HttpServlet {
     static int count=0, c2=0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
         String u=request.getParameter("t1");
         Cookie c1=new Cookie("Count",String.valueOf(count));
         c2=Integer.parseInt(c1.getValue());
         if(c2==0){
             out.println("Welcome "+u+ "Visited First Time");
             count++;
         }
         else{
             c1=new Cookie("Count",String.valueOf(count)); //It won't take an integer val, thus convert to str.
             count++; //Count is increasing, once the user visited
             out.println("Welcome "+u );
             out.println("Count of user visiting site is  "+ count);
             
         }
        }
        catch(Exception e){
            out.println("Exeception "+e);
        }    }
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
