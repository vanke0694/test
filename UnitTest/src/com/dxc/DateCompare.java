package com.dxc;

import java.util.Date;

public class DateCompare {
	public int dateCompare1(Date d1, Date d2){
		return d1.compareTo(d2);
	}
	public boolean dateCompare2(Date d1, Date d2){
		if (d1.compareTo(d2)==0){
			return true;
		}
		return false;
	}
}
