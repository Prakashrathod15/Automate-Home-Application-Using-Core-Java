package com.pankaj.rathod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class House {
	
	String House_name;
	int no_rooms;
	String Adrress;
	List<Rooms> Rooms_list;
	
	
	public House(String house_name, int no, String adrress) {
		
		this.House_name = house_name;
		this.no_rooms = no;
		this.Adrress = adrress;
		this.Rooms_list = new ArrayList();
		createRooms();
	}
	
	public void AddRooms()
	{
		System.out.println("\n-------------------------------------------------------------------");
		int op = 0;
		int ok = 0;
		System.out.println(" Enter 1.Kitchen 2.Bedroom 3.Hall 4.WashRoom 5.other ");
		Scanner sc = new Scanner(System.in);
		op = sc.nextInt();
	      
	      if(op==1)
	      {
	    	  Rooms_list.add(new Rooms("Kitchen"));
	    	  ok = 1;
	      }
	      else if(op==2)
	      {
	    	  Rooms_list.add(new Rooms("Bedroom"));
	    	  ok = 1;
	      }
	      else if(op==3)
	      {
	    	  Rooms_list.add(new Rooms("Hall"));
	    	  ok = 1;
	      }
	      else if(op==4)
	      {
	    	  Rooms_list.add(new Rooms("WashRoom"));
	    	  ok = 1;
	      }
	      else if(op==5)
	      {
	    	  System.out.println(" Enter name of Room ");
	    	  String s = sc.next();
	    	  Rooms_list.add(new Rooms(s));
	    	  ok = 1;
	      }
	      
			
			
	      
	      if(ok==1)
	      {
	    	  System.out.println(" Room successfully added in Home ");
	      }
	   System.out.println("\n-------------------------------------------------------------------\n");
		
	}
	
   public void createRooms()
   {
	  // public Rooms(String room_name)
	   int no = this.no_rooms;
	   no--;
	 System.out.println("\n-------------------------------------------------------------------"); 
	   while(no!=-1)
	   {
		   int ok = 0;
		   int op = 0;
	      System.out.println(" Enter 1.Kitchen 2.Bedroom 3.Hall 4.WashRoom ");
	      Scanner sc = new Scanner(System.in);
	       op = sc.nextInt();
	      
	      if(op==1)
	      {
	    	  Rooms_list.add(new Rooms("Kitchen"));
	    	  ok = 1;
	      }
	      else if(op==2)
	      {
	    	  Rooms_list.add(new Rooms("Bedroom"));
	    	  ok = 1;
	      }
	      else if(op==3)
	      {
	    	  Rooms_list.add(new Rooms("Hall"));
	    	  ok = 1;
	      }
	      else if(op==4)
	      {
	    	  Rooms_list.add(new Rooms("WashRoom"));
	    	  ok = 1;
	      }
	      
	      if(ok==1)
	      {
	    	  System.out.println(" Room successfully added in Home ");
	      }
	  
		
	      
	      no--;
	   }
	System.out.println("\n-------------------------------------------------------------------\n");
	   
   }

	public String getHouse_name() {
		return House_name;
	}


	public void setHouse_name(String house_name) {
		House_name = house_name;
	}


	public int getNo_rooms() {
		return this.Rooms_list.size();
	}


	public void setNo_rooms(int no_rooms) {
		this.no_rooms = no_rooms;
	}


	public String getAdrress() {
		return Adrress;
	}


	public void setAdrress(String adrress) {
		Adrress = adrress;
	}


	public List<Rooms> getRooms_list() {
		return Rooms_list;
	}


	public void setRooms_list(List<Rooms> rooms_list) {
		Rooms_list = rooms_list;
	}
	
	public void HouseInfo()
	{
		
		System.out.println("\n-------------------------------------------------------------------");
		System.out.print('\t'+" House Information :: ");
		System.out.println("\n-------------------------------------------------------------------\n");
		System.out.print(" House Name        : "+this.House_name);
		System.out.print('\n');
		System.out.print(" Name of Rooms     : ");
		for(int i = 0; i<Rooms_list.size(); i++)
		{
			if(i==Rooms_list.size()-1)
			{
				System.out.print(Rooms_list.get(i).getRoom_name()+".");
			}
			else
			{
				System.out.print(Rooms_list.get(i).getRoom_name()+" , ");
			}
			
		}
		System.out.print('\n');
		System.out.print(" Number of rooms present in "+ this.getHouse_name()+" is : "+this.getNo_rooms());
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
	}
	
	
	
	

}
