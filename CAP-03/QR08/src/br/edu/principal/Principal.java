package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dep, taxa, rend, total = 0;
		System.out.println("O programa a seguir calcula o valor da taxa de juros de um depósito, o valor do rendimento e o valor total depois do rendimento");
		System.out.println("Por favor digite o valor depositado:");
		dep = sc.nextDouble();
		System.out.println("Por favor digite o valor da tava de juros do depósito:");
		taxa = sc.nextDouble();
		rend = dep * taxa/100;
		System.out.println("Este foi o seu rendimento: " + rend);
		total = rend + dep;
		System.out.println("Este é o valor total depois do seu rendimento: " + total);
		sc.close();
	}

}
