package controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBkonekcija;
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
		Korisnik korisnik=new Korisnik(request.getParameter("ime"),request.getParameter("prezime"),request.getParameter("email"),
				request.getParameter("telefon"),request.getParameter("password"));
			RegistracijaService registracijaService = new RegistracijaService(korisnik);
			if(registracijaService.uspesna()){
			response.sendRedirect("index.html");
		}else{
			request.setAttribute("Greska", "Neuspesna Registracija,Obidi se povtorno");
		request.getRequestDispatcher("registracija.jsp").forward(request, response);
			}
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Korisnik korisnik=new Korisnik();
		try(
				DBkonekcija db = new DBkonekcija();
				Connection konekcija = db.getConnection();){
			System.out.println("Konekcija Uspesna");
			PreparedStatement preparedStatement = konekcija.prepareStatement("insert into Korisnik(Ime, Prezime, Email, Telefon, Password) values ((?),(?),?,?,?)");
			preparedStatement.setString(1, "A");
			preparedStatement.setString(2, "A");
			preparedStatement.setString(3, korisnik.getEmail());
			preparedStatement.setString(4, korisnik.getTelefon());
			preparedStatement.setString(5, korisnik.getPassword());
		
			
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Korisnik korisnik=new Korisnik(request.getParameter("ime"),request.getParameter("prezime"),request.getParameter("email"),
			request.getParameter("telefon"),request.getParameter("password"));
		RegistracijaService registracijaService = new RegistracijaService(korisnik);
		if(registracijaService.uspesna()){
		response.sendRedirect("index.html");
	}else{
		request.setAttribute("Greska", "Neuspesna Registracija,Obidi se povtorno");
	request.getRequestDispatcher("registracija.jsp").forward(request, response);
		}
	}

}
