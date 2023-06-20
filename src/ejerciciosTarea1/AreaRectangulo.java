package ejerciciosTarea1;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora de Area de un Rectangulo");
		System.out.println("Ingresa la longitud ");
		double base = input.nextDouble();
		
		System.out.println("Ingresa la Altura:");
		double altura = input.nextDouble();
		
			double area = (base * altura);
			
			
		System.out.println("El area del rectangulo es: " +area);	
	
		input.close(); //fin de Scanner
		
	}

}
