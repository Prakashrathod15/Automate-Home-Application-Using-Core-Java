package com.pankaj.rathod;

import java.time.LocalTime;

public class Plubing_devices implements Devices {

	
	String device_category;
	String device_name;
	String color;
	int device_no;
	String status;
	int number_of_pipes;
	int water_capacity;
	int number_of_air_filters;
	LocalTime t;
	
	
	public Plubing_devices(String device_name,String col,int pipe,int cap,int air) {
		
		this.device_category = "Plubing Device ";
		this.device_name = device_name;
		this.color = col;
		this.device_no = 1;
		this.status = "Off";
		this.t = LocalTime.now();
		this.number_of_pipes = pipe;
		this.water_capacity = cap;
		this.number_of_air_filters = air;
		
	}
	
	

	public int getNumber_of_pipes() {
		return number_of_pipes;
	}



	public void setNumber_of_pipes(int number_of_pipes) {
		this.number_of_pipes = number_of_pipes;
	}



	public int getWater_capacity() {
		return water_capacity;
	}



	public void setWater_capacity(int water_capacity) {
		this.water_capacity = water_capacity;
	}



	public int getNumber_of_air_filters() {
		return number_of_air_filters;
	}



	public void setNumber_of_air_filters(int number_of_air_filters) {
		this.number_of_air_filters = number_of_air_filters;
	}



	public String getDevice_category() {
		return device_category;
	}



	public void setDevice_category(String device_category) {
		this.device_category = device_category;
	}



	public String getDevice_name() {
		return device_name;
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
	

	@Override
	public void device_info() {
		


		System.out.println("\n-------------------------------------------------------------------");
		System.out.print('\t'+"            Device Information :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Device Category  : "+this.device_category);
		System.out.print('\t'+" Device Name      : "+ this.device_name);
		System.out.print('\n');
		System.out.print('\n');
		System.out.print(" Device Color     : "+ this.color);
		System.out.print('\t'+"         Number of filter : "+ this.number_of_air_filters);
		System.out.print('\n');
		System.out.print('\n');
		System.out.print(" Device Number    : "+ this.device_no);
		System.out.print('\t'+"                 Device Status    : "+ this.status);
		System.out.print('\n');
		System.out.print('\n');
		System.out.print(" Water Capacity   : "+ this.water_capacity);
		System.out.print('\t'+"                 Number of Pipe   : "+ this.number_of_pipes);
		System.out.print('\n');
		
		
		
		System.out.println("\n--------------------------------------------------------------------\n");
		//return true;
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.device_name;
	}



	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return this.status;
	}



	@Override
	public LocalTime getTime() {
		// TODO Auto-generated method stub
		return this.getT();
	}
	

}
