package com.ubs.opsit.interviews;

import java.util.stream.IntStream;

public class TimeConverterImpl implements TimeConverter {

	public String convertTime(String aTime) {
		validateInputTime(aTime);
		String[] time = aTime.split(":");
		BerlinClock berlinClock = BerlinClockBuilder.builder();
		if (Integer.valueOf(time[0]) < 24) {
			setRow(berlinClock.getFirstHourRow(), new Integer(time[0]) / 5);
			setRow(berlinClock.getSecondHourRow(), new Integer(time[0]) % 5);
			setRow(berlinClock.getFirstMinuteRow(), new Integer(time[1]) / 5);
			setRow(berlinClock.getSecondMinuteRow(), new Integer(time[1]) % 5);
			setSecondsRow(berlinClock.getSecondRow(), new Integer(time[2]));
		}
		return berlinClock.toString();

	}

	private void setRow(Row row, Integer count) {
		IntStream.range(0, count).forEach(num -> {
			row.getLamps().get(num).setOn(true);
		});

	}

	private void setSecondsRow(Row row, Integer seconds) {
		if (seconds % 4 > 1) {
			row.getLamps().get(0).setOn(true);
		}
	}

	public void validateInputTime(String aTime) {
		if (aTime == null || aTime.isEmpty()) {
			throw new IllegalArgumentException("Time is not valid");
		}
		String[] timeArray = aTime.split(":");
		if (timeArray.length != 3) {
			throw new IllegalArgumentException("Time is not valid");
		}

		if (Integer.valueOf(timeArray[0]) > 24) {
			throw new IllegalArgumentException("Hours can't be greater than 24");
		}

		if (Integer.valueOf(timeArray[1]) > 59) {
			throw new IllegalArgumentException("Minutes can't be greater than 59");
		}
		if (Integer.valueOf(timeArray[2]) > 59) {
			throw new IllegalArgumentException("Seconds can't be greater than 59");
		}

		if (Integer.valueOf(timeArray[0]) == 24
				&& (Integer.valueOf(timeArray[1]) != 0 || Integer.valueOf(timeArray[2]) != 0)) {
			throw new IllegalArgumentException("time can't be graeter than 24 hours");

		}
	}
	
	

}
