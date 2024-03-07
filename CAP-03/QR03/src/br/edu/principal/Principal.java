package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, peso1, peso2, peso3;
		System.out.println("Este programa calcula a média entre as notas 1, 2 e 3, utilizando 3 pesos, um para cada nota, por favor digite a seguir a nota 1");
		n1 = sc.nextDouble();
		System.out.println("Por favor digite a nota 2");
		n2 = sc.nextDouble();
		System.out.println("Por favor digite a nota 3");
		n3 = sc.nextDouble();
		System.out.println("Por favor digite o peso 1");
		peso1 = sc.nextDouble();
		System.out.println("Por favor digite o peso 2");
		peso2 = sc.nextDouble();
		System.out.println("Por favor digite o peso 3");
		peso3 = sc.nextDouble();
		double media = (n1*peso1 + n2*peso2 + n3*peso3)/(peso1 + peso2 + peso3);
		System.out.println("A média das notas com seus pesos é: " + media);
		
		sc.close();
	}

}
