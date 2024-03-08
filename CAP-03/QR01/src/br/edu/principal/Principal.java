package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4;
		System.out.println("Este programa calcula a soma entre as notas 1, 2, 3 e 4, por favor digite a seguir a nota 1");
		n1 = sc.nextDouble();
		System.out.println("Por favor digite a nota 2");
		n2 = sc.nextDouble();
		System.out.println("Por favor digite a nota 3");
		n3 = sc.nextDouble();
		System.out.println("Por favor digite a nota 4");
		n4 = sc.nextDouble();
		double soma = n1 + n2 + n3 + n4;
		System.out.println("A soma das 4 notas é: " + soma);
		
		sc.close();
	}

}
