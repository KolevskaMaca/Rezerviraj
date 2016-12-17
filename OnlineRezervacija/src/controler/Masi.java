package controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import dao.RezervirajMasaDao;
import model.Korisnik;
import model.RezervaciiMasi;
import service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Masi")
public class Masi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Masi() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RezervirajMasaDao m = new RezervirajMasaDao();
		List<Integer> masicki = m.proverka();
		List<String> rezultat = new ArrayList<String>();

		for (int i = 0; i < 20; i++) {
			if (masicki.contains(i + 1)) {
				rezultat.add("#f44");
			} else {
				rezultat.add("#4f4");
			}
		}

		request.setAttribute("list", rezultat);
		request.getRequestDispatcher("/rmasa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
