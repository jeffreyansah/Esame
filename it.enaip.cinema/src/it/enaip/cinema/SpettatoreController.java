package it.enaip.cinema;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SpettatoreController
 */
@WebServlet("/SpettatoreController")
public class SpettatoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private	String op;
private DaoSpettatore spettatoreDao=DaoSpettatore.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpettatoreController() {
   
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		op=request.getParameter("op");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	private void singInsert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ParseException, SQLException {
		String nome=req.getParameter("nome");
		String cognome=req.getParameter("cognome");
		 int eta= Integer.parseInt(req.getParameter("eta"));
		 String birthDate = req.getParameter("birthDate");
		 Date birth=new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
		 String biglietto=req.getParameter("biglietto");
		Spettatore speta= new Spettatore(nome,cognome,eta,birth,biglietto);
		spettatoreDao.save(speta);
		RequestDispatcher dispatcher = req.getRequestDispatcher("menu.jsp");
		dispatcher.forward(req, resp);
	}
	

}
