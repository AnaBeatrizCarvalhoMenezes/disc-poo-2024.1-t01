package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, novosal, perc, aumento;
		System.out.println("Este programa calcula o novo salário de um funcionário após um percentual de aumento aumento");
		System.out.println("Por favor digite o salário anterior ao aumento:");
		sal = sc.nextDouble();
		System.out.println("Por favor digite o percentual de aumento do salário:");
		perc = sc.nextDouble();
		aumento = sal * perc/100;
		System.out.println("Este foi o seu aumento: " + aumento);
		novosal = sal + aumento;
		System.out.println("Seu novo salário é: " + novosal);	
		sc.close();
	}

}
