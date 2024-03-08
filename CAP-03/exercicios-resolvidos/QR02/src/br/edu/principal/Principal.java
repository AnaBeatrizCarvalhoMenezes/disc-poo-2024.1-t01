package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;
		System.out.println("Este programa calcula a média entre as notas 1, 2 e 3, por favor digite a seguir a nota 1");
		nota1 = sc.nextDouble();
		System.out.println("Por favor digite a nota 2");
		nota2 = sc.nextDouble();
		System.out.println("Por favor digite a nota 3");
		nota3 = sc.nextDouble();
		double media = (nota1 + nota2 + nota3)/3;
		System.out.println("A média das 3 notas é: " + media);
		
		sc.close();
	}

}
