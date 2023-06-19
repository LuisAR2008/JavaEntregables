package ejerciciosTarea1;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora de Area de un circulo");		
	    System.out.println("Ingresa el radio del circulo: ");
	    double radio = input.nextDouble();
	    
	    double area= (Math.PI*(radio*radio));
		
	    System.out.println("El area del circulo es: " +area);
		
	    input.close();

	}

}
