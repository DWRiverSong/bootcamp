package bootcamp;

import java.io.*;
import java.util.*;

//Celcius to Fahrenheit
public class Conversion {

	public static void main(String[] args) {
		double temperature;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Temperature in Celcius: ");
		temperature = input.nextDouble();
		temperature = (temperature * 9/5.0)+32;
		System.out.println("Temperature in Fahrenheit = " + temperature);
	}
}
