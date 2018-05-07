package com.ubs.opsit.interviews;

import java.util.List;

public class BerlinClock {

	private List<Row> rows;

	public BerlinClock(List<Row> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		String s="";
		for(Row row:rows){
			s=s+row.toString()+"/n";
		}
		 return s;
	}

	public Row getSecondRow() {
		return rows.get(0);
	}

	public Row getFirstHourRow() {
		return rows.get(1);
	}

	public Row getSecondHourRow() {
		return rows.get(2);
	}

	public Row getFirstMinuteRow() {
		return rows.get(3);
	}

	public Row getSecondMinuteRow() {
		return rows.get(4);
	}

}