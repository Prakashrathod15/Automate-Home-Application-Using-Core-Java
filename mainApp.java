package com.pankaj.rathod;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
        
		
		// public House(String house_name, int no, String adrress)
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter House Name : ");
		String s = sc.nextLine();
		System.out.println(" Enter number of Rooms ");
		int no = sc.nextInt();
		System.out.println(" Enter Address Only City Name ");
		String ad = sc.next();
		
		House H = new House(s,no,ad);
		
		int stop = 0;
		
		while(stop!=10)
		{
			System.out.println(" 1.Add Room ");
			System.out.println(" 2.Add Device ");
			System.out.println(" 3.See devices ");
			System.out.println(" 4.All details of devices ");
			System.out.println(" 5.Change Status ");
			System.out.println(" 6.Time display ");
			System.out.println(" 7.House details ");
			System.out.println(" 8.Exit ");
			System.out.println("   Enter Your choice ");
			int op = sc.nextInt();
			
			switch(op)
			{
			   case 1:
			   {
				   H.AddRooms();
				   break;
			   }
			   case 2:
			   {
				   int index = SearchRoom(H);
				   H.Rooms_list.get(index).AddDevice();
				   break;
			   }
			   case 3:
			   {
				   int index = SearchRoom(H);
				   H.Rooms_list.get(index).RoomInfo();
				   break;
			   }
			   case 4:
			   {
				   int index = SearchRoom(H);
				   for(int i = 0; i<H.Rooms_list.get(index).device_list.size(); i++)
				   {
					   H.Rooms_list.get(index).device_list.get(i).device_info();
				   }
				   
				   break;
			   }
			   case 5:
			   {
				   int index = SearchRoom(H);
				   changeState(H,index);
				   break;
			   }
			   case 6:
			   {
				   int index = SearchRoom(H);
				   displayTime(H,index);
				   break;
			   }
			   case 7:
			   {
				   H.HouseInfo();
				   break;
			   }
			   case 8:
			   {
				   stop = 10;
				   break;
			   }
			}
		}
		
		

		
	}
	
	
	
	
	
	
	public static void displayTime(House H,int index)
	{
		H.Rooms_list.get(index).RoomInfo();
		System.out.println(" Enter device name ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int device_index = 0;
		int i ;
		for(i = 0; i<H.Rooms_list.get(index).device_list.size();i++)
		{
			if(H.Rooms_list.get(index).device_list.get(i).getName().equals(s))
			{
				  H.Rooms_list.get(index).device_list.get(i).device_info();
				  device_index = i;
				  break;
			}
		}
		
		
		if(i!=H.Rooms_list.get(index).device_list.size())
		{
			System.out.println();
			System.out.println();
		     LocalTime n = LocalTime.now();
		     System.out.println( H.Rooms_list.get(index).device_list.get(device_index).getState()+" from "+ H.Rooms_list.get(index).device_list.get(device_index).getTime());		
		     Duration dur = Duration.between(n,H.Rooms_list.get(index).device_list.get(device_index).getTime());
		     System.out.println(" Hours   : "+dur.toHours());
		     System.out.println(" Minutes : "+dur.toMinutes());
		     System.out.println(" Seconds : "+dur.toSeconds());
		     System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println(" Device Not Found in Room ");
			System.out.println();
		}
		
		
		
		
	}
	
	public static void  changeState(House H,int index)
	{
		H.Rooms_list.get(index).RoomInfo();
		
		System.out.println(" Enter device name ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int device_index = 0;
		int i ;
		for(i = 0; i<H.Rooms_list.get(index).device_list.size();i++)
		{
			if(H.Rooms_list.get(index).device_list.get(i).getName().equals(s))
			{
				  H.Rooms_list.get(index).device_list.get(i).device_info();
				  device_index = i;
				  break;
			}
		}
		
		if(i!=H.Rooms_list.get(index).device_list.size())
		{
		  
		         System.out.println();
			     String state = H.Rooms_list.get(index).device_list.get(device_index).getState();
			     System.out.println(" Current State of device is "+state);
			     System.out.println(" Want to Change State of device 1.yes 2.NO ");
				 int con = sc.nextInt();
				 System.out.println();
		  if(con==1)
		    {
			     if(state=="On")
			     {
			    	 System.out.println();
			    	 H.Rooms_list.get(index).device_list.get(device_index).Off();
			    	 System.out.println();
			     }
			     else if(state=="Off")
			     {
			    	 System.out.println();
			    	 H.Rooms_list.get(index).device_list.get(device_index).On();
			    	 System.out.println();
			     }
		    }
		   
		}
		else
		{
			System.out.println();
			System.out.println(" Entered device not present in the Device List ");
			System.out.println();
		}
		
	}
	
	public static int SearchRoom(House H)
	{
		System.out.println();
		System.out.println(" Enter 1.Kitchen 2.Bedroom 3.Hall 4.WashRoom 5.other ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String s = null;
		int index = -1;
		
		if(no==1)
		{
			s = "Kitchen";
			int i;
			for(i = 0; i<H.Rooms_list.size(); i++)
			{
				if(H.Rooms_list.get(i).Room_name.equals(s))
				{
					 index = i;
					 return index;
				}
			}
			if(i==H.Rooms_list.size())
			{
				System.out.println();
				System.out.println(s+" Room Not Found ");
				System.out.println();
			}
		}
		else if(no==2)
		{
			s = "Bedroom";
			int i;
			for( i = 0; i<H.Rooms_list.size(); i++)
			{
				if(H.Rooms_list.get(i).Room_name.equals(s))
				{
					 index = i;
					 return index;
				}
			}
			if(i==H.Rooms_list.size())
			{
				System.out.println(s+" Room Not Found ");
			}
			
		}
		else if(no==3)
		{
			s = "Hall";
			int i;
			for( i = 0; i<H.Rooms_list.size(); i++)
			{
				if(H.Rooms_list.get(i).Room_name.equals(s))
				{
					 index = i;
					 return index;
				}
			}
			if(i==H.Rooms_list.size())
			{
				System.out.println(s+" Room Not Found ");
			}
			
		}
		else if(no==4)
		{
			s = "Washroom";
			int i;
			for( i = 0; i<H.Rooms_list.size(); i++)
			{
				if(H.Rooms_list.get(i).Room_name.equals(s))
				{
					 index = i;
					 return index;
				}
			}
			if(i==H.Rooms_list.size())
			{
				System.out.println(s+" Room Not Found ");
			}
			
		}
		else if(no==5)
		{
			System.out.println(" Enter room name : ");
			s = sc.nextLine();
			int i;
			for(i = 0; i<H.Rooms_list.size(); i++)
			{
				if(H.Rooms_list.get(i).Room_name.equals(s))
				{
					 index = i;
					 return index;
				}
			}
			
			if(i==H.Rooms_list.size())
			{
				System.out.println(s+" Room Not Found ");
			}
			
		}
		
		return index;
	}

}
