package com.api;

import javax.xml.ws.BindingType;

public class UnitConversionApi {
	
	
	/**
	 * m/s -> km/s
	 * @param speed
	 * @return
	 */
	public static double meterPerSecToKmPerSec(int speed) {
		double input = Double.valueOf(speed);
		return input/1000.0; 
	}
	public static double meterPerSecToKmPerSec(double speed) {
		double input = Double.valueOf(speed);
		return input/1000.0; 
	}
	public static double meterPerSecToKmPerSec(float speed) {
		double input = Double.valueOf(speed);
		return input/1000.0; 
	}
	
	/**
	 * m/s -> km/h
	 * @param speed
	 * @return
	 */
	public static double meterPerSecToKmPerHour (int speed) {
		double input = Double.valueOf(speed);
		return input*3.6;
	}
	public static double meterPerSecToKmPerHour (double speed) {
		double input = Double.valueOf(speed);
		return input*3.6;
	}
	public static double meterPerSecToKmPerHour (float speed) {
		double input = Double.valueOf(speed);
		return input*3.6;
	}
	
	/**
	 * km/h -> m/s 
	 * @param speed
	 * @return
	 */
	public static double kmPerHourToMeterPerSec (int speed) {
		double input = Double.valueOf(speed);
		return input/3.6;
	}
	public static double kmPerHourToMeterPerSec (double speed) {
		double input = Double.valueOf(speed);
		return input/3.6;
	}
	public static double kmPerHourToMeterPerSec (float speed) {
		double input = Double.valueOf(speed);
		return input/3.6;
	}
	
	
}
