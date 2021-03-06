package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") //localhost:8088/hi로 접속했을 때 이 클래스를 실행해라
public class FirstServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init() 메서드 호출");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() 호출");
	}
}
