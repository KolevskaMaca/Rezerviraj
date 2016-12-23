package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MeniDao;
import model.Desert;
import model.Meni;
import model.Pici;
import model.Pijalok;
import model.Salati;
import model.Sendvici;
import model.Skara;
import model.TopliNapitoci;
import service.MeniService;

/**
 * Servlet implementation class RezervirajMeni
 */
@WebServlet("/RezervirajMeni")
public class RezervirajMeni extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RezervirajMeni() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// MeniService meniService= new MeniService();

		MeniDao meniDao = new MeniDao();
		
		List<TopliNapitoci> topliNapitoci = meniDao.listajNapitoci();	
		request.setAttribute("topliNapitoci", topliNapitoci);
			
		List<Skara> skaraobj=meniDao.listajSkara();		
		request.setAttribute("skaraobj", skaraobj);
		
		List<Sendvici> sendviciobj=meniDao.listajSendvici();		
		request.setAttribute("sendviciobj", sendviciobj);

		List<Salati> salatiobj=meniDao.listajSalati();		
		request.setAttribute("salatiobj", salatiobj);
		
		List<Pijalok> pijalokobj=meniDao.listajPijalok();		
		request.setAttribute("pijalokobj", pijalokobj);
		
		List<Pici> piciobj=meniDao.listajPici();		
		request.setAttribute("piciobj", piciobj);
		
		List<Desert> desertobj=meniDao.listajDesert();		
		request.setAttribute("desertobj", desertobj);	
		
		request.getRequestDispatcher("/rmeni.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ime=request.getParameter("ime");
		String tn =request.getParameter("topliNapitoci");
		String sk=request.getParameter("skaraobj");
		String sl=request.getParameter("salatiobj");
		String pk=request.getParameter("pijalokobj");
		String pc=request.getParameter("piciobj");
		String dt=request.getParameter("desertobj");
		String sn=request.getParameter("sendviciobj");
		
		Meni meni=new Meni();
		System.out.println(meni);
		MeniDao meniDao=new MeniDao();
		meniDao.vnesuvanje(ime,Integer.parseInt(tn),Integer.parseInt(sk),Integer.parseInt(sl),Integer.parseInt(pk),Integer.parseInt(pc),Integer.parseInt(dt), Integer.parseInt(sn));
		
		response.sendRedirect("RezervirajMeni");
		
	}

}
