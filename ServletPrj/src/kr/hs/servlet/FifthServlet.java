package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/htttp")
public class FifthServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init() 메서드 호출");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter(); // 출력 객체 만들어야함
		out.print("<html><head><title>요청방식과 프로토콜</title></head><body>");
		
		out.print("request URI : " + req.getRequestURI() + "<br>");
		out.print("Server name : " + req.getServerName() + "<br>");
		out.print("Server Port : " + req.getServerPort() + "<br>");
		out.print("client addr : " + req.getRemoteAddr() + "<br>");
		out.print("client Host : " + req.getRemoteHost() + "<br>");
		out.print("client Port : " + req.getRemotePort() + "<br>");
		
		out.print("</body></html>");
	}
}