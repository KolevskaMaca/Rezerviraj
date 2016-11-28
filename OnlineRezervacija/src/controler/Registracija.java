package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Korisnik;
import service.RegistracijaService;

/**
 * Servlet implementation class Registracija
 */
@WebServlet("/Registracija")
public class Registracija extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registracija() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Korisnik korisnik=new Korisnik(request.getParameter("ime"),request.getParameter("prezime"),request.getParameter("email"),
				request.getParameter("telefon"),request.getParameter("password"));
		RegistracijaService registracijaService = new RegistracijaService(korisnik);
		if(registracijaService.uspesna()){
			response.sendRedirect("index.html");
		}else{
			request.setAttribute("Greska", "Neuspesna Registracija,Obidi se povtorno");
			request.getRequestDispatcher("Registracija.html").forward(request, response);
		}
	}

}
