package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter(); // 출력 객체 만들어야함
		out.print("<html><head><title>LOGIN PRINT</title></head><body>");
		
		out.print("id> " + req.getParameter("id") + "<br>"); 
		out.print("pw> " + req.getParameter("pw") + "<br>");
		out.print("name> " + req.getParameter("name") + "<br>");
		out.print("hobby> ");
		String[] hobby = req.getParameterValues("hobby");
		for(String i : hobby) {
			out.print(i + " ");
		}
		out.print("<br>");
		out.print("gender> " + req.getParameter("gender") + "<br>");
		out.print("job> " + req.getParameter("job") + "<br>");
		out.print("aboutMe> " + req.getParameter("aboutMe") + "<br>");
		
		out.print("</body></html>");
	}
}
