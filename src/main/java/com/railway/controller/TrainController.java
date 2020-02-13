package com.railway.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.railway.dao.TrainDAOImpl;

import com.railway.entity.Train;

public class TrainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ObjectMapper mapper = new ObjectMapper();
	List<Train> list = new ArrayList<Train>();
	TrainDAOImpl trainDAO;
	Train search_res;
    public TrainController() {
        trainDAO = new TrainDAOImpl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		list = trainDAO.get();
		search_res= trainDAO.getID();
//		 req.setAttribute("list", list);
//		 req.getRequestDispatcher("/index.jsp").forward(req, resp);
		 
		try{String json = mapper.writeValueAsString(list);
	      System.out.println(json);
	      PrintWriter out = response.getWriter();
	      response.setContentType("application/json");
	      response.setCharacterEncoding("UTF-8");
	      out.print(json);
	      out.flush();
		 }
		 catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	};

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
