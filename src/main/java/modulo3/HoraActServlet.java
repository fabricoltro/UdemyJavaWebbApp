package modulo3;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HoraActServlet
 */
@WebServlet("/HoraActServlet")
public class HoraActServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    
    public HoraActServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("refresh", "1");
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
		String Horasdf = sdf.format(fecha);
		PrintWriter out = response.getWriter();
		out.print("Hora actualizada: " + Horasdf);
		out.close();
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
