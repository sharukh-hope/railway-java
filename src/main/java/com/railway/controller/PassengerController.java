package com.railway.controller;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.railway.dao.PassengerDAO;
import com.railway.dao.PassengerDAOImpl;
import com.railway.entity.Passenger;

public class PassengerController extends HttpServlet {
	ObjectMapper mapper = new ObjectMapper();
	List<Passenger> list = new ArrayList<Passenger>();
	
	private static final long serialVersionUID = 1L;
	PassengerDAO passengerDAO = null;
	public PassengerController() {
		passengerDAO = new PassengerDAOImpl();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		
		list = passengerDAO.get();
		
//		 req.setAttribute("list", list);
//		 req.getRequestDispatcher("/index.jsp").forward(req, resp);
		 
		try{String json = mapper.writeValueAsString(list);
	      System.out.println(json);
	      PrintWriter out = resp.getWriter();
	      resp.setContentType("application/json");
	      resp.setCharacterEncoding("UTF-8");
	      out.print(json);
	      out.flush();
		 }
		 catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	};
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
				try{
				String json = "";
				while((json = br.readLine()) != null){
					sb.append(json).append('\n');
					}
				System.out.println(sb);
				json=sb.toString();
				Passenger p1 = mapper.readValue(json, Passenger.class);
				resp.setContentType("application/json"); 	
				passengerDAO.create(p1);
				list.add(p1);
				mapper.writeValue(resp.getOutputStream(), list);
				}finally {
			        br.close();
			    }
				
//		Passenger p1 = mapper.readValue(json, Passenger.class);
//		resp.setContentType("application/json"); 	
//		passengerDAO.create(p1);
//		list.add(p1);
//		mapper.writeValue(resp.getOutputStream(), list);
//		
		
		
	}
}
//String Fname1 = req.getParameter("Fname");
//String Lname1 = req.getParameter("Lname");
//String dob = req.getParameter("dob");
//String PhNum1 = req.getParameter("PhNum");
//String AlNum1 = req.getParameter("AlNum");
//String email1 = req.getParameter("email");
//String psw1 = req.getParameter("psw");
//String psw_repeat1 = req.getParameter("psw-repeat");
//Passenger p = new Passenger();
//p.setFname(Fname1);
//p.setLname(Lname1);
//p.setDob(dob);
//p.setEmail(email1);
//p.setPassword(psw1);
//p.setPhoneNumber(PhNum1);
//p.setAlternateNumber(AlNum1);
//req.getRequestDispatcher("/record.jsp").forward(req, resp);