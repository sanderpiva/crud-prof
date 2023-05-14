package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Post;

@WebServlet(urlPatterns = {"/company/form", "/company/insert"})
public class CompaniesController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = req.getRequestURI();
		//retorna: "crud-manager/company/form"
		
		switch (action) {
		case "/crud-manager/company/form": {
			//PrintWriter p = resp.getWriter();
			//p.print("mapa ok");
			
			CommonsController.listUsers(req);
			//
			req.setAttribute("action", "insert");
			//
			ControllerUtil.forward(req, resp, "/form-company.jsp");
			
			
			break;
		}
		case "/crud-manager/company/update": {
			break;
		}
		default:
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = req.getRequestURI();
		

		switch (action) {
		case "/crud-manager/company/delete":
			
			break;
		case "/crud-manager/company/insert": {
			
			break;
		}
		case "/crud-manager/company/update": {
			
			break;
		}
		default:
			System.out.println("URL inválida " + action);
		}
	}
}
