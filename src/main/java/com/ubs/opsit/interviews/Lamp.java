package com.ubs.opsit.interviews;

public class Lamp {

	ClockColour clockColour;
	boolean On;

	public Lamp(ClockColour clockColour) {
		super();
		this.clockColour = clockColour;
	}

	public ClockColour getClockColour() {
		return clockColour;
	}

	public void setClockColour(ClockColour clockColour) {
		this.clockColour = clockColour;
	}

	public boolean isOn() {
		return On;
	}

	public void setOn(boolean on) {
		On = on;
	}

	@Override
	public String toString() {
		return (isOn())?clockColour.getA():"O";
	}
	
}
	
