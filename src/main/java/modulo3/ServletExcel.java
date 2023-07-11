package modulo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExcel")
public class ServletExcel extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ServletExcel() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//especificar tipo de dcoumento
		response.setContentType("application/vnd.ms-excel");
		//el click sobre el link descargara siguiente documento, //libreria apache poi.apache.org
		response.setHeader("Content-Disposition","attachment;filename=excelEjemploss.xls");
		//no guardar informacion previa y que no guarde cache el navegador
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-store");
		response.setDateHeader("Expires", -1);
		
		//desplegamos informacion
		PrintWriter out = response.getWriter();
		out.print("\tValores");
		out.print("\t1");
		out.print("\t2");
		out.print("Total\t=Suma(");
		out.close();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
