package com.pankaj.rathod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rooms {
    
	String Room_name;
	int no_device;
	List<Devices> device_list;
	
	public Rooms(String room_name) {
		//super();
		Room_name = room_name;
		this.no_device = 0;
		this.device_list = new ArrayList();
	}
	
	public void AddDevice()
	{
		int op = 0;
		System.out.println(" Select Device Type : \n 1.Electronic Device \n 2.Plubing Device ");
		Scanner sc = new Scanner(System.in);
		op = sc.nextInt();
		
		
		if(op==1)
		{

			System.out.println("\n-------------------------------------------------------------------");
			//int p = 0;
			int ok = 0;
			System.out.println(" Enter 1.Television 2.Fan 3.Lights 4.other ");
			  int p = sc.nextInt();
		     
		      if(p==1)
		      {
		    	  System.out.println(" Enter device color ");
		    	  String col = sc.next();
		    	  device_list.add(new Electronic_devices("Television",col));
		    	  ok = 1;
		    	  this.no_device = +1;
		      }
		      else if(p==2)
		      {
		    	  
		    	    System.out.println(" Enter device color ");
					String col = sc.next();
					device_list.add(new Electronic_devices("Fan",col));
					this.no_device = +1;
					ok =1;
					
		      }
		      else if(p==3)
		      {
		    	  System.out.println(" Enter device color ");
		    	  String col = sc.next();
		    	  device_list.add(new Electronic_devices("Lights",col));
		    	  ok = 1;
		    	  this.no_device = +1;
		      }
		      else if(p==4)
		      {
		    	  System.out.println(" Enter name of device ");
		    	  String s = sc.next();
		    	  System.out.println(" Enter device color ");
		    	  String col = sc.next();
		    	  device_list.add(new Electronic_devices(s,col));
		    	  ok = 1;
		    	  this.no_device = +1;
		      }
		      else
		      {
		    	  //System.out.println();
//		    	  System.out.println("");
		      }
				
				
		      
		      if(ok==1)
		      {
		    	  System.out.println(" Device successfully added in "+this.Room_name);
		      }
		   System.out.println("\n-------------------------------------------------------------------\n");
			
			
			
		}
		else if(op==2)
		{
			// Plubing_devices(String device_name,String col,int pipe,int cap,int air)
			System.out.println("\n-------------------------------------------------------------------");
			int ok = 0;
			System.out.println(" Enter 1.Air Conditioners 2.Showers 3.other ");
			int  p = sc.nextInt();
			 if(p==1)
		      {
				    System.out.println(" Enter device color ");
					String col = sc.next();
					System.out.println(" Enter number of water pipe present in device ");
					int n = sc.nextInt();
					System.out.println(" Enter Water Capacity of device ");
					int w = sc.nextInt();
					System.out.println(" Enter air Filters Present in device ");
					int a = sc.nextInt();
					device_list.add(new Plubing_devices("Air_Conditioners",col,n,w,a));
					this.no_device = +1;
					ok =1;
		      }
		      else if(p==2)
		      {
		    	    System.out.println(" Enter device color ");
					String col = sc.next();
					System.out.println(" Enter number of water pipe present in device ");
					int n = sc.nextInt();
					System.out.println(" Enter Water Capacity of device ");
					int w = sc.nextInt();
					System.out.println(" Enter air Filters Present in device ");
					int a = sc.nextInt();
					device_list.add(new Plubing_devices("Showers",col,n,w,a));
					this.no_device = +1;
					ok =1;
		      }
		      else if(p==3)
		      {
		    	    System.out.println(" Enter device name ");
					String s = sc.next();
					System.out.println(" Enter device color ");
					String col = sc.next();
					System.out.println(" Enter number of water pipe present in device ");
					int n = sc.nextInt();
					System.out.println(" Enter Water Capacity of device ");
					int w = sc.nextInt();
					System.out.println(" Enter air Filters Present in device ");
					int a = sc.nextInt();
					
					device_list.add(new Plubing_devices(s,col,n,w,a));
					this.no_device = +1;
					ok = 1;
		      }
			 
			 if(ok==1)
		      {
		    	  System.out.println(" Device successfully added in "+this.Room_name);
		      }
		   System.out.println("\n-------------------------------------------------------------------\n");
			
			
		}
		else
		{
			System.out.println(" You Entered wrong choice : Retry ");
		}
			  
		
	}

	public String getRoom_name() {
		return Room_name;
	}

	public void setRoom_name(String room_name) {
		Room_name = room_name;
	}

	public int getNo_device() {
		return device_list.size();
	}

	public void setNo_device(int no_device) {
		this.no_device = no_device;
	}

	public List<Devices> getDevice_list() {
		return device_list;
	}

	public void setDevice_list(List<Devices> device_list) {
		this.device_list = device_list;
	}
	
	public void RoomInfo()
	{
		//System.out.println('\n');
		System.out.println("\n-------------------------------------------------------------------");
		System.out.print('\t'+" Room Information :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" Room Name        : "+this.Room_name);
		System.out.print('\n');
		System.out.print(" Name of devices  : ");
		for(int i = 0; i<device_list.size(); i++)
		{
			if(i==device_list.size()-1)
			{
				System.out.print(device_list.get(i).getName()+".");
			}
			else
			{
				System.out.print(device_list.get(i).getName()+" , ");
			}
			
		}
		System.out.print('\n');
		System.out.print(" Number of Device present in "+ this.Room_name+" is : "+this.getNo_device());
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
	}
	
	
	
}
