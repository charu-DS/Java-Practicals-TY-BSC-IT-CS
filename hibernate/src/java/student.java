
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;
import org.hibernate.cfg.*;
import p1.poji;

/**
 *
 * @author Charu Saraswat
 */
@WebServlet(urlPatterns = {"/student"})
public class student extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String un=request.getParameter("t1");
           String password=request.getParameter("t2");
           String email=request.getParameter("t3");
           String country=request.getParameter("t4");
           SessionFactory sf=new Configuration().configure().buildSessionFactory();
           Session s=sf.openSession();
           Transaction t=s.beginTransaction();
           poji p1=new poji();
           p1.setUsername(un);
           p1.setPassword(password);
           p1.setEmail(email);
           p1.setCountry(country);
           s.persist(p1);
           t.commit();
           s.close();
           sf.close();
           out.println("success");
           
        }
        catch(Exception e){
            out.println("Exception "+e);
        }
       
    }

     }


