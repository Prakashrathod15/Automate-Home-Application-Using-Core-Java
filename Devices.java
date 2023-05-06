
package com.pankaj.rathod;

import java.time.LocalTime;

public interface Devices {
	
	boolean On();
	boolean Off();
    void device_info();
    LocalTime getTime();
	String getName();
	String getState();
	

}
