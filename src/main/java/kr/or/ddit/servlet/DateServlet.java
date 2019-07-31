package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String time = sdf.format(date);
				
		
		
		PrintWriter pw = resp.getWriter();
		pw.write("<html>");
		pw.write("	<head>");
		pw.write("		<title>helloServlet</title>");
		pw.write("	</head>");
		pw.write("	<body>");
		pw.write("		<h1>hello, today : " + time + "</h1>");
		pw.write("	</body>");
		pw.write("</html>");

	}
}
