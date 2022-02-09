package modelo;

import java.util.Scanner;

public class Exp2 {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
		
		System.out.println("Dgite valor de a ");
		a = entrada.nextDouble();
		 
		System.out.println("Dgite valor de b ");
		b = entrada.nextDouble();
 
		System.out.println("Dgite valor de c ");
		c = entrada.nextDouble();
		
		delta = b * b -4 * a * c ;
		
		System.out.println(" Delta é:" + delta);
		
		if(delta < 0) {
			System.out.println("Não possui raiz real");
		} else {
			r1 = (-b + Math.sqrt(delta))/(2*a);	 
			r2 = (-b - Math.sqrt(delta))/(2*a);	
			
			System.out.println("valor das raizes é " + r1 + " e " + r2);
	

		}
		

		
	}

}
