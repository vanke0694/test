package com.dxc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;

public class DateCompareUnit extends TestCase{

	@Test
	public void testDateCompare(){
		DateCompare test = new DateCompare();
		Date d1 = null, d2 = null;
		
		SimpleDateFormat textFormat = new SimpleDateFormat("yyyy-MM-dd");
		String paramDateAsString = "2007-12-25";
		try {
			d1 = textFormat.parse(paramDateAsString);
			d2 = textFormat.parse(paramDateAsString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertEquals(0,test.dateCompare1(d1, d2));
		assertTrue(test.dateCompare2(d1, d2));
	}
}
