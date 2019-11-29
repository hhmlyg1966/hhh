package com.scmpi.book.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.scmpi.book.entity.Student;

public class RegistEXServlet extends HttpServlet {

		
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		String sname = request.getParameter("sName");
		String sno = request.getParameter("sno");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		int age1=Integer.parseInt(age);
		Student s=new Student();
		s.setName(sname);
		s.setNo(sno);
		s.setSex(sex);
		s.setAge(age1);
		
		HttpSession session=request.getSession();
		session.setAttribute("register", s);
		response.sendRedirect("show.jsp");
		
	}

}
