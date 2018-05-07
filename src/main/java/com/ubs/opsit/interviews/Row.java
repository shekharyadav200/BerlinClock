package com.ubs.opsit.interviews;

import java.util.List;

public class Row {
	private List<Lamp> lamps;

	public Row(List<Lamp> lamps) {
		super();
		this.lamps = lamps;
	}

	public List<Lamp> getLamps() {
		return lamps;
	}

	public void setLamps(List<Lamp> lamps) {
		this.lamps = lamps;
	}

	@Override
	public String toString() {
		String s="";
		for(Lamp lamp:lamps){
			s=s+lamp.toString();
		}
		return s;
	}
}