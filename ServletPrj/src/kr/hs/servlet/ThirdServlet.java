package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{
	@Override
	public void init() throws ServletException { //최초 한번만
		System.out.println("init() 메서드 호출");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter(); // 출력 객체 만들어야함
		out.print("<html><head><title>홀짝판별</title></head><body>");
		
		int a = 3;
		if(a%2 == 0) {
			out.print("짝수입니다");
		}else {
			out.print("홀수입니다");
		}
		
		out.print("</body></html>");
	}
}
