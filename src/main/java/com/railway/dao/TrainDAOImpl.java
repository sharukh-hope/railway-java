package com.railway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.railway.entity.Passenger;
import com.railway.entity.Train;
import com.railway.util.DBConnectionUtil;

public class TrainDAOImpl implements TrainDAO {

	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Passenger p;
		List<Train> list = null;
		Train train = null;
		PreparedStatement ps = null;
		public Train getID(){
			try{
				list = new ArrayList<Train>();
				String sql = "SELECT * FROM TrainTable WHERE ArrivalLocation='New Delhi'";
				con = DBConnectionUtil.OpenCon();
				stmt = con.createStatement();
				rs= stmt.executeQuery(sql);
				
				while(rs.next()){
					train = new Train();
					train.setTrainID(rs.getInt("TrainID"));
					train.setTrainName(rs.getString("TrainName"));
					train.setDeptLoc(rs.getString("DepartureLocation"));
					train.setArrLoc(rs.getString("ArrivalLocation"));
					train.setTotcoach(rs.getInt("TotCoaches"));
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return train;
		}
		public List<Train> get(){
			try{
				list = new ArrayList<Train>();
				String sql = "SELECT * FROM TrainTable";
				con = DBConnectionUtil.OpenCon();
				stmt = con.createStatement();
				rs= stmt.executeQuery(sql);
				
				while(rs.next()){
					train = new Train();
					train.setTrainID(rs.getInt("TrainID"));
					train.setTrainName(rs.getString("TrainName"));
					train.setDeptLoc(rs.getString("DepartureLocation"));
					train.setArrLoc(rs.getString("ArrivalLocation"));
					train.setTotcoach(rs.getInt("TotCoaches"));
					list.add(train);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return list;
		}
		
}

