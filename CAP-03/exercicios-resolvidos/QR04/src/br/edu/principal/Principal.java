package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, novosal;
		System.out.println("Este programa calcula o novo salário de um funcionário após um aumento de 25%");
		System.out.println("Por favor digite o salário anterior ao aumento:");
		sal = sc.nextDouble();
		novosal = sal + sal * 25/100;
		System.out.println("Seu novo salário é: " + novosal);
		
		sc.close();
	}

}
