package aulascanner.aula;

import java.util.Scanner;
public class Porcentagem {

	public static void main(String ... args ) {
		
	
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Informe um numero, por favor:");
			
			double num1 = scanner.nextDouble();
			
			System.out.println("Informe qual a porcentagem que deseja calcular");
			
			double num2 = scanner.nextDouble();
			
			System.out.println(num2 + " % de " + num1 + " é o valor de: ");
			
			double percentual=(num2/100*num1);
			
			System.out.println(percentual);
			
	}
}
