package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MeniDao;
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
		System.out.println(meniDao.listajNapitoci());
		System.out.println("NESTO");
		request.setAttribute("topliNapitoci", topliNapitoci);
		request.getRequestDispatcher("/rmeni.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
