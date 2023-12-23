package com.decoder.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.decoder.dao.EmpDao;
import com.decoder.entity.Emp;
import com.deconder.conn.HibernateUtil;

@WebServlet("/register")   //mapping here
public class ServletRegister extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String department = req.getParameter("department");
		String salary = req.getParameter("salary");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		Emp emp = new Emp(name,department,salary,email,password);
		System.out.println(emp);
		EmpDao dao = new EmpDao(HibernateUtil.getSessionFactory());
		boolean f = dao.saveEmp(emp);
		if(f==true)
		{
			System.out.println("Emp Register Successfully");
		}
		else
		{
			System.out.println("Emp  Not Register Successfully");
		}
	}
	
}
