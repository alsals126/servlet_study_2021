package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class input extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�Ѿ�� ���� �޾Ƽ� result = Ȧ��, ¦���������� �־����
		String num = req.getParameter("num");
		int number = Integer.parseInt(num);
		String result = "";
		
		if(number%2 == 0)
			result = "¦��";
		else
			result = "Ȧ��";
		
		req.setAttribute("model", result); //request������ model�̶� ������ ���� result���� �����Ѵ�.
		RequestDispatcher dispatcher = req.getRequestDispatcher("input_result.jsp");
		dispatcher.forward(req, resp);
	}	
}