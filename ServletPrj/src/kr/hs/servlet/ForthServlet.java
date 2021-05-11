package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class ForthServlet extends HttpServlet{
	@Override
	public void init() throws ServletException { //최초 한번만
		System.out.println("init() 메서드 호출");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter(); // 출력 객체 만들어야함
		out.print("<html><head><title>1~10 더하기</title></head><body>");
		
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		
		out.print(result);
		out.print("</body></html>");
	}
}
