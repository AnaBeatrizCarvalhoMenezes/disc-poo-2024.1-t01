package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, r1, r2 = 0;
		System.out.println("Este programa recebe dois números maiores que zero, calcula e mostra um elevado ao outro");
		System.out.println("Escreva o primeiro número:");
		num1 = sc.nextDouble();
		System.out.println("Escreva o segundo número:");
		num2 = sc.nextDouble();
		r1 = Math.pow(num1, num2);
		r2 = Math.pow(num2, num1);
		System.out.println("O número " + num1 + " elevado a " + num2 + " é igual a = " + r1);
		System.out.println("O número " + num2 + " elevado a " + num1 + " é igual a = " + r2);
		sc.close();
	}

}
