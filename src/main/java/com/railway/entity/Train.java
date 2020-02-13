package com.railway.entity;

public class Train{
	private int trainID;
	private String trainName;
	private String deptLoc;
	private String arrLoc;
	private int totcoach;
	public int getTrainID() {
		return trainID;
	}
	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	public String getArrLoc() {
		return arrLoc;
	}
	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}
	public int getTotcoach() {
		return totcoach;
	}
	public void setTotcoach(int totcoach) {
		this.totcoach = totcoach;
	}
	@Override
	public String toString() {
		return "Train [trainID=" + trainID + ", trainName=" + trainName + ", deptLoc=" + deptLoc + ", arrLoc=" + arrLoc
				+ ", totcoach=" + totcoach + "]";
	}


}
