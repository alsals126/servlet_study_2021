package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
   // init메서드 추가
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
      int a = 3;
      // 이거 홀짝인지 판별해서 콘솔에 출력
   }
}