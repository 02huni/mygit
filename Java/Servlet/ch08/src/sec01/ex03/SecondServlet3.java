package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet2
 */
@WebServlet("/second3")
public class SecondServlet3 extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out= response.getWriter();
	
	out.println("<html><body>");
	out.println("location을 이용한 redirect 실습입니다.");
	out.println("</body></html>");
	}

}
