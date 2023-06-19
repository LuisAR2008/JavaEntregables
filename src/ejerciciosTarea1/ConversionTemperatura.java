package ejerciciosTarea1;

import java.util.Scanner;

public class ConversionTemperatura {

	public static void main(String[] args) {
	  
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese la temperatura en Grados Celcius:");
		float temp = input.nextFloat();
		
		double gradosF = ((1.8*temp)+32),
			   gradosK = (temp + 273.15);

		
		System.out.println("Los Grados Farenheit son: " +gradosF);
		System.out.println("Los Grados Kelvin son: " +gradosK);

		input.close();
	}

}
