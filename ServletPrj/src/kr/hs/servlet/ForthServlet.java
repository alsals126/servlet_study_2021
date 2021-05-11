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
	public void init() throws ServletException { //���� �ѹ���
		System.out.println("init() �޼��� ȣ��");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter(); // ��� ��ü ��������
		out.print("<html><head><title>1~10 ���ϱ�</title></head><body>");
		
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		
		out.print(result);
		out.print("</body></html>");
	}
}