package com.lumengjun.entity;

public class Tj {

	private String date1;
	
	private String date2;
	
	private String dtj;

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	public String getDtj() {
		return dtj;
	}

	public void setDtj(String dtj) {
		this.dtj = dtj;
	}

	@Override
	public String toString() {
		return "Tj [date1=" + date1 + ", date2=" + date2 + ", dtj=" + dtj + "]";
	}

	public Tj(String date1, String date2, String dtj) {
		super();
		this.date1 = date1;
		this.date2 = date2;
		this.dtj = dtj;
	}

	public Tj() {
		super();
	}
	
	
	
	
	
	
}
