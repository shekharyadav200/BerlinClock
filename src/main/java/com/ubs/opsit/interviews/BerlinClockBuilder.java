package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;

public class BerlinClockBuilder {

	
	public static BerlinClock builder(){
		List<Row> rows =new  ArrayList<Row>(5);
		rows.add(RowBuilder.builder(1,ClockColour.YELLOW));
		rows.add(RowBuilder.builder(4,ClockColour.RED));
		rows.add(RowBuilder.builder(3,ClockColour.RED));
		rows.add(RowBuilder.builder(11,ClockColour.YELLOW,ClockColour.RED,3));
		rows.add(RowBuilder.builder(4,ClockColour.YELLOW));
		return new BerlinClock(rows);
	}
	
}
