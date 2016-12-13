package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;

import dao.RezervirajMasaDao;
import model.RezervaciiMasi;

/**
 * Servlet implementation class RezervirajMasa
 */
@WebServlet("/RezervirajMasa")
public class RezervirajMasa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RezervirajMasa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Ime=request.getParameter("imeto");
		String broj=request.getParameter("masi");
		System.out.println(Ime);
		System.out.println(broj);
		//RezervaciiMasi masa=new RezervaciiMasi(Ime,Integer.parseInt(broj));
		RezervirajMasaDao m=new RezervirajMasaDao();
		m.vnesuvanje(Ime,Integer.parseInt(broj));
		//RezervacijaMasaService rezervirajMasa=new RezervacijaMasaService(masa);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
