package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, salreceber, imp;
		System.out.println("Este programa calcula o novo salário de um trabalhador a partir de uma gratificação de R$50 e imposto de 10% sobre o salário base");
		System.out.println("Por favor digite o seu salário atual:");
		sal = sc.nextDouble();
		imp = sal * 10/100;
		salreceber = (sal + 50) - imp;
		System.out.println("Seu novo salário é: " + salreceber);
		sc.close();
	}

}
