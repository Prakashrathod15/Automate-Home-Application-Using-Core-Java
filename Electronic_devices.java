package com.pankaj.rathod;

import java.time.LocalDate;
import java.time.LocalTime;

public class Electronic_devices implements Devices {

	String device_category;
	String device_name;
	String color;
	int device_no;
	String status;
	LocalTime t;
	
	
	
	
	public Electronic_devices(String device_name, String col) {
		super();
		this.device_category = "Electronic Device";
		this.color = col;
		this.device_name = device_name;
		this.device_no = 1;
		this.status = "Off";
		this.t = LocalTime.now();
	}
	
	

	public String getDevice_category() {
		return device_category;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public LocalTime getT() {
		return t;
	}



	public void setT(LocalTime t) {
		this.t = t;
	}



	public void setDevice_category(String device_category) {
		this.device_category = device_category;
	}



	public String getDevice_name() {
		return device_name;
	}



	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}



	public int getDevice_no() {
		return device_no;
	}



	public void setDevice_no(int device_no) {
		this.device_no = device_no;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public boolean On() {
		
		this.t = LocalTime.now();
		this.status = "On";
		System.out.println("\n-------------------------------------------------------------------");
		System.out.print('\t'+"                 "+this.device_name+" : is On :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		
		return true;
	}
	
	

	@Override
	public boolean Off() {
	
		this.t = LocalTime.now();
		this.status = "Off";
		System.out.println("\n-------------------------------------------------------------------");
		System.out.print('\t'+"                 "+this.device_name+" : is Off :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		
		return true;
	}
	
	public void device_info()
	{
	
		System.out.println("\n-------------------------------------------------------------------");
		System.out.print('\t'+"            Device Information :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Device Category  : "+this.device_category);
		System.out.print('\t'+" Device Name   : "+ this.device_name);
		System.out.print('\n');
		System.out.print('\n');
		System.out.print(" Device Color     : "+ this.color);
		System.out.print('\n');
		System.out.print('\n');
		System.out.print(" Device Number    : "+ this.device_no);
		System.out.print('\t'+"                 Device Status : "+ this.status);
		System.out.print('\n');
		
		
		
		System.out.println("\n--------------------------------------------------------------------\n");
		//return true;
	}



	@Override
	public String getName() {
		
		return this.device_name;
		
	}



	@Override
	public String getState() {
		
		return this.status;
	}



	@Override
	public LocalTime getTime() {
		// TODO Auto-generated method stub
		return this.getT();
	}


}
