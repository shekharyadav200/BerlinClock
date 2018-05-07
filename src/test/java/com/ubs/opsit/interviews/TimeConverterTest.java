package com.ubs.opsit.interviews;

import org.junit.Test;

import junit.framework.Assert;

public class TimeConverterTest {

	@Test
	public void convertTime() {
		TimeConverter converter = new TimeConverterImpl();
		System.out.println(converter.convertTime("10:59:13"));
		;
		Assert.assertEquals("O/nRROO/nOOO/nYYRYYRYYRYY/nYYYY/n", converter.convertTime("10:59:13"));
	}

	@Test
	public void testHours() {
		TimeConverter converter = new TimeConverterImpl();

		Assert.assertEquals("O/nRRRR/nRRR/nOOOOOOOOOOO/nOOOO/n", converter.convertTime("23:00:00"));
	}

	@Test
	public void testMinute() {
		TimeConverter converter = new TimeConverterImpl();

		Assert.assertEquals("O/nOOOO/nOOO/nYYRYYRYYRYY/nYYYY/n", converter.convertTime("00:59:00"));
	}

	@Test
	public void testSecond() {
		TimeConverter converter = new TimeConverterImpl();
		Assert.assertEquals("Y/nOOOO/nOOO/nOOOOOOOOOOO/nOOOO/n", converter.convertTime("00:00:15"));
	}

	@Test
	public void testTwentHour() {
		TimeConverter converter = new TimeConverterImpl();
		Assert.assertEquals("O/nOOOO/nOOO/nOOOOOOOOOOO/nOOOO/n", converter.convertTime("24:00:00"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullTime() {
		TimeConverter converter = new TimeConverterImpl();
		converter.convertTime(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidSeconds() {
		TimeConverter converter = new TimeConverterImpl();
		converter.convertTime("10:59:113");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidHours() {
		TimeConverter converter = new TimeConverterImpl();
		converter.convertTime("110:59:13");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidMinutes() {
		TimeConverter converter = new TimeConverterImpl();
		System.out.println(converter.convertTime("10:159:13"));
		;
		Assert.assertEquals("O/nRROO/nOOOO/nYYRYYRYYRYY/nYYYY/n", converter.convertTime("10:59:13"));
	}

}