package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RowBuilder {

	public static Row builder(Integer numberOFLamps, ClockColour clockColour) {
		List<Lamp> lamps = new ArrayList<Lamp>(numberOFLamps);
		IntStream.range(0, numberOFLamps).forEach((i) -> lamps.add(new Lamp(clockColour)));
		return new Row(lamps);
	}

	public static Row builder(Integer numberOFLamps, ClockColour clockColourFirst, ClockColour clockColourSecond, int condition) {
		List<Lamp> lamps = new ArrayList<Lamp>(numberOFLamps);
		IntStream.range(1, numberOFLamps+1).forEach((i) -> {
			if(i%3==0)
			lamps.add(new Lamp(clockColourSecond));
			else{
				lamps.add(new Lamp(clockColourFirst));
			}
		});
		return new Row(lamps);
	}
}