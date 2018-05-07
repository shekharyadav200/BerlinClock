package com.ubs.opsit.interviews;

public enum ClockColour {
	RED("R"), YELLOW("Y");
	String a;

	private ClockColour(String a) {
		this.a = a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

}