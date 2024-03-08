package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, r2, r3 = 0;
		System.out.println("Este programa calcula equações a partir de um número da sua escolha");
		System.out.println("Por favor digite um número qualquer, positivo e maior que zero: ");
		num = sc.nextDouble();
		quad = Math.pow(num, 2);
		System.out.println("Este é o número ao quadrado " + quad);
		cubo = Math.pow(num, 3);
		System.out.println("Este é o número ao cubo " + cubo);
		r2 = Math.sqrt(num);
		System.out.println("Este é o valor da raiz quadrada " + num + " = " + r2);
		r3 = Math.cbrt(num);
		System.out.println("Este é o valor da raiz cúbica de " + num + " = " + r3);
		sc.close();
	}

}
