package modelo;

import java.util.Scanner;

public class Menos {
   
	public static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int val1, val2 ,result;
		
		System.out.println("Digite um valor inteiro:");
		val1 = entrada.nextInt();
		System.out.println("Digite um valor inteiro:");
		val2 = entrada.nextInt();
		
		result = val1 - val2;
		
		System.out.println("O primeiro valor menos o segundo e:"+ result);

	}

}
