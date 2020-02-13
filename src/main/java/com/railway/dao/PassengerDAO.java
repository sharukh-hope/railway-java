package com.railway.dao;

import java.util.List;

import com.railway.entity.Passenger;

public interface PassengerDAO {
	List<Passenger> get();
	
	
	Passenger create(Passenger p);
}
