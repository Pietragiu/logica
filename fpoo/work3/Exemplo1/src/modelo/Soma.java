package modelo;

import java.util.Scanner;

public class soma {
    public static Scanner entrada;
	
    public static void main(String[] args) {
        entrada = new Scanner (System.in);
	    int vall , val2 ,result;
	    
	    System.out.println("Digite um valor inteiro");
	    vall = entrada.nextInt();
	    System.out.println();
	    val2 = entrada.nextInt();
	   
	    result = vall = val2 ;
	   
	    System.out.println(" A soma dos dois valores e;" + result);
	    
     }

}
