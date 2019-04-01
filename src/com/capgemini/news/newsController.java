package com.capgemini.news;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/getNews" }, loadOnStartup = 1)
public class newsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public newsController() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String path = request.getParameter("paper");
		
		
			if(path.contentEquals("toi")) {
				response.sendRedirect("https://timesofindia.indiatimes.com/");
			}
			
			if(path.contentEquals("economictimes")) {
				response.sendRedirect("https://economictimes.indiatimes.com/");
			}
			
			if(path.contentEquals("maharashtratimes")) {
				response.sendRedirect("https://maharashtratimes.indiatimes.com/");
			}
			
			if(path.contentEquals("dna")) {
				response.sendRedirect("https://www.dnaindia.com/");
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
