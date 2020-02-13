package com.railway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.railway.entity.Passenger;
import com.railway.util.DBConnectionUtil;

//import java.io.FileOutputStream;
//import java.io.IOException;

public class PassengerDAOImpl implements PassengerDAO {
//	ObjectMapper mapper = new ObjectMapper();
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	List<Passenger> list = null;
	Passenger passenger = null;
	PreparedStatement ps = null;
	public List<Passenger> get() {	
		try{
			list = new ArrayList<Passenger>();
			String sql = "SELECT * FROM PassengerTable";
			con = DBConnectionUtil.OpenCon();
			stmt = con.createStatement();
			rs= stmt.executeQuery(sql);
			
			while(rs.next()){
				passenger = new Passenger();
				passenger.setId(rs.getInt("PID"));
				passenger.setFname(rs.getString("Fname"));
				passenger.setLname(rs.getString("Lname"));
				passenger.setDob(rs.getString("DOB"));
				passenger.setEmail(rs.getString("Email"));
				passenger.setPassword(rs.getString("Password"));
				passenger.setPhoneNumber(rs.getString("PhoneNumber"));
				passenger.setAlternateNumber(rs.getString("AlternateNumber"));
				list.add(passenger);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
//		 try{String json = mapper.writeValueAsString(list);
//	      System.out.println(json);
//	      FileOutputStream fileOutputStream = new FileOutputStream("passenger.json");
//	      mapper.writeValue(fileOutputStream, list);
//	      fileOutputStream.close();
//		 }
//		 catch (IOException e) { 
//	            e.printStackTrace(); 
//	        } 
		return list;
	}

	public Passenger create(Passenger p) {
		try{
			String sql1 = "INSERT INTO PassengerTable VALUES('"+p.getFname()+"','"+p.getLname()+"','"+p.getDob()+"','"+p.getEmail()+"','"+p.getPassword()+"','"+p.getPhoneNumber()+"','"+p.getAlternateNumber()+"')";
			con = DBConnectionUtil.OpenCon();
			ps = con.prepareStatement(sql1);
			ps.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
//		list.add(p);
		return p;
	}

}
